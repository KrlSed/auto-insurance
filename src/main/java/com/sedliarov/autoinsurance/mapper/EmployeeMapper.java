package com.sedliarov.autoinsurance.mapper;

import com.sedliarov.autoinsurance.model.dto.EmployeeDto;
import com.sedliarov.autoinsurance.model.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for {@link EmployeeDto} and {@link Employee}.
 *
 * @author  Kirill Sedliarov
 */
@Mapper
public interface EmployeeMapper {

  /**
   * Creating instance to student mapper
   */
  EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

  Employee dtoToEntity(EmployeeDto employeeDto);

  EmployeeDto entityToDto(Employee employee);
}
