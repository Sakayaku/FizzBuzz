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
	
	@Test
	void fizzbuzz_repond_un_entier() {
		assertEquals("4",fb.fuzzBuzz(4));
		assertEquals("7",fb.fuzzBuzz(7));	
		assertEquals("13",fb.fuzzBuzz(13));		
		
	}
	
	@Test
	void fizzbuzz_repond_buzz() {
		assertEquals("buzz",fb.fuzzBuzz(5));	
	}
	
	@Test
	void fizzbuzz_repond_correctement_sur_multiple() {
		assertEquals("fizz",fb.fuzzBuzz(6));
		assertEquals("buzz",fb.fuzzBuzz(400));
	}
	
	@Test
	void fizzbuzz_repond_fizzbuzz() {
		assertEquals("fizzbuzz",fb.fuzzBuzz(15));
	}

}
