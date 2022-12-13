package com.petp.wam.models.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UsageType {

    LEADVA("leadva"),
    MEGVEVE("megvéve"),
    DIAGNOSZTIKA("diagnosztika"),
    KOMPETENCIA("kompetencia"),
    MEGMARADT("megmaradt"),
    GAZOLAS("gázolás");

    private String s;
}
