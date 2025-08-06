package com.gprocompetitionsmanager.backend.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table("raw_races")
public class RawDataRace {
    @Id
    private Long id;
    private Long season;
    private Long race;
    private String pool;
}
