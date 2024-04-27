package com.sensedia.netsuite.integration.adapters.repository;

import com.sensedia.netsuite.integration.domain.Collaborator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaboratorRepository extends JpaRepository<Collaborator, Long> {
}
