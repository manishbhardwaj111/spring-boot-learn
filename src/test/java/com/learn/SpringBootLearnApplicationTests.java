package com.learn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringBootLearnApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
   	 public void testAlwaysPasses() {
        	assertTrue(false);
    	}

}
