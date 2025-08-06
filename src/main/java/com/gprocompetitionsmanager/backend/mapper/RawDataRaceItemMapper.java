package com.gprocompetitionsmanager.backend.mapper;

import com.gprocompetitionsmanager.backend.model.dto.RawDataRaceItemResponse;
import com.gprocompetitionsmanager.backend.model.entity.RawManagerResult;

public class RawDataRaceItemMapper {

    public static RawDataRaceItemResponse fromEntityToResponse(RawManagerResult rawManagerResult) {
        return RawDataRaceItemResponse.builder()
                .id(rawManagerResult.getGproManagerId())
                .name(rawManagerResult.getName())
                .q1Position(rawManagerResult.getQ1Position())
                .q1LapTime(rawManagerResult.getQ1LapTime())
                .q2Position(rawManagerResult.getQ2Position())
                .q2LapTime(rawManagerResult.getQ2LapTime())
                .startingGridPosition(rawManagerResult.getStartingGridPosition())
                .startingGridCumulatedLapTime(rawManagerResult.getStartingGridCumulatedLapTime())
                .racePosition(rawManagerResult.getRacePosition())
                .raceTime(rawManagerResult.getRaceTime())
                .build();
    }

}
