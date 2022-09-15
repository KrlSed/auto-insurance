package com.sedliarov.autoinsurance.service;

import com.sedliarov.autoinsurance.model.dto.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {

  UserDto createUser(UserDto userDto);

  UserDto updateUser(UUID id, UserDto userDto);

  void deleteUser(UUID id);

  UserDto getUserById(UUID id);

  List<UserDto> getUsers();
  
}
