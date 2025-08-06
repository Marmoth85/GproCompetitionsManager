package com.gprocompetitionsmanager.backend.controller;

import com.gprocompetitionsmanager.backend.client.GproApiClient;
import com.gprocompetitionsmanager.backend.model.dto.Race;
import com.gprocompetitionsmanager.backend.model.dto.RawDataRaceResponse;
import com.gprocompetitionsmanager.backend.model.dto.StartingGrid;
import com.gprocompetitionsmanager.backend.model.entity.RawDataRace;
import com.gprocompetitionsmanager.backend.service.GproRawDataRaceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.io.IOException;

@RestController
@RequestMapping("/api/race-data")
@RequiredArgsConstructor
@Slf4j
public class RaceDataController {

    private final GproApiClient gproApiClient;
    private final GproRawDataRaceService gproRawDataRaceService;

    @GetMapping("/all-managers/season/{season}/race/{race}")
    public String getAllManagersRaceData(@PathVariable("season") String season, @PathVariable("race") String race) {
        log.info("getAllManagersRaceData: season={} race={}", season, race);
        return "Bienvenue dans cette API de gestion de compétitions GPRO!!!";
    }

    @GetMapping("/manager/{manager}/season/{season}/race/{race}")
    public Mono<ResponseEntity<Race>> getManagerRaceData(@PathVariable("manager") Long manager, @PathVariable("season") Long season, @PathVariable("race") Long gp) throws IOException {
        log.info("getRaceData: manager={} season={} race={}", manager, season, gp);
        // TODO utiliser un service qui se base sur gproApiClient, mais pas le client directement
        // l'instruction ci-dessous est plus bas niveau et n'est là que pour faire des tests sur les requêtes et mappings
        return gproApiClient.getRaceData(season, gp, "Amateur - 77")
                .map(ResponseEntity::ok);
    }

    @GetMapping("/manager/{manager}/season/{season}/race/{race}/qualifs")
    public Mono<ResponseEntity<StartingGrid>> getManagerQualifData(@PathVariable("manager") long manager, @PathVariable("season") Long season, @PathVariable("race") Long gp) throws IOException {
        log.info("getQualifData: manager={} season={} race={}", manager, season, gp);
        // TODO utiliser un service qui se base sur gproApiClient, mais pas le client directement
        // l'instruction ci-dessous est plus bas niveau et n'est là que pour faire des tests sur les requêtes et mappings
        return gproApiClient.getQualifData(season, gp, "Amateur - 77")
                .map(ResponseEntity::ok);
    }

    @GetMapping("/season/{season}/race/{race}/group/{group}")
    public Mono<ResponseEntity<RawDataRaceResponse>> getManagerRaceData(@PathVariable("season") Long season,
                                                                        @PathVariable("race") Long gp,
                                                                        @PathVariable("group") String group) throws IOException {
        log.info("getGroupRaceData: season={} race={} group={}", season, gp, group);
        return gproRawDataRaceService.getGroupRawDataRace(season, gp, group)
                .map(ResponseEntity::ok);
    }
}
