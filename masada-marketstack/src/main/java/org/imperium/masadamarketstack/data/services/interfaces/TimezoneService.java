package org.imperium.masadamarketstack.data.services.interfaces;

import org.imperium.masadamarketstack.mvc.model.Timezone;

public interface TimezoneService {
    Iterable<Timezone> getAll();
    Timezone getById(long id);
    void save(Timezone timezone);
    void deleteById(long id);
}
