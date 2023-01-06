package com.petp.wam.models;

import jakarta.persistence.*;
import lombok.*;


@Builder
@Getter
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class SpeciesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
}
