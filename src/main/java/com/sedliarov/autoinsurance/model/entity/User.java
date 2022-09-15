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
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

  @Id
  @GeneratedValue
  private UUID userId;

  private String email;

  private String username;

  private String password;

  @OneToOne
  @JoinColumn(name = "client_id")
  private Client client;

  @OneToOne
  @JoinColumn(name = "employee_id")
  private Employee employee;
}
