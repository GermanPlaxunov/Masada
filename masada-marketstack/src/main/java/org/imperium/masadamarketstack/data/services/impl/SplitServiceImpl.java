package org.imperium.masadamarketstack.data.services.impl;

import lombok.RequiredArgsConstructor;
import org.imperium.masadamarketstack.data.repo.SplitRepository;
import org.imperium.masadamarketstack.data.services.interfaces.SplitService;
import org.imperium.masadamarketstack.mvc.model.Split;

@RequiredArgsConstructor
public class SplitServiceImpl implements SplitService {

    private final SplitRepository repository;

    @Override
    public Iterable<Split> getAll() {
        return repository.findAll();
    }

    @Override
    public Split getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Split split) {
        repository.save(split);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
