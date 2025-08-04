package com.gprocompetitionsmanager.backend.repository;

import com.gprocompetitionsmanager.backend.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
