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
	void fizzbuzz_repond_1_pour_1() {
		assertEquals("1",fb.fuzzBuzz(1));
	}
	
	@Test
	void fizzbuzz_repond_2_pour_2() {
		assertEquals("2",fb.fuzzBuzz(2));	
	}
	
	@Test
	void fizzbuzz_repond_3_pour_3() {
		assertEquals("fizz",fb.fuzzBuzz(3));	
	}

}
