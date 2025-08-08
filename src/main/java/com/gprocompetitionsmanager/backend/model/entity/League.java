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
@Table("leagues")
public class League {
    @Id
    private Long id;
    private int level;
    private String poolName;
    private int numberOfPool;
}
