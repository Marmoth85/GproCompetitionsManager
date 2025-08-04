package com.gprocompetitionsmanager.backend.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class RegistrationRequest {

    private List<ParticipantDTO> participants;
}
