import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		int result=test.divide(6,2);
		assertEquals(3,result);
		
	
	}

}
