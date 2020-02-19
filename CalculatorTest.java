import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	@Test
	void testAdd() {
		Calculator test = new Calculator();
		assertEquals(5,test.add(2, 3));
		assertEquals(-5,test.add(2,-7));
		assertEquals(5,test.add(-2,7));
		assertEquals(0,test.add(2,-2));
	}
	@Test
	void testDivide() {
		Calculator test= new Calculator();
		
		assertEquals(2f,test.divide(4,2),0.0);
		assertEquals(-2f,test.divide(-4,2),0.0);
		assertEquals(2.5f,test.divide(5,2),0.0);
		assertEquals(3.3f,test.divide(10, 3),0.1);
		assertEquals(0.5f,test.divide(1,2));
		assertEquals(0,test.divide(0, 2));
		assertEquals(0,test.divide(0,-2));
		
		RuntimeException thrown1= assertThrows(RuntimeException.class,() ->test.divide(9,0));
		assertEquals("cannot divide by zero",thrown1.getMessage());
		
		RuntimeException thrown2= assertThrows(RuntimeException.class,() ->test.divide(0,0));
		assertEquals("cannot divide by zero",thrown2.getMessage());
	}
}