package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1")
public class Demo {

	@GetMapping("/{teste}")
	public ResponseEntity<?> teste(String teste){
		return ResponseEntity.ok(teste);
	}
	
}
