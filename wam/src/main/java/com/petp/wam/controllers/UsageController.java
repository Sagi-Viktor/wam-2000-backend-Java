package com.petp.wam.controllers;

import com.petp.wam.models.types.UsageType;
import com.petp.wam.services.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usage-type")
public class UsageController {

    private final UsageService usageService;

    @GetMapping("/get-all")
    public ResponseEntity<HashMap<UsageType, String>> getAllUsageType() {
        return ResponseEntity.ok(usageService.getAllUsageTYpe());
    }
}
