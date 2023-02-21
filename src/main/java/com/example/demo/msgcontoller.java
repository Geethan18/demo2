package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class msgcontoller {
@GetMapping("/link")
public String checkApi() throws JsonProcessingException{
	
	msgs response = new msgs("Hello!");
	ObjectMapper obj=new ObjectMapper();
	return obj.writeValueAsString(response);
}

}
