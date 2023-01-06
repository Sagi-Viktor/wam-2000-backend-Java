package com.petp.wam.models.DTOs;

import com.petp.wam.models.PlaceModel;
import com.petp.wam.models.SeasonModel;
import com.petp.wam.models.SpeciesModel;
import com.petp.wam.models.types.UsageType;
import lombok.Data;

@Data
public class TicketModelDTO {

    private SeasonModel seasonModel;
    private String customId;
    private String licenseId;
    private String name;
    private SpeciesModel speciesModel;
    private String date;
    private PlaceModel placeModel;
    private UsageType usageType;
}
