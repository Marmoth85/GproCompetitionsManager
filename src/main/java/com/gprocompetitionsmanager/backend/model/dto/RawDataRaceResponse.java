package com.gprocompetitionsmanager.backend.model.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class RawDataRaceResponse {

    private Long season;
    private Long race;
    private String group;
    private List<RawDataRaceItemResponse> results;
}
