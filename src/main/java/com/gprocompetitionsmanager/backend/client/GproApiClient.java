package com.gprocompetitionsmanager.backend.client;

import com.gprocompetitionsmanager.backend.config.CustomWebClient;
import com.gprocompetitionsmanager.backend.model.dto.Race;
import com.gprocompetitionsmanager.backend.model.dto.StartingGrid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Service
@RequiredArgsConstructor
public class GproApiClient {

    private final CustomWebClient webClient;

    @Value("${raceData.host}")
    private String raceDataUrl;

    @Value("${qualifData.host}")
    private String qualifDataUrl;

    @Value("${gpro.api.access-token}")
    private String accessToken;

    public Mono<Race> getRaceData(int season, int gp, String group) {
        return webClient.baseUrl(raceDataUrl)
                .get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("group", group)
                        .queryParam("season", season)
                        .queryParam("race", gp).build())
                .header(HttpHeaders.AUTHORIZATION, accessToken)
                .header(CONTENT_TYPE, APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(Race.class);
    }

    public Mono<StartingGrid> getQualifData(int season, int gp, String group) {
        return webClient.baseUrl(qualifDataUrl)
                .get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("group", group)
                        .queryParam("season", season)
                        .queryParam("race", gp).build())
                .header(HttpHeaders.AUTHORIZATION, accessToken)
                .header(CONTENT_TYPE, APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(StartingGrid.class);
    }
}
