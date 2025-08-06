package com.gprocompetitionsmanager.backend.repository;

import com.gprocompetitionsmanager.backend.model.entity.RawDataRace;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface RawDataRaceRepository extends ReactiveCrudRepository<RawDataRace, Long> {
}
