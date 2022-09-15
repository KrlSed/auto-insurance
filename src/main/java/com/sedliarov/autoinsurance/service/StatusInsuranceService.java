package com.sedliarov.autoinsurance.service;

import com.sedliarov.autoinsurance.model.dto.StatusInsuranceDto;

import java.util.List;
import java.util.UUID;

public interface StatusInsuranceService {

  StatusInsuranceDto createStatusInsurance(StatusInsuranceDto statusInsuranceDto);

  StatusInsuranceDto updateStatusInsurance(UUID id, StatusInsuranceDto statusInsuranceDto);

  void deleteStatusInsurance(UUID id);

  StatusInsuranceDto getStatusInsuranceById(UUID id);

  List<StatusInsuranceDto> getStatusInsurances();
}
