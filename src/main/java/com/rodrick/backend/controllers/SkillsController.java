package com.rodrick.backend.controllers;

import com.rodrick.backend.models.Skills;
import com.rodrick.backend.repositories.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rodrick")
public class SkillsController {
    @Autowired
    private SkillsRepo skillsRepo;

    @GetMapping("/getSkills")
    public List<Skills> getSkills(){
        return skillsRepo.findAll();
    }

    @PostMapping("/updateSkills")
    public ResponseEntity<Skills> updateSkills(@RequestBody Skills skills){
        skillsRepo.save(skills);
        return ResponseEntity.ok(skills);
    }
}
