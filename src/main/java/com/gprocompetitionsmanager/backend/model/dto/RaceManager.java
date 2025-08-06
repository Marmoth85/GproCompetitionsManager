package com.gprocompetitionsmanager.backend.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RaceManager {

    @JsonProperty("IDM")
    private Long idm;
    private String name;
    private String pos;
    private String raceTime;

}
