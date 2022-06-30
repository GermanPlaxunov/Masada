package org.imperium.masadamarketstack.mvc.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "splits")
public class Split {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "date")
    private Date date;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "split_factor")
    private double splitFactor;

}
