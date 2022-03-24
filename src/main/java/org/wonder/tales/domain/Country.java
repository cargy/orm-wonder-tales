package org.wonder.tales.domain;

import javax.persistence.*;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "capital_id", referencedColumnName = "id")
    private Capital capital;

    public void setCapital(Capital capital) {
        this.capital = capital;
        this.capital.setCountry(this);
    }
}
