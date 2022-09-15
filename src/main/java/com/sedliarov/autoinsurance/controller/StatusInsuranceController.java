package com.sedliarov.autoinsurance.controller;

import com.sedliarov.autoinsurance.model.dto.StatusInsuranceDto;
import com.sedliarov.autoinsurance.service.StatusInsuranceService;
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
@RequestMapping("/status_insurances")
public class StatusInsuranceController {

  private final StatusInsuranceService service;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public StatusInsuranceDto createStatusInsurance(@RequestBody StatusInsuranceDto statusInsuranceDto) {
    return service.createStatusInsurance(statusInsuranceDto);
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<StatusInsuranceDto> getStatusInsurances() {
    return service.getStatusInsurances();
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public StatusInsuranceDto updateStatusInsurance(@PathVariable UUID id,
      @RequestBody StatusInsuranceDto statusInsuranceDto) {
    return service.updateStatusInsurance(id, statusInsuranceDto);
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public StatusInsuranceDto getStatusInsuranceById(@PathVariable UUID id) {
    return service.getStatusInsuranceById(id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteStatusInsurance(@PathVariable UUID id) {
    service.deleteStatusInsurance(id);
  }
}