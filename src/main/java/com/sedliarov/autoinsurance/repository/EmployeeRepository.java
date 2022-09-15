package com.sedliarov.autoinsurance.repository;

import com.sedliarov.autoinsurance.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}
