package com.gprocompetitionsmanager.backend.repository;

import com.gprocompetitionsmanager.backend.model.entity.Participant;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ParticipantRepository extends ReactiveCrudRepository<Participant, Long> {
}
