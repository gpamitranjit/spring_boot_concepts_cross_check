package com.amdocs.appConfiguration;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amdocs.models.Menu;



@Configuration
@ConfigurationProperties("app")
public class LoadConfigurationPropertiesConfiguration {

	private List<Menu> menus = new ArrayList<>();

	
	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	@PostConstruct
	public void hello() {
		System.out.println("@postConstruct: " + menus.size());
	}
	
	@Bean("allmenus")
	public List<Menu> returnallMenus() {
		return this.menus;
	}
}
