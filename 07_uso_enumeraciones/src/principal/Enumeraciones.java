package principal;

enum Orientacion{
	NORTE, SUR, ESTE, OESTE;
}

public class Enumeraciones {

	public static void main(String[] args) {
		Orientacion or=Orientacion.NORTE;
		
		switch (or) { // No hace falta poner todos los casos pero si un default
			case NORTE ->System.out.println("frío");
			case SUR ->System.out.println("calor");
			default -> System.out.println("no se sabe");
			
		}
		
		var res= switch (or) { // Cuando se asigna a una variable, SÍ hace falta poner todos los casos y NO defaul.
		case NORTE ->"frío";
		case SUR ->"calor";
		case ESTE ->"seco";
		case OESTE ->"húmedo";
		};
		
		System.out.println(res);

	}

}
