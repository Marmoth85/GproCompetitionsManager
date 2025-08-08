package com.gprocompetitionsmanager.backend.service;

import com.gprocompetitionsmanager.backend.mapper.LeagueMapper;
import com.gprocompetitionsmanager.backend.model.dto.request.GproSetupStructureRequest;
import com.gprocompetitionsmanager.backend.model.dto.response.GproSetupStructureResponse;
import com.gprocompetitionsmanager.backend.model.entity.GproStructure;
import com.gprocompetitionsmanager.backend.model.entity.League;
import com.gprocompetitionsmanager.backend.repository.GproStructureRepository;
import com.gprocompetitionsmanager.backend.repository.LeagueRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class GproSetupStructureService {

    private final GproStructureRepository gproStructureRepository;
    private final LeagueRepository leagueRepository;


    public Mono<GproSetupStructureResponse> createGproStructure(Long season, GproSetupStructureRequest gproSetupStructureRequest) {

        return gproStructureRepository.existsBySeason(season)
                .flatMap(isGproStructureExists -> {
                    if (isGproStructureExists) {
                        throw new RuntimeException("La structure GPRO a déjà été enregistrée pour la saison " + season);
                    }
                    return Flux.fromIterable(gproSetupStructureRequest.leagues())
                            .flatMap(league -> leagueRepository.existsByLevelAndPoolNameAndNumberOfPool(
                                    league.level(), league.poolName(), league.numberOfPool())
                                    .flatMap(isLeagueExists -> {
                                        if (Boolean.TRUE.equals(isLeagueExists)) {
                                            return leagueRepository.findByLevelAndPoolNameAndNumberOfPool(league.level(), league.poolName(), league.numberOfPool());
                                        }
                                        League leagueEntity = League.builder()
                                                .level(league.level())
                                                .poolName(league.poolName())
                                                .numberOfPool(league.numberOfPool())
                                                .build();
                                        return leagueRepository.save(leagueEntity);
                                    })
                            )
                            .flatMap(league-> {
                                GproStructure gproStructure = GproStructure.builder()
                                        .season(season)
                                        .leagueId(league.getId())
                                        .build();
                                return Mono.zip(gproStructureRepository.save(gproStructure), Mono.just(league));
                            })
                            .flatMap(tuple -> Mono.just(LeagueMapper.fromEntityToResponse(tuple.getT2())))
                            .collectList()
                            .map(listOfLeagues -> GproSetupStructureResponse.builder()
                                    .season(season)
                                    .leagues(listOfLeagues)
                                    .build());
                });
    }
}
