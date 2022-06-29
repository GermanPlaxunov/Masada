package org.imperium.masadamarketstack.mvc.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "exchange")
public class Exchange {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "acronym")
    private String acronym;
    @Column(name = "mic")
    private String mic;
    @Column(name = "country")
    private String country;
    @Column(name = "country_code")
    private String countryCode;
    @Column(name = "city")
    private String city;
    @Column(name = "website")
    private String website;
    @Column(name = "timezone_id")
    private long timezoneId;

}
