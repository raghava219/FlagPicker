package com.quest.flagpicker.web.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quest.flagpicker.business.service.FlagPickerService;
import com.quest.flagpicker.data.entity.Continent;
import com.quest.flagpicker.data.entity.Countries;


@RestController
@RequestMapping("/clients")
public class FlagpickerServiceController {

	@Autowired
	private FlagPickerService flagPickerService;
	    
    @RequestMapping(method= RequestMethod.GET, value="/continent")
    public List<Continent> getAllContinetDetails(){
        return this.flagPickerService.getAllContinentAndCountryDetails();
    }
    
    @RequestMapping(method= RequestMethod.POST, value="/continent")
    public HttpStatus createContinent(@Valid @RequestBody Continent continent) {
		return flagPickerService.addContinentAndRelatedCountriesInfo(continent) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }
    
	/*
	 * @RequestMapping(value = "/continent/{name}", method = RequestMethod.GET)
	 * public List<Countries> getPersoneByName(@PathVariable String name) { return
	 * this.flagPickerService.findByContinentinfo(name); }
	 */
    
    @RequestMapping(value = "/continent/{continent_id}", method = RequestMethod.DELETE)
	public HttpStatus deleteContinentById(@PathVariable Long continent_id) {
    	flagPickerService.deleteContinentById(continent_id);
		return HttpStatus.NO_CONTENT;
	}

    @RequestMapping(value = "/countries/{countries_id}", method = RequestMethod.DELETE)
	public HttpStatus deleteCountriesById(@PathVariable Long countries_id) {
    	flagPickerService.deleteContinentById(countries_id);
		return HttpStatus.NO_CONTENT;
	}

    @RequestMapping(value = "/continent", method = RequestMethod.PUT)
	public HttpStatus updateContinentAndCountries(@RequestBody Continent continent) {
		return flagPickerService.updateContinent(continent) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
    
    
}
