package com.sedliarov.autoinsurance.mapper;

import com.sedliarov.autoinsurance.model.dto.ClientDto;
import com.sedliarov.autoinsurance.model.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for {@link ClientDto} and {@link Client}.
 *
 * @author  Kirill Sedliarov
 */
@Mapper
public interface ClientMapper {

  /**
   * Creating instance to student mapper
   */
  ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

  Client dtoToEntity(ClientDto clientDto);

  ClientDto entityToDto(Client client);
}
