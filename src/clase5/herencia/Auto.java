package clase5.herencia;

//JAVA BEAN
public class Auto {
	
	//public cualquier clase puede acceder al atributo
	//protected accedidos por las clases que estan en el mismo paquete, y las clases hijas
	//defaul accedidos solamente por clases del mismo paquete
	//private accediso solo por la misma clase
	
	public int kilometraje;
	
	 String nroChapa;
	
	protected String marca;
	
	private boolean chocado;
	
	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getNroChapa() {
		return nroChapa;
	}
	public void setNroChapa(String nroChapa) {
		this.nroChapa = nroChapa;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean getChocado() {
		return chocado;
	}

	public void setChocado(boolean chocado) {
		this.chocado = chocado;
	}

	public String obtenerDescripcion() {
		return "Esta es la descripcion";
	}
}
