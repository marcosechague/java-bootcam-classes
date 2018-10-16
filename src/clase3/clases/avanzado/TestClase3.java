package clase3.clases.avanzado;

public class TestClase3 {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta(); //x1
		cuenta1.setNumero("11111");
		System.out.println("Nro cuenta1 = "+cuenta1.getNumero());
		Cuenta cuenta2 = new Cuenta(); //x2
		//cuenta1 y cuenta2 apuntan a una misma instancia
		cuenta1 = cuenta2; //x2
		cuenta1.setNumero("22222");
		//Con esto vemos que los cambios se dan en la misma instancia
		System.out.println("Nro cuenta2 = "+cuenta2.getNumero());
		
		
		//cuenta1 apunta a una nueva instanacia
		cuenta1 = new Cuenta(); //x3
		Cliente cliente = new Cliente("Juan", "Perez");
		cuenta1.setPropietario(cliente);
		System.out.println("Nro cuenta1 = "+cuenta1.getNumero());
		
		//################################################################3
		//Estrucura de control switch
		String comparar = "hola";
		switch (comparar) {
		case "":
			System.out.println("Esta vacio");
			break;
		case "hola":
			System.out.println("Saluda hola");
		case "que":
			System.out.println("dice 'que'");
		default:
			System.out.println("En el valor por defecto");
			break;
		}
		System.out.println("Continuar");
	}
}
