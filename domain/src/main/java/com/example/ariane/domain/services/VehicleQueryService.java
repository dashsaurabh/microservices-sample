package com.example.ariane.domain.services;

import com.example.ariane.domain.aggregates.VehicleAggregate;

import java.util.List;

public interface VehicleQueryService {
    VehicleAggregate getVehicle(Long id);
    List<VehicleAggregate> findVehiclesByMake(String make);
}
