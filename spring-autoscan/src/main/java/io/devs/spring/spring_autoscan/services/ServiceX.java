package io.devs.spring.spring_autoscan.services;

import io.devs.spring.spring_autoscan.components.ComponentX;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceX {

	@Autowired
	private ComponentX componentX;

	@Value(":)")
	private String value;

	public String execute() {
		return "Loaded component: " + componentX + "    And value = " + value;
	}

}
