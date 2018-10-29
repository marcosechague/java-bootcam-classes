package clase6.interfaces;


public abstract class SeleccionFutbol implements IntegranteSeleccionDeporte{

		protected int id;

		protected String nombre;

		protected String apellidos;

		protected int edad;

		public abstract String metodo();
		
		public String metodoNoAbstracto() {
			return ""; 
		}
		
		@Override
		public void concentrarse() {
			System.out.println("Concentra por defecto");
		}
		
		@Override
		public void viajar() {
			System.out.println("Viaja por defecto");
		}
		
		@Override
		public void entrenar() {
			System.out.println("Entrena la seleccion"); 
		}
		
}
