package calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTestDMesa {

	static Calculadora calc;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
		calc = new Calculadora();
	}
	
	@Before
	public void before() {
		System.out.println("before()");
		calc = new Calculadora();
		calc.clear();
	}
	
	@After
	public void after() {
		System.out.println("after()");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	
	@Test
	public void testSum() {
		System.out.println("sum()");
		int resul = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, resul);
	}

	@Test
	public void testAnsSum() {
		System.out.println("ansSum()");
		calc.add(3, 2);
		int resul = calc.ans();
		int esper = 5;
		assertEquals(esper, resul);
	}
	
	@Test
	public void testDiv() {
		calc.div(5,2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivPorCero() {
		calc.div(5,  0);
	}
	

}
