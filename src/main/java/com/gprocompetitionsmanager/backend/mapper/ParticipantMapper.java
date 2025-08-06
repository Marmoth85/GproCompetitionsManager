package com.gprocompetitionsmanager.backend.mapper;

import com.gprocompetitionsmanager.backend.model.dto.ParticipantDTO;
import com.gprocompetitionsmanager.backend.model.entity.Participant;

public class ParticipantMapper {

    public static Participant fromDtoToParticipant(ParticipantDTO participantDTO) {
        return Participant.builder()
                .name(participantDTO.name())
                .gproIdentifier(participantDTO.gproIdentifier())
                .build();
    }
}
