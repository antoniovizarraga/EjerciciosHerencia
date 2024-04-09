package ejercicio04herencia;

public class ClaseEjecutable {
	public static void main(String[] args) {
		Electrodomestico[] listaDisp = new Electrodomestico[10];
		
		Electrodomestico mando = new Electrodomestico(5, "Negro", 'B', 1);
		Lavadora Jojolavadora = new Lavadora(230, "Blanco", 'F', 20, 40);
		Television televisorMisterioso = new Television(200, "Gris", 'C', 10, 72, false);
		Television televisorHD = new Television(240, "Negro", 'A', 15, 96, true);
		Electrodomestico neveraInteligente = new Electrodomestico(150, "Blanco", 'A', 20);
		Lavadora lavadoraDeLola = new Lavadora(210, "Gris", 'D', 15, 70);
		Electrodomestico relojIot = new Electrodomestico(100, "rojo", 'C', 5);
		Electrodomestico alarmaIot = new Electrodomestico(150, "azul", 'B', 10);
		Electrodomestico ratonGaming = new Electrodomestico(60, "Negro", 'B', 1);
		Electrodomestico tecladoConPantalla = new Electrodomestico(150, "Blanco", 'A', 10);
		
		listaDisp[0] = mando;
		listaDisp[1] = Jojolavadora;
		listaDisp[2] = televisorMisterioso;
		listaDisp[3] = televisorHD;
		listaDisp[4] = neveraInteligente;
		listaDisp[5] = lavadoraDeLola;
		listaDisp[6] = relojIot;
		listaDisp[7] = alarmaIot;
		listaDisp[8] = ratonGaming;
		listaDisp[9] = tecladoConPantalla;
		
		double sumaElectrodomestico = 0;
		double sumaTelevisor = 0;
		double sumaLavadora = 0;
		
		// Aquí iría quizás un forEach, pero al ser
		// de tipo objeto lo que se mete, no sé cómo
		// se haría para imprimir los valores o usar
		// métodos de dicho objeto.
		for(int i = 0; i < listaDisp.length; i++) {
			listaDisp[i].precioFinal();
			
			System.out.println(listaDisp[i].getPrecioBase());
			
			if(listaDisp[i] instanceof Electrodomestico) {
				sumaElectrodomestico += listaDisp[i].getPrecioBase();
			} else if(listaDisp[i] instanceof Lavadora) {
				sumaLavadora += listaDisp[i].getPrecioBase();
			} else {
				sumaTelevisor += listaDisp[i].getPrecioBase();
			}
		}

		System.out.println();
		System.out.println("Electrodomésticos: " + sumaElectrodomestico);
		System.out.println("Lavadoras: " + sumaLavadora);
		System.out.println("Televisores: " + sumaTelevisor);
	}
}
