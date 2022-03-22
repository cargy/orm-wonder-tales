package org.wonder.tales.domain;

import javax.persistence.*;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "capital_id", referencedColumnName = "id")
    private Capital capital;

    public Capital getCapital() {
        return capital;
    }

    public Country() {}
    public Country(String name) {
        this.name = name;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
        this.capital.setCountry(this);
    }
}
