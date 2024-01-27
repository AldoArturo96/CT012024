package ejemplosJava;

public class Ejemplo_Array {

	public static void main(String[] args) {
		//Ejemplos de declaración de arreglos
		int IntArray[];
		int []IntArray2;
		double DoubleArray[];
		
		//Declarar un arreglo de strings
		String[] arr;
		
		//Asignar memoria para 5 strings
		arr = new String[5];
		
		//Inicializar el primer elemento del arreglo
		arr[0] = "cero";
		
		//Inicializar del segundo elemento del arreglo
		arr[1] = "uno";
		
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		//Ejemplo de imprimir cada posición del arreglo individualmente
		//System.out.println("La posisición del arreglo es: " + arr[0]);
		//System.out.println("La posisición del arreglo es: " + arr[1]);
		//System.out.println("La posisición del arreglo es: " + arr[2]);
		//System.out.println("La posisición del arreglo es: " + arr[3]);
		System.out.println("La posisición del arreglo es: " + arr[3]);
		System.out.println();
		
		for(int i = 0; i < arr.length; i++)
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		
	}
	
	//Ejemplo de arreglo con enteros
	int[] intArr = new int [] {1,2,3,4,5,6,7,8};
	
}



