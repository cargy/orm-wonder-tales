package org.wonder.tales.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.wonder.tales.domain.Capital
import org.wonder.tales.domain.Country
import spock.lang.Specification

@DataJpaTest
class CountryRepositoryTest extends Specification {

    @Autowired
    CountryRepository repository

    def 'Insert county with capital'() {
        given:
        def capital = new Capital(name: 'Athens')
        def country = new Country(name: 'Greece')
        country.setCapital(capital)

        when:
        repository.save(country)

        then:
        def savedCountry = repository.findById(country.id).get()
        savedCountry.name == country.name
        savedCountry.capital.name == country.capital.name
        savedCountry.capital.country.name == country.name
    }
}
