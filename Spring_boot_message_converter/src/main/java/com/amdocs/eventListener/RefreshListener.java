package com.amdocs.eventListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class RefreshListener {

	@Autowired
	private RequestMappingHandlerAdapter requestMappingHandlerAdapter;
	
	public void handleContextRefresh(ContextRefreshedEvent event) {
		requestMappingHandlerAdapter.getMessageConverters()
			.stream()
			.forEach(System.out::println);
	}
}
