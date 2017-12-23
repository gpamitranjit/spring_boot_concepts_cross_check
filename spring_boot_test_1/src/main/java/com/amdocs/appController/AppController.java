package com.amdocs.appController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.appService.SomeInterface;

@RestController
public class AppController {

	@Autowired
	private SomeInterface someInterface;
	
	@RequestMapping(value = "/hit")
	public String getMessage() {
		System.out.println("calling SomeInterface.someMethod()");
		this.someInterface.someMethod();
		return "success";
	}
}
