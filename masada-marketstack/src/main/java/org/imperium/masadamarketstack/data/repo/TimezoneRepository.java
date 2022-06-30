package org.imperium.masadamarketstack.data.repo;

import org.imperium.masadamarketstack.mvc.model.Timezone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimezoneRepository extends CrudRepository<Timezone, Long> {
}
