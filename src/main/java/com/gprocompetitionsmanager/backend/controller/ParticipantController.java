package com.gprocompetitionsmanager.backend.controller;

import com.gprocompetitionsmanager.backend.dto.ParticipantDTO;
import com.gprocompetitionsmanager.backend.service.ParticipantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/participants")
public class ParticipantController {

    private final ParticipantService service;

    @PostMapping("/inscriptions")
    public ResponseEntity<?> inscrireParticipants(@RequestBody List<ParticipantDTO> participants) {
        service.registerParticipants(participants, 105);
        return ResponseEntity.ok().build();
    }
}
