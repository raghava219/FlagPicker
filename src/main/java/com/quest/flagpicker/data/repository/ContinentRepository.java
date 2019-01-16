package com.quest.flagpicker.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.quest.flagpicker.data.entity.Continent;

public interface ContinentRepository  extends JpaRepository<Continent, Long>{

	
}
