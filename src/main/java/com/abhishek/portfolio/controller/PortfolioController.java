package com.abhishek.portfolio.controller;

import com.abhishek.portfolio.model.Portfolio;
import com.abhishek.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/portfolio")
@CrossOrigin(origins = "http://localhost:3000")
public class PortfolioController {

    @Autowired
    // d i “Object स्वतः बनवू नको, Spring तुला ready-made देईल”
    private PortfolioService portfolioService;

    // GET - सर्व records
    @GetMapping
    public List<Portfolio> getAll() {
        return portfolioService.getAll();
    }

    // GET - एक record by ID
    @GetMapping("/{id}")
    public ResponseEntity<Portfolio> getById(@PathVariable String id) {
        return portfolioService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST - नवीन record बनवा
    @PostMapping
    public Portfolio create(@RequestBody Portfolio portfolio) {
        return portfolioService.create(portfolio);
    }

    // PUT - record update करा
    @PutMapping("/{id}")
    public ResponseEntity<Portfolio> update(@PathVariable String id,
                                            @RequestBody Portfolio portfolio) {
        return portfolioService.update(id, portfolio)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE - record delete करा
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        portfolioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}