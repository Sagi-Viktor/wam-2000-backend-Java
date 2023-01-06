package com.petp.wam.repositories;

import com.petp.wam.models.PlaceModel;
import com.petp.wam.models.types.PlaceModelSuffixType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlaceRepository extends JpaRepository<PlaceModel, Long> {

    Optional<PlaceModel> getPlaceModelByNumberAndPlaceModelSuffixType(int number, PlaceModelSuffixType suffixType);
}
