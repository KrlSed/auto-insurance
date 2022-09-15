package com.sedliarov.autoinsurance.mapper;

import com.sedliarov.autoinsurance.model.dto.StatusInsuranceDto;
import com.sedliarov.autoinsurance.model.entity.StatusInsurance;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for {@link StatusInsuranceDto} and {@link StatusInsurance}.
 *
 * @author  Kirill Sedliarov
 */
@Mapper
public interface StatusInsuranceMapper {

  /**
   * Creating instance to student mapper
   */
  StatusInsuranceMapper INSTANCE = Mappers.getMapper(StatusInsuranceMapper.class);

  StatusInsurance dtoToEntity(StatusInsuranceDto statusInsuranceDto);

  StatusInsuranceDto entityToDto(StatusInsurance statusInsurance);
}
