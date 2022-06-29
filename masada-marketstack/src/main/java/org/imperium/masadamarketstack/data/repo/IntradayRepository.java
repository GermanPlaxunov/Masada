package org.imperium.masadamarketstack.data.repo;

import org.imperium.masadamarketstack.mvc.model.Intraday;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntradayRepository extends CrudRepository<Intraday, Long> {
}
