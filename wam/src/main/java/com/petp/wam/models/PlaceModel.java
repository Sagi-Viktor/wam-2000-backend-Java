package com.petp.wam.models;

import com.petp.wam.models.types.PlaceModelSuffixType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@Getter
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class PlaceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    private PlaceModelSuffixType placeModelSuffixType;
}
