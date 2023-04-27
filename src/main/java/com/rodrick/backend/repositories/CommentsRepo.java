package com.rodrick.backend.repositories;

import com.rodrick.backend.models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepo extends JpaRepository<Comments,Long> {
}
