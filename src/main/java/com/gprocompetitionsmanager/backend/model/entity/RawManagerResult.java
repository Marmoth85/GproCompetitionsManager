package com.gprocompetitionsmanager.backend.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table("raw_results")
public class RawManagerResult {
    @Id
    private Long id;
    private Long gproManagerId;
    private String name;
    private String q1Position;
    private String q1LapTime;
    private String q2Position;
    private String q2LapTime;
    private String startingGridPosition;
    private String startingGridCumulatedLapTime;
    private String racePosition;
    private String raceTime;

    @Column("raw_race_id")
    private Long rawRaceId;
}
