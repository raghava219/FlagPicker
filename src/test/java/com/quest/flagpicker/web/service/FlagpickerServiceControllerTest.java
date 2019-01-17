package com.quest.flagpicker.web.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.quest.flagpicker.business.service.FlagPickerService;
import com.quest.flagpicker.data.entity.Countries;


@RunWith(SpringRunner.class)
@WebMvcTest(FlagpickerServiceController.class)
public class FlagpickerServiceControllerTest {
	
	@MockBean
	private FlagPickerService flagPickerService;
	
	@Autowired
	private MockMvc mockMVC;
	
	@Test
	public void getAllContinentAndCountryDetails() throws Exception{
		List<Countries> mockReservationList = new ArrayList<>();
		Countries countryObj = new Countries();
		
	}

}
