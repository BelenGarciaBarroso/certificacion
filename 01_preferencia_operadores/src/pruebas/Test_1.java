package pruebas;

public class Test_1 {

	public static void main(String[] args) {
		int a=2, b=7, c=1;
		System.out.println(c+=b+a);
		// primero suma a+b=9
		// luego le suma c ->1+9
		// reusltado 10
		
		System.out.println(c*=b+a);
		// c ya es igual a 10, por el syso anterior
		// primero suma a+b=9
		// luego se multiplica por c ->9*10
		// reusultado 90
		
		

	}

}
