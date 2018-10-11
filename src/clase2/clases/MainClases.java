package clase2.clases;

public class MainClases {
	
	public static void main(String[] args){
		
		Persona persona = new Persona();
		persona.setNombre("Juan");
		persona.setApellido("Perez");
		persona.setEdad(20);
		
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellido());
		System.out.println(persona.getEdad());
		
		persona = new Persona("Maria", "Martinez", 25);
		
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellido());
		System.out.println(persona.getEdad());
		
		Auto auto = new Auto(); 
		auto.encender();
		System.out.println(auto.isEncendido());
		
	}

}
