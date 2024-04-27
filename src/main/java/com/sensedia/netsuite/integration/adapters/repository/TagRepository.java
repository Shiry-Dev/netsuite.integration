package com.sensedia.netsuite.integration.adapters.repository;

import com.sensedia.netsuite.integration.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
