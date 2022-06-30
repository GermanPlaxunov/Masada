package org.imperium.masadamarketstack.data.services.impl;

import lombok.RequiredArgsConstructor;
import org.imperium.masadamarketstack.data.repo.TimezoneRepository;
import org.imperium.masadamarketstack.data.services.interfaces.TimezoneService;
import org.imperium.masadamarketstack.mvc.model.Timezone;

@RequiredArgsConstructor
public class TimezoneServiceImpl implements TimezoneService {

    private final TimezoneRepository repository;

    @Override
    public Iterable<Timezone> getAll() {
        return repository.findAll();
    }

    @Override
    public Timezone getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Timezone timezone) {
        repository.save(timezone);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
