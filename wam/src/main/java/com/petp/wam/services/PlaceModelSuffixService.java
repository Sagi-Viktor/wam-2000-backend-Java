package com.petp.wam.services;

import com.petp.wam.models.types.PlaceModelSuffixType;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PlaceModelSuffixService {

    public HashMap<PlaceModelSuffixType, String> getAllPlaceModelSuffix() {
        HashMap<PlaceModelSuffixType, String> suffixTypeStringHashMap = new HashMap<>();
        for (PlaceModelSuffixType value : PlaceModelSuffixType.values()) {
            suffixTypeStringHashMap.put(value, value.toString());
        }
        return suffixTypeStringHashMap;
    }
}
