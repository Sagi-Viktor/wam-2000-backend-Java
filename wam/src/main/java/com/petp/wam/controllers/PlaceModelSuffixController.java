package com.petp.wam.controllers;

import com.petp.wam.models.types.PlaceModelSuffixType;
import com.petp.wam.services.PlaceModelSuffixService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/place-suffix")
public class PlaceModelSuffixController {

    private final PlaceModelSuffixService placeModelSuffixService;

    @GetMapping("/get-all")
    public ResponseEntity<HashMap<PlaceModelSuffixType, String>> getAllSuffixType() {
        return ResponseEntity.ok(placeModelSuffixService.getAllPlaceModelSuffix());
    }
}
