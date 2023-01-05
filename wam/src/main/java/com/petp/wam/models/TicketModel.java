package com.petp.wam.models;


import com.petp.wam.models.types.UsageType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;


@Builder
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class TicketModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private SeasonModel seasonId;
    @Column(unique = true)
    private String customId;
    private String licenseId;
    private String name;
    @ManyToOne
    private SpeciesModel speciesId;
    private String date;
    @OneToOne
    private PlaceModel place;
    private UsageType usage;

}
