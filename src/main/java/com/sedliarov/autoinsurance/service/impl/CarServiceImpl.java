package com.sedliarov.autoinsurance.service.impl;

import com.sedliarov.autoinsurance.mapper.CarMapper;
import com.sedliarov.autoinsurance.model.dto.CarDto;
import com.sedliarov.autoinsurance.model.entity.Car;
import com.sedliarov.autoinsurance.repository.CarRepository;
import com.sedliarov.autoinsurance.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService {

  private final CarRepository repository;

  private final CarMapper mapper;

  @Override
  public CarDto createCar(CarDto carDto) {
    Car carToSave = mapper.dtoToEntity(carDto);
    return mapper.entityToDto(repository.save(carToSave));
  }

  @Override
  public CarDto updateCar(UUID id, CarDto carDto) {
    repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id));

    Car carToUpdate = mapper.dtoToEntity(carDto);
    carToUpdate.setCarId(id);
    return mapper.entityToDto(repository.save(carToUpdate));
  }

  @Override
  public void deleteCar(UUID id) {
    repository.deleteById(id);
  }

  @Override
  public CarDto getCarById(UUID id) {
    return mapper.entityToDto(repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id)));
  }

  @Override
  public List<CarDto> getCars() {
    return repository.findAll().stream().map(mapper::entityToDto).toList();
  }
}
