package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class color {
	private String ColourName="Green";
	@GetMapping("/colour")
	public String getColour() {
		return "Welcome "+ColourName;
	}

}


