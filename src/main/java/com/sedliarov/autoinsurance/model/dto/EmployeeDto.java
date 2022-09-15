package com.sedliarov.autoinsurance.model.dto;

import com.sedliarov.autoinsurance.model.entity.Client;
import com.sedliarov.autoinsurance.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto implements Serializable {

  private UUID employeeId;

  private String firstName;

  private String secondName;

  private Client client;

  private User user;
}
