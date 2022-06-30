package org.imperium.masadamarketstack.data.services.impl;

import lombok.RequiredArgsConstructor;
import org.imperium.masadamarketstack.data.repo.ExchangeRepository;
import org.imperium.masadamarketstack.data.services.interfaces.ExchangeService;
import org.imperium.masadamarketstack.mvc.model.Exchange;

@RequiredArgsConstructor
public class ExchangeServiceImpl implements ExchangeService {

    private final ExchangeRepository repository;

    @Override
    public Iterable<Exchange> getAll() {
        return repository.findAll();
    }

    @Override
    public Exchange getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Exchange exchange) {
        repository.save(exchange);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
