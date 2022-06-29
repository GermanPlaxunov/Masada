package org.imperium.masadamarketstack.data.repo;

import org.imperium.masadamarketstack.mvc.model.Split;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SplitRepository extends CrudRepository<Split, Long> {
}
