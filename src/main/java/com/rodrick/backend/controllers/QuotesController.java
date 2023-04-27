package com.rodrick.backend.controllers;

import com.rodrick.backend.models.Quotes;
import com.rodrick.backend.repositories.QuotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rodrick")
@CrossOrigin("https://rodrickgulu.github.io/RodrickGulu")
public class QuotesController {
    @Autowired
    private QuotesRepo quotesRepo;

    @GetMapping("/getQuotes")
    public List<Quotes> getQuotes() {
        return quotesRepo.findAll();
    }

    @PostMapping("/addQuotes")
    public ResponseEntity<Quotes> addQuotes(@RequestBody Quotes quotes) {
        quotesRepo.save(quotes);
        return ResponseEntity.ok(quotes);
    }

}
