package com.gprocompetitionsmanager.backend.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class Race{

    private String group;
    private int season;
    private int race;
    private List<RaceManager> managers;

}
