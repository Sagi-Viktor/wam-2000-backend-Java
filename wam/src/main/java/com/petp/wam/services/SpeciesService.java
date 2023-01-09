package com.petp.wam.services;

import com.petp.wam.models.SpeciesModel;
import com.petp.wam.repositories.SpeciesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpeciesService {

    private final SpeciesRepository speciesRepository;


    public List<SpeciesModel> getAllSpecies() {
        return speciesRepository.findAll();
    }
}
