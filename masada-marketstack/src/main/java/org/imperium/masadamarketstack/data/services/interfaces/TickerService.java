package org.imperium.masadamarketstack.data.services.interfaces;

import org.imperium.masadamarketstack.mvc.model.Ticker;

public interface TickerService {
    Iterable<Ticker> getAll();
    Ticker getById(long id);
    void save(Ticker ticker);
    void deleteById(long id);
}
