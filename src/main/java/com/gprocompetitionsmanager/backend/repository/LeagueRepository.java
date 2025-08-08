package com.gprocompetitionsmanager.backend.repository;

import com.gprocompetitionsmanager.backend.model.entity.League;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface LeagueRepository extends ReactiveCrudRepository<League, Long> {
    Mono<League> findByLevelAndPoolNameAndNumberOfPool(int level, String name, int numberOfPool);

    Mono<Boolean> existsByLevelAndPoolNameAndNumberOfPool(int level, String name, int numberOfPool);
}
