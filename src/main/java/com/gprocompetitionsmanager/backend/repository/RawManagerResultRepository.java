package com.gprocompetitionsmanager.backend.repository;

import com.gprocompetitionsmanager.backend.model.entity.RawManagerResult;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface RawManagerResultRepository extends ReactiveCrudRepository<RawManagerResult, Long> {
}
