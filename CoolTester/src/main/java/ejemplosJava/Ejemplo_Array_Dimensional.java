package ejemplosJava;

public class Ejemplo_Array_Dimensional {

	public static void main(String[] args) {
	 
		//Declaramos e iniciamos a un arreglo 2d
		int arr[][] = {{2, 7, 9},{3, 6, 1},{7, 6, 1}};
		
		//System.out.println (arr[0][0];
		
		//Imprimir array 2d 
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " "); //print para imprimir en la misma linea
			}
			    System.out.println();
		}
		
	}

}
