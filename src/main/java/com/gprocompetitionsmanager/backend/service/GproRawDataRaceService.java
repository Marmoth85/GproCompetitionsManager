package com.gprocompetitionsmanager.backend.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gprocompetitionsmanager.backend.client.GproApiClient;
import com.gprocompetitionsmanager.backend.mapper.RawDataRaceItemMapper;
import com.gprocompetitionsmanager.backend.model.dto.*;
import com.gprocompetitionsmanager.backend.model.entity.RawManagerResult;
import com.gprocompetitionsmanager.backend.model.entity.RawDataRace;
import com.gprocompetitionsmanager.backend.repository.RawDataRaceRepository;
import com.gprocompetitionsmanager.backend.repository.RawManagerResultRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class GproRawDataRaceService {

    private final GproApiClient gproApiClient;
    private final RawDataRaceRepository rawDataRaceRepository;
    private final RawManagerResultRepository rawManagerResultRepository;

    public Mono<RawDataRaceResponse> getGroupRawDataRace(Long season, Long gp, String group) throws JsonProcessingException {

        Mono<Race> raceMono = gproApiClient.getRaceData(season, gp, group);
        Mono<StartingGrid> startingGridMono = gproApiClient.getQualifData(season, gp, group);
        Mono<RawDataRace> rawDataRaceMono = rawDataRaceRepository.save(RawDataRace.builder().season(season).race(gp).pool(group).build());

        return Mono.zip(startingGridMono, raceMono, rawDataRaceMono)
                .flatMap(tuple -> {
                    List<RaceManager> race = tuple.getT2().getManagers();
                    List<StartingGridManager> q1 = tuple.getT1().getQ1Data();
                    List<StartingGridManager> q2 = tuple.getT1().getQ2Data();
                    List<StartingGridManager> startingGrid = tuple.getT1().getSgData();

                    return Flux.fromIterable(race)
                            .flatMap(racePosition -> {
                                Long managerId = racePosition.getIdm();
                                String q1Position = q1.stream()
                                        .filter(qualifManager -> qualifManager.getIdm().equals(managerId))
                                        .map(StartingGridManager::getPos)
                                        .findFirst()
                                        .orElse(null);
                                String q1LapTime = q1.stream()
                                        .filter(qualifManager -> qualifManager.getIdm().equals(managerId))
                                        .map(StartingGridManager::getLapTime)
                                        .findFirst()
                                        .orElse(null);
                                String q2Position = q2.stream()
                                        .filter(qualifManager -> qualifManager.getIdm().equals(managerId))
                                        .map(StartingGridManager::getPos)
                                        .findFirst()
                                        .orElse(null);
                                String q2LapTime = q2.stream()
                                        .filter(qualifManager -> qualifManager.getIdm().equals(managerId))
                                        .map(StartingGridManager::getLapTime)
                                        .findFirst()
                                        .orElse(null);
                                String sgPosition = startingGrid.stream()
                                        .filter(qualifManager -> qualifManager.getIdm().equals(managerId))
                                        .map(StartingGridManager::getPos)
                                        .findFirst()
                                        .orElse(null);
                                String sgLapTime = startingGrid.stream()
                                        .filter(qualifManager -> qualifManager.getIdm().equals(managerId))
                                        .map(StartingGridManager::getLapTime)
                                        .findFirst()
                                        .orElse(null);
                                RawManagerResult rawManagerResult = RawManagerResult.builder()
                                        .rawRaceId(tuple.getT3().getId())
                                        .gproManagerId(managerId)
                                        .name(racePosition.getName())
                                        .q1Position(q1Position)
                                        .q1LapTime(q1LapTime)
                                        .q2Position(q2Position)
                                        .q2LapTime(q2LapTime)
                                        .startingGridPosition(sgPosition)
                                        .startingGridCumulatedLapTime(sgLapTime)
                                        .racePosition(racePosition.getPos())
                                        .raceTime(racePosition.getRaceTime())
                                        .build();
                                return rawManagerResultRepository.save(rawManagerResult);
                            })
                            .map(RawDataRaceItemMapper::fromEntityToResponse)
                            .collectList();
                })
                .map(mappedDataRaceItems -> RawDataRaceResponse.builder()
                        .season(season)
                        .race(gp)
                        .group(group)
                        .results(mappedDataRaceItems)
                        .build()
                );
    }

}
