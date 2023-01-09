package com.petp.wam.models.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PlaceModelSuffixType {

    ROAD("-es út"),
    AREA(". körzet");

    private final String s;

    @Override
    public String toString() {
        return s;
    }
}
