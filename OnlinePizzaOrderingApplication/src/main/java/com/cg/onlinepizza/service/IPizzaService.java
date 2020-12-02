package com.cg.onlinepizza.service;

import java.util.List;

import com.cg.onlinepizza.exceptions.InvalidMinCostException;
import com.cg.onlinepizza.exceptions.PizzaIdNotFoundException;
import com.cg.onlinepizza.model.Pizza;

public interface IPizzaService {

	Pizza addPizza(Pizza pizza);

	Pizza updatePizza(Pizza pizza);

	Pizza deletePizza(int pizza);

	List<Pizza> viewPizzaList();

	Pizza viewPizza(int pizzaId) throws PizzaIdNotFoundException;

	List<Pizza> viewPizzaList(double minCost, double maxCost)throws InvalidMinCostException ;

	List<Pizza> viewPizza(String pizzaType);

}
