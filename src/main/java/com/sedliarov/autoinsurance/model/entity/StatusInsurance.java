package com.sedliarov.autoinsurance.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "status_insurance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatusInsurance {

  @Id
  @GeneratedValue
  private UUID statusInsuranceId;

  private boolean isInsured;

  private Double payForMonth;

  private Double payoutAmount;

  private Date endInsurance;

  @OneToOne(mappedBy = "car")
  private Car car;
}
