package com.gprocompetitionsmanager.backend.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gprocompetitionsmanager.backend.model.dto.Race;
import com.gprocompetitionsmanager.backend.model.dto.StartingGrid;
import reactor.core.publisher.Mono;

public interface GproApiClient {
    Mono<Race> getRaceData(Long season, Long gp, String group) throws JsonProcessingException;

    Mono<StartingGrid> getQualifData(Long season, Long gp, String group) throws JsonProcessingException;
}
