package com.gprocompetitionsmanager.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Registration {
    @Id
    @GeneratedValue
    private Long id;

    private String season;

    @ManyToOne
    private Participant participant;
}