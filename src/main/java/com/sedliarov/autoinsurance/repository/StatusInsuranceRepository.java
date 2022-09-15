package com.sedliarov.autoinsurance.repository;

import com.sedliarov.autoinsurance.model.entity.StatusInsurance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatusInsuranceRepository extends JpaRepository<StatusInsurance, UUID> {
}
