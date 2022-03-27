package com.example.democrudmongo.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.democrudmongo.model.Calendario;

public interface CalendarioRepository extends MongoRepository<Calendario, Long>{

}
