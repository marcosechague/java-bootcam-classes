package clase3.clases.avanzado;

public class Cuenta {

	private String numero;
	private double saldo;
	//Se compone de un atributo de la clase Cliente que creamos.
	private Cliente propietario;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getPropietario() {
		return propietario;
	}
	public void setPropietario(Cliente propietario) {
		this.propietario = propietario;
	}
	
	public void aumentar(double monto) {
		saldo += monto;
	}
	
	public void quitar(double monto) {
		saldo -= monto;
	}
	
	//sobrecarga de metodo
	public void quitar( double monto , boolean permiteMontoNegativo) {
		double saldoAnterior = saldo;
		saldo-= monto;
		if(!permiteMontoNegativo && saldo<0) {
			saldo = saldoAnterior;
		}
	}
}
