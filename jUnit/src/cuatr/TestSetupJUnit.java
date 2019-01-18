package cuatr;

import junit.framework.TestCase;

public class TestSetupJUnit extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testAdivina3() {
		fail("Not yet implemented");
	}

	public void testIntento() {
		Adivina3 ad1 = new Adivina3(4);
	}

	public void testExito() {
		Adivina3 ad1 = new Adivina3(0);
		ad1.exito();
		
	}

	public void testQuedanIntentos() {
		fail("Not yet implemented");
	}

}
