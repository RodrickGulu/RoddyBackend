package com.rodrick.backend.controllers;

import com.rodrick.backend.models.Quotes;
import com.rodrick.backend.repositories.QuotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rodrick")
@CrossOrigin("https://rodrickgulu.github.io/RodrickGulu")
public class QuotesController {
    @Autowired
    private QuotesRepo quotesRepo;

    @GetMapping("/getQuote/{id}")
    public Optional<Quotes> getQuotes(@PathVariable Long id) {
        return quotesRepo.findById(id);
    }
    @GetMapping("/quotes")
    public Integer getNumber(){
        return Math.toIntExact(quotesRepo.count());
    }

    @PostMapping("/addQuotes")
    public ResponseEntity<Quotes> addQuotes(@RequestBody Quotes quotes) {
        quotesRepo.save(quotes);
        return ResponseEntity.ok(quotes);
    }

}
