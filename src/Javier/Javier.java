package Javier;

public class Javier {

	public static void main(String[] args) {
		String nombre = "Javier";
		
		System.out.println(darNombre(nombre));
		System.out.println("Mis hobbies son:");
		darHoby();

	}
		public static String darNombre(String a) {
			return ("Hola soy "+a);
		}
		public static void  darHoby() {
			 System.out.println("Pescar");
			 System.out.println("Futbol");
			 System.out.println("Micología");

			 System.out.println("mis comidas son");
			 
			 System.out.println("pizza");
			 System.out.println("chuleton");
			 System.out.println("pasta");
			
		}
}
