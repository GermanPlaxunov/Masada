package org.imperium.masadamarketstack.mvc.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "end_of_day")
public class EndOfDay {
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
    @Column(name = "volume")
    private double volume;
    @Column(name = "adjust_high")
    private double adjustHigh;
    @Column(name = "adjust_low")
    private double adjustLow;
    @Column(name = "adjust_close")
    private double adjustClose;
    @Column(name = "adjust_open")
    private double adjustOpen;
    @Column(name = "adjust_volume")
    private double adjustVolume;
    @Column(name = "split_factor")
    private double splitFactor;
    @Column(name = "dividend")
    private double dividend;

}
