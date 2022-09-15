package com.sedliarov.autoinsurance.controller;

import com.sedliarov.autoinsurance.model.dto.EmployeeDto;
import com.sedliarov.autoinsurance.service.EmployeeService;
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
@RequestMapping("/employees")
public class EmployeeController {

  private final EmployeeService service;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public EmployeeDto createEmployee(@RequestBody EmployeeDto employeeDto) {
    return service.createEmployee(employeeDto);
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<EmployeeDto> getEmployees() {
    return service.getEmployees();
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public EmployeeDto updateEmployee(@PathVariable UUID id, @RequestBody EmployeeDto employeeDto) {
    return service.updateEmployee(id, employeeDto);
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public EmployeeDto getEmployeeById(@PathVariable UUID id) {
    return service.getEmployeeById(id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteEmployee(@PathVariable UUID id) {
    service.deleteEmployee(id);
  }
}
