package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Test;

@RestController
@RequestMapping("/api/v1/tests")
public class TestController {

	@GetMapping
	public List<Test> list(){
		List<Test> tests = new ArrayList<>();
		Test test = new Test();
		
		test.ID = 12;
		test.Name = "Ahmet";
		test.Email = "ahmet@gmail.com";
		
		tests.add(test);
		
		
		return tests;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Test test) {}
	
	@GetMapping("/{id}")
	public Test get(@PathVariable("id") long id){
		return new Test(); 
		}
	
}
