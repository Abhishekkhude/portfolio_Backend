package com.abhishek.portfolio.service;

import com.abhishek.portfolio.model.Portfolio;
import com.abhishek.portfolio.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository repo;

    public List<Portfolio> getAll() {
        return repo.findAll();
    }

    public Optional<Portfolio> getById(String id) {
        return repo.findById(id);
    }

    public Portfolio create(Portfolio portfolio) {
        return repo.save(portfolio);
    }

    public Optional<Portfolio> update(String id, Portfolio updated) {
        return repo.findById(id).map(existing -> {
            updated.setId(id);
            return repo.save(updated);
        });
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
