package clase6.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfacesMain {

	public static void main(String...  args) {
		
		IntegranteSeleccionDeporte integrante = new Futbolista();
		
		integrante.concentrarse();
		integrante.entrenar();
		integrante.jugarPartido();
		integrante.viajar();
		
		integrante = new Entrenador();
		integrante.concentrarse();
		integrante.entrenar();
		integrante.jugarPartido();
		integrante.viajar();
		
		
		List<String> lista = new ArrayList<>();
		
		lista.add("1");
		lista.add("2");
		lista.add("3");
		
		lista.get(0);
		
		lista = new LinkedList<>();
		lista.add("1");
		lista.add("2");
		lista.add("3");
		
		
		
		
		
	}
	
}
