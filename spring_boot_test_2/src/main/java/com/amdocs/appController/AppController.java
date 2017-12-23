package com.amdocs.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.models.Menu;
import com.amdocs.models.Person;


@RestController
public class AppController {

	@Autowired
	private Person person;

	@Autowired
	@Qualifier("allmenus")
	private List<Menu> allmenus;
	
	
//	this request showcases the use of @PropertySource annotation
	@RequestMapping(value = "/person/details")
	public Person getPerson() {
		return person;
	}

	@RequestMapping("/menus/all")
	public List<Menu> getallmenus() {
		return this.allmenus;
	}
}
