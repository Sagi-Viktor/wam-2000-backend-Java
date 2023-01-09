package com.petp.wam.models.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UsageType {

    LEADVA("leadva"),
    MEGVEVE("megvéve"),
    DIAGNOSZTIKA("diagnosztika"),
    KOMPETENCIA("kompetencia"),
    MEGMARADT("megmaradt"),
    GAZOLAS("gázolás");

    private final String s;

    @Override
    public String toString() {
        return s;
    }
}
