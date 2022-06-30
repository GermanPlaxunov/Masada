package org.imperium.masadamarketstack.mvc.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tickers")
public class Ticker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "exchange_id")
    private long exchangeId;

}
