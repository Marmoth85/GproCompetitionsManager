package com.gprocompetitionsmanager.backend.controller;

import com.gprocompetitionsmanager.backend.model.dto.ParticipantDTO;
import com.gprocompetitionsmanager.backend.model.entity.Registration;
import com.gprocompetitionsmanager.backend.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/participants")
public class ParticipantController {

    private final RegistrationService service;

    @PostMapping("/season/{season}/registrations")
    public ResponseEntity<Flux<Registration>> registerParticipants(@PathVariable Long season, @RequestBody List<ParticipantDTO> participants) {
        Flux<Registration> registrations = service.registerParticipants(season, participants);
        return ResponseEntity.ok(registrations);
    }

    @PostMapping("/season/{season}/register")
    public ResponseEntity<Mono<Registration>> registerParticipant(@PathVariable Long season, @RequestBody ParticipantDTO participant) {
        Mono<Registration> registration = service.registerParticipant(season, participant);
        return ResponseEntity.ok(registration);
    }
}
