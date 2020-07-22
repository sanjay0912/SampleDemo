package com.example.sampledemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleDemoController {
	
	@GetMapping("/")
	public String showDemo() {
		
		return " Welcome to Openshift demo";
	}

}
