package org.imperium.masadamarketstack.mvc.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "intraday")
public class Intraday {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "date")
    private Date date;
    @Column(name = "symbols")
    private String symbols;
    @Column(name = "exchange")
    private String exchange;
    @Column(name = "open")
    private double open;
    @Column(name = "high")
    private double high;
    @Column(name = "low")
    private double low;
    @Column(name = "close")
    private double close;
    @Column(name = "last")
    private double last;
    @Column(name = "volume")
    private double volume;

}
