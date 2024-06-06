package consola;

import java.io.Console;

public class Consola {

	public static void main(String[] args) {
		Console con=System.console();
		String lenguaje="Java";
		con.printf("Bienvenido a "+ lenguaje);
		con.printf("Dime tu nombre:");
		String nombre=con.readLine();
		con.printf("Te llamas "+nombre);
	}

}
