package ejercicio01herencia;

public class Principal {

	public static void main(String[] args) {
		HoraExacta he = new HoraExacta(23, 59, 58);
		
		he.inc();
		
		System.out.println(he);

	}

}
