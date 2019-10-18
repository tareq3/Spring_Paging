package com.mti.paging.repository;

import com.mti.paging.domains.Country;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CountryRepo
 */
public interface CountryRepo  extends JpaRepository<Country, Long>{

    
}