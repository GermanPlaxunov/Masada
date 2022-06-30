package org.imperium.masadamarketstack.data.services.interfaces;

import org.imperium.masadamarketstack.mvc.model.EndOfDay;

public interface EndOfDayService {
    Iterable<EndOfDay> getAll();
    EndOfDay getById(long id);
    void save(EndOfDay endOfDay);
    void deleteById(long id);
}
