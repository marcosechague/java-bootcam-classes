package clase7.exceptions;

public class TestExcepcion2 {

	static String s1 = "Estatico 1";
	String s2 = "Estatico 2";
	
	 public static void main(String[] args) {
	        String str1="120";
		String str2="3";
	        String respuesta;
		int numerador, denominador, cociente;
	        try{
	            numerador=Integer.parseInt(str1);
	            denominador=Integer.parseInt(str2);
				rango(numerador, denominador);
	            cociente=numerador/denominador;
	            respuesta=String.valueOf(cociente);
	        }catch(NumberFormatException ex){
	            respuesta="Se han introducido caracteres no numéricos";
	        }catch(ArithmeticException ex){
	            respuesta="División entre cero";
	        }
	        catch(ExcepcionIntervalo ex){
	            respuesta=ex.getMessage();
	        }finally {
				System.out.println(s1);
				s1 = "Estatico alterado";
				TestExcepcion2 t = new TestExcepcion2();
				t.s2 = "Otro valor t2";
				System.out.println(t.s2);
	        }
	        System.out.println(respuesta);
	    }
	 
	 static void rango(int num, int den) throws ExcepcionIntervalo {
	        rangoInterno(num, den);
	    }
	 
	 static void rangoInterno(int num, int den) throws ExcepcionIntervalo{
	        if((num>100)||(den<-5)){
	            throw new ExcepcionIntervalo("Números fuera de rango");
	        }
	    }
	 
	
}
