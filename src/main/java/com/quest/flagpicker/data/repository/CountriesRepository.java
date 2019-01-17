package com.quest.flagpicker.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quest.flagpicker.data.entity.Countries;

public interface CountriesRepository extends CrudRepository<Countries, Long>{

	/* List<Countries> findByContinent(String continent); */
	
}
