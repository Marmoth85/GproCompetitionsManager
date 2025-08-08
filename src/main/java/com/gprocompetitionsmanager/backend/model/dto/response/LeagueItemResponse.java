package com.gprocompetitionsmanager.backend.model.dto.response;

import lombok.Builder;

@Builder
public record LeagueItemResponse(int level, String poolName, int numberOfPool) {
}
