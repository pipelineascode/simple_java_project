package my.simplejavaproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAdd()
	{
	
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		assertEquals(3, result);
		
	}
}
