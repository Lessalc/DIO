package com.github.lessalc.cities.countries.repository;

import com.github.lessalc.cities.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
