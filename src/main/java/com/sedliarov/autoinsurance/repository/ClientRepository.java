package com.sedliarov.autoinsurance.repository;

import com.sedliarov.autoinsurance.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
}
