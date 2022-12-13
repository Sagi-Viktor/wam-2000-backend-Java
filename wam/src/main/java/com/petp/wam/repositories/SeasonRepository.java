package com.petp.wam.repositories;

import com.petp.wam.models.SeasonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<SeasonModel, Long> {
}
