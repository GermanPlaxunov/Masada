package org.imperium.masadamarketstack.data.repo;

import org.imperium.masadamarketstack.mvc.model.EndOfDay;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndOfDayRepository extends CrudRepository<EndOfDay, Long> {
}
