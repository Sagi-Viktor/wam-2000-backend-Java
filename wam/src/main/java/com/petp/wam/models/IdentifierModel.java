package com.petp.wam.models;


import com.petp.wam.models.types.Place;
import com.petp.wam.models.types.UsageType;
import jakarta.persistence.*;

public class IdentifierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Long seasonId;
    @Column(unique = true)
    private String customId;
    private String licenseId;
    private String name;
    @ManyToOne
    private Long speciesId;
    private String date;
    private Place place;
    private UsageType usage;

}
