package com.sedliarov.autoinsurance.mapper;

import com.sedliarov.autoinsurance.model.dto.CarDto;
import com.sedliarov.autoinsurance.model.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for {@link CarDto} and {@link Car}.
 *
 * @author  Kirill Sedliarov
 */
@Mapper
public interface CarMapper {

  /**
   * Creating instance to student mapper
   */
  CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

  Car dtoToEntity(CarDto carDto);

  CarDto entityToDto(Car car);
}
