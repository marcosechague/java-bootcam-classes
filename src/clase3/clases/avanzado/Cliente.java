package clase3.clases.avanzado;

// Encapsular
// Java bean
public class Cliente {
	
	// private --solo clases
	// default -- solo lo que estan en el mismo paquete
	// protected -- en el mismo paquete e hijos
	// public -- todos
	
	private String nombre ;
	private String apellido;
	private String codigo;
	private int edad;
	
	public Cliente () {
	}
	
	//sobrecarga
	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre==null) {
			this.nombre = "S/N";
		}else {
			this.nombre = nombre;
		}
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
