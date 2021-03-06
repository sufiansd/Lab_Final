package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void testFindMax()
	{
		assertEquals(9, calculator.findMax(7, 8, 9));
	}
	
	@Test
	public void testSecondFindMax()
	{
		assertEquals(2, calculator.findMax(0, 1, 2));
	}
	
	@Test
	public void testThirdFindMax()
	{
		assertEquals(0, calculator.findMax(0, -1, -2));
	}
	
	@Test
	public void testSquare()
	{
		assertEquals(4, calculator.square(2));
	}
	
	@Test
	public void testTwoSquare()
	{
		assertEquals(9, calculator.square(3));
	}
	
	@Test
	public void testThreeSquare()
	{
		assertEquals(16, calculator.square(4));
	}
			
	
	@Test
	public void testCube()
	{
		assertEquals(8, calculator.cube(2));
	}
	
	@Test
	public void testSecondCube()
	{
		assertEquals(27, calculator.cube(3));
	}
	
	@Test
	public void testThirdCube()
	{
		assertEquals(64, calculator.cube(4));
	}
	
	@Test
	public void testNull()
	{
		assertNotNull(calculator);
	}
}
