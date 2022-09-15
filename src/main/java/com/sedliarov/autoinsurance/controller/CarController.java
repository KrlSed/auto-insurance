package com.sedliarov.autoinsurance.controller;

import com.sedliarov.autoinsurance.model.dto.CarDto;
import com.sedliarov.autoinsurance.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/cars")
public class CarController {

  private final CarService service;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public CarDto createCar(@RequestBody CarDto carDto) {
    return service.createCar(carDto);
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<CarDto> getCars() {
    return service.getCars();
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public CarDto updateCar(@PathVariable UUID id, @RequestBody CarDto carDto) {
    return service.updateCar(id, carDto);
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public CarDto getCarById(@PathVariable UUID id) {
    return service.getCarById(id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteCar(@PathVariable UUID id) {
    service.deleteCar(id);
  }
}