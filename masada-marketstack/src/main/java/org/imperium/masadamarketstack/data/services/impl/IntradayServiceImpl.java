package org.imperium.masadamarketstack.data.services.impl;

import lombok.RequiredArgsConstructor;
import org.imperium.masadamarketstack.data.repo.IntradayRepository;
import org.imperium.masadamarketstack.data.services.interfaces.IntradayService;
import org.imperium.masadamarketstack.mvc.model.Intraday;

@RequiredArgsConstructor
public class IntradayServiceImpl implements IntradayService {

    private final IntradayRepository repository;

    @Override
    public Iterable<Intraday> getAll() {
        return repository.findAll();
    }

    @Override
    public Intraday getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Intraday intraday) {
        repository.save(intraday);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
