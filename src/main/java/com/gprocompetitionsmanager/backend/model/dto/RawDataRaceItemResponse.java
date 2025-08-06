package com.gprocompetitionsmanager.backend.model.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RawDataRaceItemResponse {
    private Long id;
    private String name;
    private String q1Position;
    private String q1LapTime;
    private String q2Position;
    private String q2LapTime;
    private String startingGridPosition;
    private String startingGridCumulatedLapTime;
    private String racePosition;
    private String raceTime;
}
