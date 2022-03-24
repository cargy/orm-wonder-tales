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

    @OneToOne(mappedBy = "capital")
    private Country country;

    public void setCountry(Country country) {
        this.country = country;
    }

}
