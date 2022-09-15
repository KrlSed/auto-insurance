package com.sedliarov.autoinsurance.mapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Mapper configuration.
 *
 * @author  Kirill Sedliarov
 */
@Configuration
public class MapperConfiguration {

  @Bean
  public UserMapper userMapper() {
    return UserMapper.INSTANCE;
  }

  @Bean
  public CarMapper carMapper() {
    return CarMapper.INSTANCE;
  }

  @Bean
  public ClientMapper clientMapper() {
    return ClientMapper.INSTANCE;
  }

  @Bean
  public EmployeeMapper employeeMapper() {
    return EmployeeMapper.INSTANCE;
  }

  @Bean
  public StatusInsuranceMapper statusInsuranceMapper() {
    return StatusInsuranceMapper.INSTANCE;
  }

}

