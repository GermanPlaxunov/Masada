package org.imperium.masadamarketstack.data.services.interfaces;

import org.imperium.masadamarketstack.mvc.model.Dividend;

public interface DividendService {
    Iterable<Dividend> getAll();
    Dividend getById(long id);
    void save(Dividend dividend);
    void deleteById(long id);
}
