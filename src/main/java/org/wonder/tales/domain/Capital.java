package org.wonder.tales.domain;

import javax.persistence.*;

@Entity
@Table(name = "capitals")
public class Capital {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    @OneToOne(mappedBy = "capital")
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Capital() {}
    public Capital(String name) {
        this.name = name;
    }

}
