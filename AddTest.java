import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		Calculator test = new Calculator();
		int output = test.add(2, 3);
		assertEquals(5,output);
	}

}
