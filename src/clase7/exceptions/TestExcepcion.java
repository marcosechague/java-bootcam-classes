package clase7.exceptions;

public class TestExcepcion {

	
	public static void main(String[] args) {

		Integer i = 1;
		Integer j = 2;
		String cadenaNula = null;

		try {
			j=null;
			System.out.println(i+j); //NullPounter
			System.out.println("Paso aqui");
		}catch(ArithmeticException ex) {
			System.out.println("Capturo el Aritmetic");
		}catch(Exception e) {
			System.out.println("Capturo el Runtime ex"+e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("FINALMENTE ESTO");
		}
		
		
//		cadenaNula.equals("cualquier cosa");
		
		//Aritmetic exception
		
		//Array inex out bounds
		
		
	}
}
