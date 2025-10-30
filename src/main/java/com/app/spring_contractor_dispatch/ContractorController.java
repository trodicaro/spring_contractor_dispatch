package com.app.spring_contractor_dispatch;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/contractors")
public class ContractorController {
    private final ContractorRepository repository;
    
    public ContractorController(ContractorRepository repository) {
        this.repository = repository;
    }
    
    @PostMapping
    public Contractor create(@RequestBody Contractor contractor) {
        return repository.save(contractor);
    }
    
    @GetMapping
    public List<Contractor> getAll() {
        return repository.findAll();
    }
    
    @GetMapping("/{id}")
    public Contractor getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }
    
    @PutMapping("/{id}")
    public Contractor update(@PathVariable Long id, @RequestBody Contractor contractor) {
        contractor.setId(id);
        return repository.save(contractor);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}