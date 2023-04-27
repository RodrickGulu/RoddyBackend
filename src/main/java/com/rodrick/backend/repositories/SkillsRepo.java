package com.rodrick.backend.repositories;

import com.rodrick.backend.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepo extends JpaRepository<Skills,Long> {
}
