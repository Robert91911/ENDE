package cuatr;


public class Adivina3 {
	
	private int intentos;
	private int objetivo;
	private boolean exito;
	private final int MAX = 3;
	
	public Adivina3(int obj) {
		super();
		intentos = 0;
		objetivo = obj;
		exito = false;
	}
	
	public void intento(int valor) {
		if(!exito) {
			if(intentos < MAX) {
				if(valor == objetivo) {
					exito = true;
				}
					intentos++;
			}
		}
	}
	
	public boolean exito() {
		return exito;
	}
	
	public int quedanIntentos() {
		return MAX - intentos;
	}

}
