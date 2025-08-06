package com.gprocompetitionsmanager.backend.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("participants")
public class Participant {
    @Id
    private Long id;
    private Long gproIdentifier;
    private String name;
}
