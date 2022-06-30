package org.imperium.masadamarketstack.data.services.interfaces;

import org.imperium.masadamarketstack.mvc.model.Split;

public interface SplitService {
    Iterable<Split> getAll();
    Split getById(long id);
    void save(Split split);
    void deleteById(long id);
}
