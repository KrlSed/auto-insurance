package com.sedliarov.autoinsurance.mapper;

import com.sedliarov.autoinsurance.model.dto.UserDto;
import com.sedliarov.autoinsurance.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for {@link UserDto} and {@link User}.
 *
 * @author  Kirill Sedliarov
 */
@Mapper
public interface UserMapper {

  /**
   * Creating instance to student mapper
   */
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  User dtoToEntity(UserDto studentDto);

  UserDto entityToDto(User student);
}
