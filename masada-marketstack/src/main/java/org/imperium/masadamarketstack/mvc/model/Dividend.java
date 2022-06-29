package org.imperium.masadamarketstack.mvc.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "dividends")
public class Dividend {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "date")
    private Date date;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "dividend")
    private double dividend;

}
