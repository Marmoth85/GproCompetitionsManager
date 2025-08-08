package com.gprocompetitionsmanager.backend.model.dto.response;

import lombok.Builder;

import java.util.List;

@Builder
public record GproSetupStructureResponse(Long season, List<LeagueItemResponse> leagues) {
}
