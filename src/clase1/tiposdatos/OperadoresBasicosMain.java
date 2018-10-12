package clase1.tiposdatos;

import java.util.*;

class OperadoresBasicosMain {
	/**
	 * String Cadena de texto
	 * char Caracter
	 * int enteros
	 * byte 
	 * long enteros largos
	 * float flotantes
	 * double 
	 * boolean logico
	 */
	public static void main(String[] args){
		
		String argumento1 =args[0];
		System.out.println("El argumento ingresado es "+argumento1);
		byte  b = 1;//1 byte
		short  sh = 12; 
		float f = -12.0f;
		double d = 123.0;
		String str = "Hola Mundo";
		int i = 10;
		
		//imprimir en consola
		System.out.println(b);
		
		//operaciones arimeticas
		i = i + 1;
		i = i-2;
		i = i++;
		i= i--;
		i= 10%i;
		i = 10*5;
		i = 15/2;
		
		//if(expresion booleana)
		if(str=="Hola"){
			System.out.println("Es mayor a 10");
		}
		
		//for 
		for( int j=0; j<10; j=j+1 ){
			System.out.println(i);
		}

		//while
		while(d<500){
			System.out.println(d);
			d=d+200;
		}
		
		// do while
		//se ejecuta al menos una vez
		int cantidadEjecuciones = 0;
		do{
			cantidadEjecuciones++;
			System.out.println("Ejecucion nro "+cantidadEjecuciones+", d="+d);
			d=d+100;
		}while(d<1000);
		
		//leer por consola
		 Scanner in = new Scanner(System.in);
		 System.out.println("Ingrese un texto: ");
		 String s = in.nextLine();
		 System.out.println("Ingresaste: "+s);
	}
}
