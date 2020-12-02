package com.cg.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinepizza.model.Pizza;

public interface IPizzaRepository extends JpaRepository<Pizza, Integer>{

	
}
