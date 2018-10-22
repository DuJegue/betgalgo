package br.betgalgo.commons.util;

import org.springframework.beans.factory.annotation.Autowired;

public class ConfigProperties {
	
	@Autowired
	private UserProperties userProperties;
	
	@Autowired
	private EmailProperties emailProperties;

	public UserProperties getUserProperties() {
		return userProperties;
	}

	public EmailProperties getEmailProperties() {
		return emailProperties;
	}
	
} 