package com.gprocompetitionsmanager.backend.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RaceManager {

    private String name;
    private String pos;
    @JsonProperty("IDM")
    private Long idm;
    private String raceTime;

}
