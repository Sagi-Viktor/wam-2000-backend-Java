package com.petp.wam.models;


import com.petp.wam.models.types.UsageType;
import jakarta.persistence.*;
import lombok.*;


@Builder
@Getter
@Setter
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class TicketModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.MERGE)
    private SeasonModel seasonModel;
    @Column(unique = true)
    private String customId;
    private String licenseId;
    private String name;
    @ManyToOne
    private SpeciesModel speciesModel;
    private String date;
    @ManyToOne
    private PlaceModel placeModel;
    private UsageType usageType;

}
