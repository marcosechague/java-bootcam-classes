package clase3.clases.avanzado;

/**
 * @author mechague
 * Disenho de clases
 */
// Encapsular
// Java bean
public class Cliente {
	
	private String nombre ;
	private String apellido;
	private String codigo;
	private int edad;
	
	public Cliente () {
	}
	
	//sobrecarga de contructor
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
