package com.example.democrudmongo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.democrudmongo.commons.GenericServiceImpl;
import com.example.democrudmongo.dao.api.CalendarioRepository;
import com.example.democrudmongo.model.Calendario;
import com.example.democrudmongo.service.api.CalendarioServiceAPI;

@Service
public class CalendarioServiceImpl extends GenericServiceImpl<Calendario, Long> implements CalendarioServiceAPI {
	
	@Autowired
	private CalendarioRepository calendarioRepository;
	
	@Override
	public CrudRepository<Calendario, Long> getDao() {
		return calendarioRepository;
	}

}

