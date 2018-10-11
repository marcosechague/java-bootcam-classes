package clase2.clases;

	/**
	 * CLASES EN JAVA
	 * @author mechague
	 *
	 */

public class Auto {

	double peso;
	double altura;
	int numeroPuertas;
	boolean encendido;
	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	void encender(){
		System.out.println("Encendiendo auto..");
		encendido = true;
	}
	
	void apagar(){
		System.out.println("Apagando auto..");
		encendido = false;
	}
	
	
	
}
