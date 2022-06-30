package org.imperium.masadamarketstack.data.repo;

import org.imperium.masadamarketstack.mvc.model.Dividend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DividendRepository extends CrudRepository<Dividend, Long> {
}
