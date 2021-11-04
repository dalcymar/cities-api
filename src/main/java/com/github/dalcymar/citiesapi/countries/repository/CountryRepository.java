package com.github.dalcymar.citiesapi.countries.repository;

import com.github.dalcymar.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
