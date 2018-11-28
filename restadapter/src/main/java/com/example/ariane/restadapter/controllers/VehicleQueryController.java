package com.example.ariane.restadapter.controllers;

import com.example.ariane.domain.aggregates.VehicleAggregate;
import com.example.ariane.domain.services.VehicleQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleQueryController {

    @Autowired
    private VehicleQueryService vehicleQueryService;

    @GetMapping(value = "/{vehicleId}")
    public VehicleAggregate getVehicle(@PathVariable(value = "vehicleId") Long vehicleId){

        return vehicleQueryService.getVehicle(vehicleId);

    }
}
