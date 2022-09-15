package com.sedliarov.autoinsurance.service;

import com.sedliarov.autoinsurance.model.dto.ClientDto;

import java.util.List;
import java.util.UUID;

public interface ClientService {

  ClientDto createClient(ClientDto clientDto);

  ClientDto updateClient(UUID id, ClientDto clientDto);

  void deleteClient(UUID id);

  ClientDto getClientById(UUID id);

  List<ClientDto> getClients();
}
