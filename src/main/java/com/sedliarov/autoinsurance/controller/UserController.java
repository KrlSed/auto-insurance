package com.sedliarov.autoinsurance.controller;

import com.sedliarov.autoinsurance.model.dto.UserDto;
import com.sedliarov.autoinsurance.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

  private final UserService service;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public UserDto createUser(@RequestBody UserDto userDto) {
    return service.createUser(userDto);
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<UserDto> getUsers() {
    return service.getUsers();
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public UserDto updateUser(@PathVariable UUID id, @RequestBody UserDto userDto) {
    return service.updateUser(id, userDto);
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public UserDto getUserById(@PathVariable UUID id) {
    return service.getUserById(id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteUser(@PathVariable UUID id) {
    service.deleteUser(id);
  }
}
