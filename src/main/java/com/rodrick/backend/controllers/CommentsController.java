package com.rodrick.backend.controllers;

import com.rodrick.backend.models.Comments;
import com.rodrick.backend.repositories.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/rodrick")
@CrossOrigin("https://rodrickgulu.github.io/RodrickGulu")
public class CommentsController {
    @Autowired
    public CommentsRepo commentsRepo;
    @GetMapping("/comments")
    public List<Comments> comments() {
        return commentsRepo.findAll();
    }

    @PostMapping("/AddComments")
    public ResponseEntity<Comments> addComments(@RequestBody Comments comments) {
        comments.setDateTime(LocalDateTime.now());
        if(comments.getName() == null) {
            comments.setName("Anonymous");
        }
        if(comments.getEmail() == null) {
            comments.setEmail("anonymous@email");
        }
        comments.setEmail(comments.getEmail());
        comments.setName(comments.getName());
        comments.setMessage(comments.getMessage());

        commentsRepo.save(comments);
        return ResponseEntity.ok(comments);
    }

}
