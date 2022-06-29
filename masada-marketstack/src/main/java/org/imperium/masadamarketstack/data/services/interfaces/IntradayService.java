package org.imperium.masadamarketstack.data.services.interfaces;

import org.imperium.masadamarketstack.mvc.model.Intraday;

public interface IntradayService {
    Iterable<Intraday> getAll();
    Intraday getById(long id);
    void save(Intraday intraday);
    void deleteById(long id);
}
