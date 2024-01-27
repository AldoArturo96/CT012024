package ejemplosJava;

public class Ejemplo_if_switch {

	public static void main(String[] args) {
		
		int i = 3;
		
		switch (i) {
		case 0:
			System.out.println("i es igual a cero");
			break;
		case 1:
			System.out.println("i es igual a uno");
			break;
		case 2:
			System.out.println("i es igual a dos");
			break;
		default:
			System.out.println("i es mayor que 2");
			break;
		}
		

	}

}
