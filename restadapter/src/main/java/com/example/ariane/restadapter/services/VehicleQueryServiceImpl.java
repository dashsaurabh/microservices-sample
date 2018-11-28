package com.example.ariane.restadapter.services;

import com.example.ariane.domain.aggregates.Money;
import com.example.ariane.domain.aggregates.VehicleAggregate;
import com.example.ariane.domain.services.VehicleQueryService;
import com.example.ariane.persistence.entities.Vehicle;
import com.example.ariane.persistence.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleQueryServiceImpl implements VehicleQueryService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public VehicleAggregate getVehicle(Long id) {

        Optional<Vehicle> vehicle = vehicleRepository.findById(id);
        VehicleAggregate vehicleAggregate = new VehicleAggregate();
        vehicleAggregate.setId(vehicle.get().getId());
        vehicleAggregate.setMake(vehicle.get().getMake());
        vehicleAggregate.setModel(vehicle.get().getModel());
        vehicleAggregate.setPrice(new Money(vehicle.get().getAmount(), vehicle.get().getCurrency()));

        return vehicleAggregate;
    }

    @Override
    public List<VehicleAggregate> findVehiclesByMake(String make) {
        return null;
    }
}
