package com.petp.wam.controllers;

import com.petp.wam.models.DTOs.SeasonModelDTO;
import com.petp.wam.models.SeasonModel;
import com.petp.wam.services.SeasonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/seasons")
public class SeasonController {

    private final SeasonService seasonService;



    @PostMapping("/create")
    public ResponseEntity<SeasonModel> createSeason(@RequestBody SeasonModelDTO seasonModelDTO) {
        SeasonModel season = seasonService.createSeason(seasonModelDTO.getName());
        return ResponseEntity.created(URI.create("api/seasons/"+season.getId())).body(season);
    }
}