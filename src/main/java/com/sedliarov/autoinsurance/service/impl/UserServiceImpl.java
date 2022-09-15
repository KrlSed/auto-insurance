package com.sedliarov.autoinsurance.service.impl;

import com.sedliarov.autoinsurance.mapper.UserMapper;
import com.sedliarov.autoinsurance.model.dto.UserDto;
import com.sedliarov.autoinsurance.model.entity.User;
import com.sedliarov.autoinsurance.repository.UserRepository;
import com.sedliarov.autoinsurance.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository repository;

  private final UserMapper mapper;

  @Override
  public UserDto createUser(UserDto userDto) {
    User userToSave = mapper.dtoToEntity(userDto);
    return mapper.entityToDto(repository.save(userToSave));
  }

  @Override
  public UserDto updateUser(UUID id, UserDto userDto) {
    repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id));

    User userToUpdate = mapper.dtoToEntity(userDto);
    userToUpdate.setUserId(id);
    return mapper.entityToDto(repository.save(userToUpdate));
  }

  @Override
  public void deleteUser(UUID id) {
    repository.deleteById(id);
  }

  @Override
  public UserDto getUserById(UUID id) {
    return mapper.entityToDto(repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id)));
  }

  @Override
  public List<UserDto> getUsers() {
    return repository.findAll().stream().map(mapper::entityToDto).toList();
  }
}
