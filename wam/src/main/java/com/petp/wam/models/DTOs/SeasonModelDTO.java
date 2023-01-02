package com.petp.wam.models.DTOs;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeasonModelDTO {

    @NonNull
    private String name;
}


