package com.sedliarov.autoinsurance.service.impl;

import com.sedliarov.autoinsurance.mapper.ClientMapper;
import com.sedliarov.autoinsurance.model.dto.ClientDto;
import com.sedliarov.autoinsurance.model.entity.Client;
import com.sedliarov.autoinsurance.repository.ClientRepository;
import com.sedliarov.autoinsurance.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

  private final ClientRepository repository;

  private final ClientMapper mapper;

  @Override
  public ClientDto createClient(ClientDto clientDto) {
    Client clientToSave = mapper.dtoToEntity(clientDto);
    return mapper.entityToDto(repository.save(clientToSave));
  }

  @Override
  public ClientDto updateClient(UUID id, ClientDto clientDto) {
    repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id));

    Client clientToUpdate = mapper.dtoToEntity(clientDto);
    clientToUpdate.setClientId(id);
    return mapper.entityToDto(repository.save(clientToUpdate));
  }

  @Override
  public void deleteClient(UUID id) {
    repository.deleteById(id);
  }

  @Override
  public ClientDto getClientById(UUID id) {
    return mapper.entityToDto(repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id)));
  }

  @Override
  public List<ClientDto> getClients() {
    return repository.findAll().stream().map(mapper::entityToDto).toList();
  }
}
