package lab3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void testPriceVar() {
		Product prod = new Product("Dr. Pepper", 1.25);
		double expected = 1.25;
		double actual = prod.getProdPrice();
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testPriceVarForLessThanZero() {
		Product prod = new Product("Dr. Pepper", -1.99);
		double expected = 0.25;
		double actual = prod.getProdPrice();
		assertEquals(expected, actual, 0);
	}

}
