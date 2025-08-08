package com.gprocompetitionsmanager.backend.repository;

import com.gprocompetitionsmanager.backend.model.entity.GproStructure;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface GproStructureRepository extends ReactiveCrudRepository<GproStructure, Long> {
    Mono<Boolean> existsBySeason(Long season);
}
