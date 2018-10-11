package clase2.clases;
/**
 * CLASES EN JAVA
 * @author mechague
 *
 */
class Persona {
	
	//atributos
	String nombre;
	String apellido;
	int edad;
	
	//Constructor
	Persona(){
	}
	
	Persona(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	//tipo retorno -  nombre metodo (Parametros)
	String getNombre(){
		return nombre;
	}
	
	//
	/**
	 * @param nombre El nombre de la persona
	 */
	void setNombre(String nombre){
		if(nombre.equals("Juan")){
			this.nombre="Sin nombre";
		}
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
