package com.lti.training.security;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.xml.internal.ws.api.WebServiceFeatureFactory;





public class SecurityConfiguration extends WebServiceFeatureFactory
{

	
	@Autowired
	public void configurableGobalSecurity() {
		
	}
}
