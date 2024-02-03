package ejemplosJava;

public class Demovehiculos {

	public static void main(String[] args) {
		
		vehiculo minivan = new vehiculo();
		
		int rango;
		
		//Asignar los valores a los campos minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calcular el rango asumiendo un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeron con un rango de " + rango + " Kilomentros");
		
		vehiculo carro = new vehiculo();
		
		carro.pasajeros = 4;
		
		System.out.println("Numero de pasajeros en carro es: " + carro.pasajeros);
		

	}

}
