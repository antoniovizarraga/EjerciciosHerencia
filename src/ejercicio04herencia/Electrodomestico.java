package ejercicio04herencia;

/**
 * Crearemos una superclase llamada Electrodomestico que representará
 * los electrodomésticos.
 */
public class Electrodomestico {
	
	/**
	 * El precio del electrodoméstico
	 */
	protected double precioBase;
	
	/**
	 * Los colores de todos los electrodomésticos. Lo hacemos como un enum
	 * para cumplir con el ejercicio y para reunir todos los posibles
	 * colores que puede tomar un electrodoméstico en un único campo.
	 */
	protected enum ListaColores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	
	
	/**
	 * Los diferentes rangos de consumo que puede tener un electrodoméstico.
	 */
	protected enum ListaConsumoEnergetico {
		A, B, C, D, E, F
	}
	
	protected String color = "BLANCO";
	
	/**
	 * El peso del electrodoméstico.
	 */
	protected int peso;
	
	
}
