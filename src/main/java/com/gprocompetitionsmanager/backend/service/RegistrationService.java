package com.gprocompetitionsmanager.backend.service;

import com.gprocompetitionsmanager.backend.dto.ParticipantDTO;
import com.gprocompetitionsmanager.backend.entity.Participant;
import com.gprocompetitionsmanager.backend.entity.Registration;
import com.gprocompetitionsmanager.backend.mapper.ParticipantMapper;
import com.gprocompetitionsmanager.backend.repository.ParticipantRepository;
import com.gprocompetitionsmanager.backend.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final ParticipantRepository participantRepository;
    private final RegistrationRepository registrationRepository;

    public List<Registration> registerParticipants(Long season, List<ParticipantDTO> participantsDto) {

        return participantsDto.stream()
                .map(participantDTO -> registerParticipant(season, participantDTO))
                .toList();
    }

    public Registration registerParticipant(Long season, ParticipantDTO participantDto) {
        Participant participant = ParticipantMapper.fromDtoToParticipant(participantDto);
        participantRepository.save(participant);
        Registration registration = Registration.builder()
                .season(season)
                .participant(participant)
                .build();
        return registrationRepository.save(registration);
    }

}
