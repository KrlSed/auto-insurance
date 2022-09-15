package com.sedliarov.autoinsurance.model.dto;

import com.sedliarov.autoinsurance.model.entity.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusInsuranceDto implements Serializable {

  private UUID statusInsuranceId;

  private boolean isInsured;

  private Double payForMonth;

  private Double payoutAmount;

  private Date endInsurance;

  private Car car;
}
