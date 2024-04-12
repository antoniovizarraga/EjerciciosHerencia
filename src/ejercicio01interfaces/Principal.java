package ejercicio01interfaces;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Socio[] listaSocios = new Socio[3];
		
		Socio s1 = new Socio(1, "Paco", 20);
		listaSocios[2] = s1;
		
		Socio s2 = new Socio(2, "Alex", 21);
		listaSocios[0] = s2;
		
		Socio s3 = new Socio(3, "José", 18);
		listaSocios[1] = s3;
		
		System.out.println(Arrays.toString(listaSocios));
		System.out.println();
		
		Arrays.sort(listaSocios);
		
		System.out.println(Arrays.toString(listaSocios));
		
		
		
		
		

	}

}
