package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test	
	public void testAdd() {
		assertEquals (5,Calc.add(2, 3));
	}
	@Test
	public void testMinus() {
		assertEquals (3,Calc.minus(5, 2));
	}
	@Test
	public void testMulti() {
		assertEquals (10,Calc.multi(2, 5));
	}
	@Test
	public void testDivide() {
		assertEquals (4,Calc.divide(8, 2));
	}


}
