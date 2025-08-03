package com.gprocompetitionsmanager.backend.repository;

import com.gprocompetitionsmanager.backend.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParticipantDAO extends JpaRepository<Participant, Integer> {
    void saveAll(List<Participant> participants, int season);
}
