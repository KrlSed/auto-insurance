package com.sedliarov.autoinsurance.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * This object is entity car.
 *
 * @author  Kirill Sedliarov
 */
@Entity
@Table(name = "car")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

  @Id
  @GeneratedValue
  private UUID carId;

  private String mark;

  private String model;

  private int yearCreated;

  @OneToOne
  @JoinColumn(name = "status_id")
  private StatusInsurance statusInsurance;

  @ManyToOne
  @JoinColumn(name = "client_id", nullable = true)
  private Client client;
}