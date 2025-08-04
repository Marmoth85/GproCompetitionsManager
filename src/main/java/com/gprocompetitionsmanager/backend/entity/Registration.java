package com.gprocompetitionsmanager.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
public class Registration {
    @Id
    @GeneratedValue
    private Long id;

    private Long season;

    @ManyToOne
    private Participant participant;
}