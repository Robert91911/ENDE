package palindromo;

//editado
import junit.framework.TestCase;

public class PalindromoTest extends TestCase {
	public void testPalindromoPar() {
		assertTrue(Palindromo.funcion("anna"));
	}
	
	public void testNoPalindromoPar() {
		assertFalse(Palindromo.funcion("anne"));
	}
	
	public void testPalindromoImpar() {
		assertTrue(Palindromo.funcion("ana"));
	}
	
	public void testNoPalindromoImpar() {
		assertFalse(Palindromo.funcion("ola"));
	}
}
