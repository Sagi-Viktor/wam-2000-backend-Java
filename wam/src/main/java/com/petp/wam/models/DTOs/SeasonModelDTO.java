package com.petp.wam.models.DTOs;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeasonModelDTO {

    private Long id;
    @NonNull
    private String name;
    private String location;
    private boolean isEmptySeason;
    private int recordsNumber;
}


