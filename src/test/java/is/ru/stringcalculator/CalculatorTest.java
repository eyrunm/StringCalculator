package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
    public void testMultipleNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Test( expected = IllegalArgumentException.class )
    public void testNegativeNumbers(){
    	thrown.expect(IllegalArgumentException.Calculator.Add("-1"));
    }
	
	@Test
    public void testNegativeNumbers(){
    	assertEquals(2, Calculator.add("-100,2"));
    }

    @Test
	public void testNewLine() {
		assertEquals(3, Calculator.add("1,\n2"));
	}

	@Test
	public void testDelimeter() {
		assertEquals(4, Calculator.add("1;3"));
	}		

}