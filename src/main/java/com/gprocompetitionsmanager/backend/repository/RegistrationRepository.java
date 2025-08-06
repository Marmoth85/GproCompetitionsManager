package com.gprocompetitionsmanager.backend.repository;

import com.gprocompetitionsmanager.backend.model.entity.Registration;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface RegistrationRepository extends ReactiveCrudRepository<Registration, Long> {
    Mono<Registration> findBySeason(Long season);
}
