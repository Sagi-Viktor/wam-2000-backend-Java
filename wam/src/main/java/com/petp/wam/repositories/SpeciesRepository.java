package com.petp.wam.repositories;

import com.petp.wam.models.SpeciesModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpeciesRepository extends JpaRepository<SpeciesModel, Long> {

    Optional<SpeciesModel> findByName(String name);
}
