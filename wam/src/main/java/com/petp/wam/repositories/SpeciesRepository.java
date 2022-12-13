package com.petp.wam.repositories;

import com.petp.wam.models.SpeciesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeciesRepository extends JpaRepository<SpeciesModel, Long> {
}
