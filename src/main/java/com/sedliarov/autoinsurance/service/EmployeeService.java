package com.sedliarov.autoinsurance.service;

import com.sedliarov.autoinsurance.model.dto.EmployeeDto;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {

  EmployeeDto createEmployee(EmployeeDto employeeDto);

  EmployeeDto updateEmployee(UUID id, EmployeeDto employeeDto);

  void deleteEmployee(UUID id);

  EmployeeDto getEmployeeById(UUID id);

  List<EmployeeDto> getEmployees();
}
