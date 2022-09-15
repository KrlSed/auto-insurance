package com.sedliarov.autoinsurance.service.impl;

import com.sedliarov.autoinsurance.mapper.StatusInsuranceMapper;
import com.sedliarov.autoinsurance.model.dto.StatusInsuranceDto;
import com.sedliarov.autoinsurance.model.entity.StatusInsurance;
import com.sedliarov.autoinsurance.repository.StatusInsuranceRepository;
import com.sedliarov.autoinsurance.service.StatusInsuranceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor
public class StatusInsuranceServiceImpl implements StatusInsuranceService {
  private final StatusInsuranceRepository repository;

  private final StatusInsuranceMapper mapper;

  @Override
  public StatusInsuranceDto createStatusInsurance(StatusInsuranceDto statusInsuranceDto) {
    StatusInsurance statusInsuranceToSave = mapper.dtoToEntity(statusInsuranceDto);
    return mapper.entityToDto(repository.save(statusInsuranceToSave));
  }

  @Override
  public StatusInsuranceDto updateStatusInsurance(UUID id, StatusInsuranceDto statusInsuranceDto) {
    repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id));

    StatusInsurance statusInsuranceToUpdate = mapper.dtoToEntity(statusInsuranceDto);
    statusInsuranceToUpdate.setStatusInsuranceId(id);
    return mapper.entityToDto(repository.save(statusInsuranceToUpdate));
  }

  @Override
  public void deleteStatusInsurance(UUID id) {
    repository.deleteById(id);
  }

  @Override
  public StatusInsuranceDto getStatusInsuranceById(UUID id) {
    return mapper.entityToDto(repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id)));
  }

  @Override
  public List<StatusInsuranceDto> getStatusInsurances() {
    return repository.findAll().stream().map(mapper::entityToDto).toList();
  }
}
