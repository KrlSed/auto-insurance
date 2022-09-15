package com.sedliarov.autoinsurance.service.impl;

import com.sedliarov.autoinsurance.mapper.EmployeeMapper;
import com.sedliarov.autoinsurance.model.dto.EmployeeDto;
import com.sedliarov.autoinsurance.model.entity.Employee;
import com.sedliarov.autoinsurance.repository.EmployeeRepository;
import com.sedliarov.autoinsurance.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

  private final EmployeeRepository repository;

  private final EmployeeMapper mapper;

  @Override
  public EmployeeDto createEmployee(EmployeeDto employeeDto) {
    Employee employeeToSave = mapper.dtoToEntity(employeeDto);
    return mapper.entityToDto(repository.save(employeeToSave));
  }

  @Override
  public EmployeeDto updateEmployee(UUID id, EmployeeDto employeeDto) {
    repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id));

    Employee employeeToUpdate = mapper.dtoToEntity(employeeDto);
    employeeToUpdate.setEmployeeId(id);
    return mapper.entityToDto(repository.save(employeeToUpdate));
  }

  @Override
  public void deleteEmployee(UUID id) {
    repository.deleteById(id);
  }

  @Override
  public EmployeeDto getEmployeeById(UUID id) {
    return mapper.entityToDto(repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id)));
  }

  @Override
  public List<EmployeeDto> getEmployees() {
    return repository.findAll().stream().map(mapper::entityToDto).toList();
  }
}
