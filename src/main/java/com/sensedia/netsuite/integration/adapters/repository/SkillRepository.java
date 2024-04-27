package com.sensedia.netsuite.integration.adapters.repository;

import com.sensedia.netsuite.integration.domain.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
