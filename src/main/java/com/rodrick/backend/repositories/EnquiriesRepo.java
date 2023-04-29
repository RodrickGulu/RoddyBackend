package com.rodrick.backend.repositories;

import com.rodrick.backend.models.Enquiries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiriesRepo extends JpaRepository<Enquiries,Long> {
}
