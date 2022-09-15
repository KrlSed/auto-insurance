package com.sedliarov.autoinsurance.model.dto;

import com.sedliarov.autoinsurance.model.entity.Client;
import com.sedliarov.autoinsurance.model.entity.StatusInsurance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto implements Serializable {

  private UUID carId;

  private String mark;

  private String model;

  private int yearCreated;

  private StatusInsurance statusInsurance;

  private Client client;
}
