package com.gprocompetitionsmanager.backend.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class StartingGridManager {
    private String name;
    private String pos;
    @JsonProperty("IDM")
    private Long idm;
    private String lapTime;
}
