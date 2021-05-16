package com.github.lessalc.cities.taxes.repository;

import com.github.lessalc.cities.taxes.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxRepository extends JpaRepository<Tax, Long> {

}
