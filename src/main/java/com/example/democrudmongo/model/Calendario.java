package com.example.democrudmongo.model;

import java.util.List;
import org.springframework.data.annotation.Id;

public class Calendario {
	@Id
	private Long id;
	private String name;
	private List<Horario> lunes;
	
	
	
	public Calendario() {}
	
	public Calendario(Long id, String name, List<Horario> lunes) {
		
		this.id = id;
		this.name = name;
		this.lunes = lunes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Horario> getLunes() {
		return lunes;
	}
	public void setLunes(List<Horario> lunes) {
		this.lunes = lunes;
	}
	
	
	
	
}
