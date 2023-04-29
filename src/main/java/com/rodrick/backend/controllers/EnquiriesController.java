package com.rodrick.backend.controllers;

import com.rodrick.backend.models.Enquiries;
import com.rodrick.backend.repositories.EnquiriesRepo;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rodrick")
public class EnquiriesController {
    @Autowired
    private EnquiriesRepo enquiriesRepo;

    @GetMapping("/getEnquiry")
    public List<Enquiries> list(){
        return enquiriesRepo.findAll();
    }

    @PostMapping("/enquiries")
    public ResponseEntity<Enquiries> enquiries(@RequestBody Enquiries enquiries){
        enquiriesRepo.save(enquiries);
        return ResponseEntity.ok(enquiries);
    }
}
