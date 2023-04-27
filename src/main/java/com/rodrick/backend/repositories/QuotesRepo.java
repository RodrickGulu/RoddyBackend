package com.rodrick.backend.repositories;

import com.rodrick.backend.models.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotesRepo extends JpaRepository<Quotes,Long> {
}
