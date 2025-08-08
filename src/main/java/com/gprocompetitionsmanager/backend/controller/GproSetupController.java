package com.gprocompetitionsmanager.backend.controller;

import com.gprocompetitionsmanager.backend.model.dto.request.GproSetupStructureRequest;
import com.gprocompetitionsmanager.backend.model.dto.response.GproSetupStructureResponse;
import com.gprocompetitionsmanager.backend.service.GproSetupStructureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/gpro/structure/seasons/{season}")
public class GproSetupController {

    private final GproSetupStructureService gproStructureService;

    //create
    @PostMapping
    public Mono<ResponseEntity<GproSetupStructureResponse>> createGproSetupStructure(
            @PathVariable Long season, @RequestBody GproSetupStructureRequest gproSetupStructureRequest) {

        return gproStructureService.createGproStructure(season, gproSetupStructureRequest)
                .map(ResponseEntity::ok);
    }

    //update

    //delete

}
