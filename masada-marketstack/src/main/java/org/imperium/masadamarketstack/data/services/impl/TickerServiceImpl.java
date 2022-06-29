package org.imperium.masadamarketstack.data.services.impl;

import lombok.RequiredArgsConstructor;
import org.imperium.masadamarketstack.data.repo.TickerRepository;
import org.imperium.masadamarketstack.data.services.interfaces.TickerService;
import org.imperium.masadamarketstack.mvc.model.Ticker;

@RequiredArgsConstructor
public class TickerServiceImpl implements TickerService {

    private final TickerRepository repository;

    @Override
    public Iterable<Ticker> getAll() {
        return repository.findAll();
    }

    @Override
    public Ticker getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Ticker ticker) {
        repository.save(ticker);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
