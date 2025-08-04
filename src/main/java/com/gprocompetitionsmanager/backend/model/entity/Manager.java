package com.gprocompetitionsmanager.backend.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    private Long gproIdentifier;
    private String name;
}
