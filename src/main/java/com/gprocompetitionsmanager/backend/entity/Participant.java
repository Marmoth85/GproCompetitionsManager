package com.gprocompetitionsmanager.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Participant {
    private String firstName;
    private String lastName;
    @Id
    private Long gproIdentifier;

    @OneToMany(mappedBy = "participant")
    private List<Registration> registrations;
}
