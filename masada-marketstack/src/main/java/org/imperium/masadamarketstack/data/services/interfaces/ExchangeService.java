package org.imperium.masadamarketstack.data.services.interfaces;

import org.imperium.masadamarketstack.mvc.model.Exchange;

public interface ExchangeService {
    Iterable<Exchange> getAll();
    Exchange getById(long id);
    void save(Exchange exchange);
    void deleteById(long id);
}
