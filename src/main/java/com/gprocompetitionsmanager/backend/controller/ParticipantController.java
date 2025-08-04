package com.gprocompetitionsmanager.backend.controller;

import com.gprocompetitionsmanager.backend.dto.ParticipantDTO;
import com.gprocompetitionsmanager.backend.entity.Registration;
import com.gprocompetitionsmanager.backend.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/participants")
public class ParticipantController {

    private final RegistrationService service;

    @PostMapping("/season/{season}/registrations")
    public ResponseEntity<List<Registration>> registerParticipants(@PathVariable Long season, @RequestBody List<ParticipantDTO> participants) {
        List<Registration> registrations = service.registerParticipants(season, participants);
        return ResponseEntity.ok(registrations);
    }

    @PostMapping("/season/{season}/register")
    public ResponseEntity<Registration> registerParticipant(@PathVariable Long season, @RequestBody ParticipantDTO participant) {
        Registration registration = service.registerParticipant(season, participant);
        return ResponseEntity.ok(registration);
    }
}
