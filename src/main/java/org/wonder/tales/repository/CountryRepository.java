package org.wonder.tales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wonder.tales.domain.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
