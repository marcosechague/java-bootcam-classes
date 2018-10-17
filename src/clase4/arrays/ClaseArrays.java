package clase4.arrays;

import clase3.clases.avanzado.Cliente;

public class ClaseArrays {

	public static void main(String[] args) {
		//definicion
		int[] a1 = new int[3];
		//carga
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 20;
		
		//carga en bucle
		for(int i=0 ; i < a1.length ; i++) {
			a1[i] = i*i;
		}
		
		//definicion con objetos
		Cliente[] ca = new Cliente[2];
		ca[0] = new Cliente(); 
		ca[0] = new Cliente();
		
		//array de 2 dimensiones
		String[][] a2 = new String[3][2];
		
		//carga de 2 dimensiones
		for(int i = 0 ; i < a2.length ;i++) {
			for(int j = 0 ; j < a2[i].length ;j++) {
				a2[i][j] = "";
			}
		}
		
		//otra forma de caarga
		int[] a11 = {10,20,30,40}; 
		
		int[][] a22 = {{10,20,30}, {10}, {20,30}, {20,30} };
		
		//en 2 dimensiones, sin definicion de la 2da dimension
		int [][] a23 = new int[5][];
		
		int dimension = 1;
		//carga
		for(int i = 0 ; i < a23.length ;i++) {
			a23[i] = new int[dimension++];
			for(int j = 0 ; j<a23[i].length; j++ ) {
				a23[i][j] = 10;
			}
		}
		
		//impresion
		for(int i = 0 ; i < a23.length ;i++) {
			for(int j = 0 ; j < a23[i].length ;j++) {
				System.out.println(a23[i][j]);
			}
		}
	}
}
