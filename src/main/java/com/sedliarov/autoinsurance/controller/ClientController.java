package com.sedliarov.autoinsurance.controller;

import com.sedliarov.autoinsurance.model.dto.ClientDto;
import com.sedliarov.autoinsurance.service.ClientService;
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
@RequestMapping("/clients")
public class ClientController {

  private final ClientService service;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public ClientDto createClient(@RequestBody ClientDto clientDto) {
    return service.createClient(clientDto);
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<ClientDto> getClients() {
    return service.getClients();
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public ClientDto updateClient(@PathVariable UUID id, @RequestBody ClientDto clientDto) {
    return service.updateClient(id, clientDto);
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public ClientDto getClientById(@PathVariable UUID id) {
    return service.getClientById(id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteClient(@PathVariable UUID id) {
    service.deleteClient(id);
  }
}
