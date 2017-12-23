package com.amdocs.appConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amdocs.appService.SomeInterface;
import com.amdocs.appService.SomeInterfaceImplAmit;
import com.amdocs.appService.SomeOtherInterface;
import com.amdocs.appService.SomeOtherInterfaceImplAmit;

@Configuration
public class AppConfiguration {

	@Bean
	public SomeInterface someInterface(SomeOtherInterface someOtherInface) {
		someOtherInface.someOtherMethod();
		return new SomeInterfaceImplAmit();
	}
	
	@Bean
	public SomeOtherInterface amit_someOtherInterface() {
		return new SomeOtherInterfaceImplAmit();
	}
}
