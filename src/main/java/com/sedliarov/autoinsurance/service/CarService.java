package com.sedliarov.autoinsurance.service;

import com.sedliarov.autoinsurance.model.dto.CarDto;

import java.util.List;
import java.util.UUID;

public interface CarService {
  
  CarDto createCar(CarDto carDto);

  CarDto updateCar(UUID id, CarDto carDto);

  void deleteCar(UUID id);

  CarDto getCarById(UUID id);

  List<CarDto> getCars();
}
