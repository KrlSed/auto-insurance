package com.sedliarov.autoinsurance.model.dto;

import com.sedliarov.autoinsurance.model.entity.Car;
import com.sedliarov.autoinsurance.model.entity.Employee;
import com.sedliarov.autoinsurance.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto implements Serializable {

  private UUID clientId;

  private String firstName;

  private String secondName;

  private String address;

  private Date birthday;

  private Employee employee;

  private User user;

  private Set<Car> cars;
}
