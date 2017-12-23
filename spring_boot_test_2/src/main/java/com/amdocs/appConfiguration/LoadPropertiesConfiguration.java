package com.amdocs.appConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.amdocs.models.Person;

@Configuration
@PropertySource("/application.yml")
public class LoadPropertiesConfiguration {
	
	@Value("${name}")
	private String name;
	
	@Value("${age}")
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Bean
	public Person person() {
		return new Person(this.name, this.age);
	}
}
