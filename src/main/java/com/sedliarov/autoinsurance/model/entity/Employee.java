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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

  @Id
  @GeneratedValue
  private UUID employeeId;

  private String firstName;

  private String secondName;

  @OneToOne
  @JoinColumn(name = "client_id")
  private Client client;

  @OneToOne
  @JoinColumn(name = "user_id")
  private User user;
}
