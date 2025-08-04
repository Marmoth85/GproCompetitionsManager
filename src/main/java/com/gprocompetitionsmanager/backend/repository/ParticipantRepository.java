package com.gprocompetitionsmanager.backend.repository;

import com.gprocompetitionsmanager.backend.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
