package com.petp.wam.services;

import com.petp.wam.models.SeasonModel;
import com.petp.wam.repositories.SeasonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeasonService {

    private final SeasonRepository seasonRepository;

    public SeasonModel createSeason(String name) {
        SeasonModel seasonModel = SeasonModel.builder().name(name).build();
        return seasonRepository.save(seasonModel);
    }
}
