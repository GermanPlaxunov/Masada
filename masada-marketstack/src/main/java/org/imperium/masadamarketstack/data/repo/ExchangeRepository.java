package org.imperium.masadamarketstack.data.repo;

import org.imperium.masadamarketstack.mvc.model.Exchange;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface ExchangeRepository extends CrudRepository<Exchange, Long> {
}
