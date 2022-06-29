package org.imperium.masadamarketstack.data.services.impl;

import lombok.RequiredArgsConstructor;
import org.imperium.masadamarketstack.data.repo.EndOfDayRepository;
import org.imperium.masadamarketstack.data.services.interfaces.EndOfDayService;
import org.imperium.masadamarketstack.mvc.model.EndOfDay;

@RequiredArgsConstructor
public class EndOfDayServiceImpl implements EndOfDayService {

    private final EndOfDayRepository repository;

    @Override
    public Iterable<EndOfDay> getAll() {
        return repository.findAll();
    }

    @Override
    public EndOfDay getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(EndOfDay endOfDay) {
        repository.save(endOfDay);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
