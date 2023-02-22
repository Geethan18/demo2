package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class helloworld {
	@GetMapping("dis")
	public String show()
	{
		return "Hello World";
	}
	

}
