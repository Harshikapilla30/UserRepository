package com.cg.OnlinePizza;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class OnlinePizzaOrderingApplicationTests {

	@Test
	void contextLoads() {
	}

}
