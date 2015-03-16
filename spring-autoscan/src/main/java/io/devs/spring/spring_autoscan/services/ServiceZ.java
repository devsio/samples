package io.devs.spring.spring_autoscan.services;

import io.devs.spring.spring_autoscan.components.ComponentX;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("theZService")
public class ServiceZ {

	@Autowired
	private ComponentX componentX;

	public String execute() {
		return "The Z Service. Loaded component: " + componentX;
	}

}
