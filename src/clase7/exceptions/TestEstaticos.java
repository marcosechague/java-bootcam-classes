package clase7.exceptions;

public class TestEstaticos {
	
	public static void main(String[] args) {
		System.out.println(TestExcepcion2.s1);	
		TestExcepcion2.main(null);
		System.out.println(TestExcepcion2.s1);
		TestExcepcion2 t2 = new TestExcepcion2();
		System.out.println(t2.s2);
		new TestEstaticos().metodo();
	}
	
	public void metodo() {
		TestExcepcion2.main(null);
	}
}
