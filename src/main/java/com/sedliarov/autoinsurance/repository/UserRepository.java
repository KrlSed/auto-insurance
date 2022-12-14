package com.sedliarov.autoinsurance.repository;

import com.sedliarov.autoinsurance.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
