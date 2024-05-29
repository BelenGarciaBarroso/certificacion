package operaciones;

import util.Utilidades;

public class Calculadora {
	
	public int suma (int a, int b) {
		return a+b;
	}
	
	public int multi (int a, int b) {
		return a*b;
	}
	
	public int resta (int a, int b) {
		return Utilidades.mayor(a, b)-Utilidades.menor(a, b);
	}
	
	public int dividir (int a, int b) {
		return Utilidades.mayor(a, b)/Utilidades.menor(a, b);
	}

}
