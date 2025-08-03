package com.gprocompetitionsmanager.backend.service;

import com.gprocompetitionsmanager.backend.dto.ParticipantDTO;
import com.gprocompetitionsmanager.backend.entity.Participant;
import com.gprocompetitionsmanager.backend.mapper.ParticipantMapper;
import com.gprocompetitionsmanager.backend.repository.ParticipantDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParticipantService {

    private final ParticipantDAO participantRepository;

    public void registerParticipants(List<ParticipantDTO> participantsDto, int season) {

        List<Participant> participants = participantsDto.stream().map(ParticipantMapper::fromDtoToParticipant).toList();
        participantRepository.saveAll(participants, season);

    }

}
