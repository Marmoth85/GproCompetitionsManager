package com.gprocompetitionsmanager.backend.mapper;

import com.gprocompetitionsmanager.backend.dto.ParticipantDTO;
import com.gprocompetitionsmanager.backend.entity.Participant;

public class ParticipantMapper {

    public static Participant fromDtoToParticipant(ParticipantDTO participantDTO) {
        return Participant.builder()
                .name(participantDTO.name())
                .gproIdentifier(participantDTO.gproIdentifier())
                .build();
    }
}
