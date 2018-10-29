package clase5.herencia.interno;

import clase5.herencia.Taxi;

public class HerenciaInternoMain {

	public static void main(String... args) {
		
		Taxi taxi = new Taxi();
		
		System.out.println(taxi.parada);
		System.out.println(taxi.kilometraje);
		//En un paquete diferente
		//System.out.println(taxi.marca);
		//System.out.println(taxi.nroChapa);
		
		
	}
	
	public String x(String s, Object o , Integer... i) {
		return "";
	}
	
}
