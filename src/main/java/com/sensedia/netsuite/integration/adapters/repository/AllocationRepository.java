package com.sensedia.netsuite.integration.adapters.repository;

import com.sensedia.netsuite.integration.domain.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long> {
}
