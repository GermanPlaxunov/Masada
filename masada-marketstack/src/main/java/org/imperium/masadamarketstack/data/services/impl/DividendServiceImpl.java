package org.imperium.masadamarketstack.data.services.impl;

import lombok.RequiredArgsConstructor;
import org.imperium.masadamarketstack.data.repo.DividendRepository;
import org.imperium.masadamarketstack.data.services.interfaces.DividendService;
import org.imperium.masadamarketstack.mvc.model.Dividend;

@RequiredArgsConstructor
public class DividendServiceImpl implements DividendService {
    
    private final DividendRepository repository;
    
    @Override
    public Iterable<Dividend> getAll() {
        return repository.findAll();
    }

    @Override
    public Dividend getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Dividend dividend) {
        repository.save(dividend);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
