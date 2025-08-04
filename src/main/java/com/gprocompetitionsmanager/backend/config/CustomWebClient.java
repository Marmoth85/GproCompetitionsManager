package com.gprocompetitionsmanager.backend.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class CustomWebClient {

    @Getter
    private final WebClient webClient;

    public WebClient baseUrl(String baseUrl) {
        if (StringUtils.isBlank(baseUrl)) {
            throw new UnsupportedOperationException("Can't set a null baseUrl");
        }
        return webClient.mutate().baseUrl(baseUrl).build();
    }

}
