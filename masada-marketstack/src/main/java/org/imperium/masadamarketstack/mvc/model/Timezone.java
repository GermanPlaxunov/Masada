package org.imperium.masadamarketstack.mvc.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "timezones")
public class Timezone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "timezone")
    private String timezone;
    @Column(name = "abbr")
    private String abbr;
    @Column(name = "abbrDst")
    private String abbrDst;
}
