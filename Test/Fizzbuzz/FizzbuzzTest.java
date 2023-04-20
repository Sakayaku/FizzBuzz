package Fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzbuzzTest {

	private Fizzbuzz fb;
	
	@BeforeEach
	void setUp() throws Exception {
		fb=new Fizzbuzz();
	}

	@Test
	void repond1() {
		assertEquals("1",fb.fuzzBuzz(1));
	}
	
	@Test
	void repond2() {
		assertEquals("2",fb.fuzzBuzz(2));	
	}

}
