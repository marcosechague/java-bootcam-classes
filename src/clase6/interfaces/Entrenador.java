package clase6.interfaces;

public class Entrenador extends SeleccionFutbol {
	
	private String federacion;
	
	@Override
	public void jugarPartido() {
		System.out.println("Entrenador juega el partido");
		
	}
	@Override
	public String metodo() {
		System.out.println("mETODO DEL Entrenador");
		return "Furbolista" ;
	}
	@Override
	public void metodoPrueba() {
		// TODO Auto-generated method stub
		
	}
}
