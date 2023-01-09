package com.petp.wam.controllers;


import com.petp.wam.models.SpeciesModel;
import com.petp.wam.services.SpeciesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/species")
public class SpeciesController {

    private final SpeciesService speciesService;

    @GetMapping("/get-all")
    public ResponseEntity<List<SpeciesModel>> getAllSpecies() {
         return ResponseEntity.ok(speciesService.getAllSpecies());
    }
}
