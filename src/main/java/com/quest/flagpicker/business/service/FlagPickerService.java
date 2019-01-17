package com.quest.flagpicker.business.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.flagpicker.data.entity.Continent;
import com.quest.flagpicker.data.entity.Countries;
import com.quest.flagpicker.data.repository.ContinentRepository;
import com.quest.flagpicker.data.repository.CountriesRepository;


@Service
public class FlagPickerService {

	
	private ContinentRepository continentRepository;
	
	private CountriesRepository countriesRepository;
	
	@Autowired
	public FlagPickerService(ContinentRepository continentRepository,CountriesRepository countriesRepository) {
		this.continentRepository = continentRepository;
		this.countriesRepository = countriesRepository;
	}
	
	
	@Transactional
	public List<Continent> getAllContinentAndCountryDetails() {
		return (List<Continent>)continentRepository.findAll();
    }
	
	/*
	 * @Transactional public List<Countries> findByContinentinfo(String
	 * continentName) { return countriesRepository.findByContinent(continentName); }
	 */
	
	@Transactional
	public boolean addContinentAndRelatedCountriesInfo(Continent continent) {
		return continentRepository.save(continent) != null;
	}
	
	@Transactional
	public void deleteContinentById(Long continentId) {
		continentRepository.deleteById(continentId);
	}
	
	@Transactional
	public void deleteCountriesById(Long countryId) {
		countriesRepository.deleteById(countryId);
	}
	
	@Transactional
	public boolean updateContinent(Continent continent) {
		return continentRepository.save(continent) != null;
	}

	
}
