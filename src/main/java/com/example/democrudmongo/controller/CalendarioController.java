package com.example.democrudmongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.democrudmongo.model.Calendario;
import com.example.democrudmongo.model.Persona;
import com.example.democrudmongo.service.api.CalendarioServiceAPI;

@RestController
@RequestMapping("/calendario/api/v1")
@CrossOrigin("*")
public class CalendarioController {
	@Autowired
	private CalendarioServiceAPI calendarioServiceAPI;
	
	@PostMapping(value = "/save")
	public ResponseEntity<Calendario> save(@RequestBody Calendario calendario) {
		Calendario obj = calendarioServiceAPI.save(calendario);
		return new ResponseEntity<Calendario>(obj, HttpStatus.OK);
	}
	
	@GetMapping(value = "/find/{id}")
	public Calendario find(@PathVariable Long id) {
		return calendarioServiceAPI.get(id);
	}
}
