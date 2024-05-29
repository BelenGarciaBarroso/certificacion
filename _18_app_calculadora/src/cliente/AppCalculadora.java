package cliente;

import java.util.Scanner;

import operaciones.Calculadora;

public class AppCalculadora {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduce número 1:");
		n1=sc.nextInt();
		System.out.println("Introduce número 2:");
		n2=sc.nextInt();
		
		Calculadora cal=new Calculadora();
		System.out.println("Suma: "+cal.suma(n1, n2));
		System.out.println("Multiplicación: "+cal.multi(n1, n2));
		System.out.println("Resta: "+cal.resta(n1, n2));
		System.out.println("División: "+cal.dividir(n1, n2));
		
	}

}
