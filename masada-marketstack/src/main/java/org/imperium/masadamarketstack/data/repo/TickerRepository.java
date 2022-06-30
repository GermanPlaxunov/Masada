package org.imperium.masadamarketstack.data.repo;

import org.imperium.masadamarketstack.mvc.model.Ticker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TickerRepository extends CrudRepository<Ticker, Long> {
}
