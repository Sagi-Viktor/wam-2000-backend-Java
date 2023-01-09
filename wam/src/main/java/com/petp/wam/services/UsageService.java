package com.petp.wam.services;

import com.petp.wam.models.types.UsageType;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UsageService {


    public HashMap<UsageType, String> getAllUsageTYpe() {
        HashMap<UsageType, String> usageTypeStringHashMap = new HashMap<>();
        for (UsageType value : UsageType.values()) {
            usageTypeStringHashMap.put(value, value.toString());
        }
        return usageTypeStringHashMap;
    }
}
