package com.gprocompetitionsmanager.backend.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("registrations")
public class Registration {
    @Id
    private Long id; // PK

    private Long season;

    @Column("participant_gpro_identifier") // FK vers participants.gproIdentifier
    private Long participantId;
}