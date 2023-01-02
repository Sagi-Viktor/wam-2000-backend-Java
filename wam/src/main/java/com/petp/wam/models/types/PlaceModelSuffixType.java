package com.petp.wam.models.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PlaceModelSuffixType {

    ROAD("-es út"),
    AREA(". körzet");

    private String s;
}
