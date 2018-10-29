package clase6.interfaces;

import java.util.NavigableSet;

public class Futbolista extends SeleccionFutbol{
	
	private String numero;
	private String 	posicion;
	
	@Override
	public void concentrarse() {
		System.out.println("Futbolista se concentra");
		
	}
	@Override
	public void viajar() {
		System.out.println("Futbolista viaja");
		
	}
	@Override
	public void entrenar() {
		System.out.println("Futbolista entrena"); 
	}
	@Override
	public void jugarPartido() {
		System.out.println("Futbolista juega el partido");
		
	}
	@Override
	public String metodo() {
		System.out.println("mETODO DEL Futbollista");
		return "Furbolista" ;
	}
	@Override
	public void metodoPrueba() {
		// TODO Auto-generated method stub
		
	}
	
	
}
