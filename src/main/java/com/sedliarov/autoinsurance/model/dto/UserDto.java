package com.sedliarov.autoinsurance.model.dto;

import com.sedliarov.autoinsurance.model.entity.Client;
import com.sedliarov.autoinsurance.model.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {

  private UUID userId;

  private String email;

  private String username;

  private String password;

  private Client client;

  private Employee employee;
}
