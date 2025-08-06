package com.gprocompetitionsmanager.backend.service;

import com.gprocompetitionsmanager.backend.model.dto.ParticipantDTO;
import com.gprocompetitionsmanager.backend.model.entity.Participant;
import com.gprocompetitionsmanager.backend.model.entity.Registration;
import com.gprocompetitionsmanager.backend.mapper.ParticipantMapper;
import com.gprocompetitionsmanager.backend.repository.ParticipantRepository;
import com.gprocompetitionsmanager.backend.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final ParticipantRepository participantRepository;
    private final RegistrationRepository registrationRepository;

    public Flux<Registration> registerParticipants(Long season, List<ParticipantDTO> participantsDto) {

        return Flux.fromIterable(participantsDto).flatMap(dto -> registerParticipant(season, dto));
    }

    public Mono<Registration> registerParticipant(Long season, ParticipantDTO participantDto) {
        Participant participant = ParticipantMapper.fromDtoToParticipant(participantDto);
        return participantRepository
                .save(participant)
                .flatMap(savedParticipant -> {
                    Registration registration = Registration.builder()
                            .season(season)
                            .participantId(savedParticipant.getGproIdentifier())
                            .build();
                    return registrationRepository.save(registration);
                });
    }

}
