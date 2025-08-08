package com.gprocompetitionsmanager.backend.mapper;

import com.gprocompetitionsmanager.backend.model.dto.response.LeagueItemResponse;
import com.gprocompetitionsmanager.backend.model.entity.League;

public class LeagueMapper {

    public static LeagueItemResponse fromEntityToResponse(League league) {
        return LeagueItemResponse.builder()
                .level(league.getLevel())
                .poolName(league.getPoolName())
                .numberOfPool(league.getNumberOfPool())
                .build();
    }

}
