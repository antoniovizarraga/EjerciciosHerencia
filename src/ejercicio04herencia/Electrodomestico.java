package ejercicio04herencia;

/**
 * Crearemos una superclase llamada Electrodomestico que representará
 * los electrodomésticos.
 */
public class Electrodomestico {
	
	/**
	 * El precio del electrodoméstico
	 */
	protected double precioBase = 100;
	
	/**
	 * Los colores de todos los electrodomésticos. Lo hacemos como un enum
	 * para cumplir con el ejercicio y para reunir todos los posibles
	 * colores que puede tomar un electrodoméstico en un único campo.
	 */
	static protected enum ListaColores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	
	
	/**
	 * Los diferentes rangos de consumo que puede tener un electrodoméstico.
	 */
	static protected enum ListaConsumoEnergetico {
		A, B, C, D, E, F
	}
	
	/**
	 * El color de un electrodoméstico. Por defecto, tendrá el color blanco.
	 */
	protected ListaColores color = ListaColores.BLANCO;
	
	protected ListaConsumoEnergetico consumoEnergetico = ListaConsumoEnergetico.F;
	
	/**
	 * El peso del electrodoméstico.
	 */
	protected int peso = 5;
	
	public Electrodomestico() {
		
	}
	
	public Electrodomestico(double precioBase, int peso) {
		if(precioBase >= 1) {
			this.precioBase = precioBase;
		}
		
		if(peso >= 1) {
			this.peso = peso;
		}
	}
	
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
		if(precioBase >= 1) {
			this.precioBase = precioBase;
		}
		
		// Creamos el String temporal ya que lo necesitaremos para pasarlo
		// a mayúsculas (Ya que no podemos editar el atributo).
		String temp = color;
		
		temp = temp.toUpperCase();
		
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		
		
		if(peso >= -1) {
			this.peso = peso;
		}
	}
	
	public double getPrecioBase() {
		return this.precioBase;
	}
	
	public ListaColores getColor() {
		return this.color;
	}
	
	public ListaConsumoEnergetico getConsumoEnergetico() {
		return this.consumoEnergetico;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	private ListaConsumoEnergetico comprobarConsumoEnergetico(char letra) {
		
		// Creamos un String de manera temporal para poder usar la función
		// equals del String.
		String temp = String.valueOf(letra);
		
		// La convertimos a mayúsculas para evitar errores en el equals.
		temp = temp.toUpperCase();
		
		ListaConsumoEnergetico objADevolver = ListaConsumoEnergetico.F;
		
		// Recorremos el enum para saber si la letra está entre los
		// valores de dicho enum.
		
		for(ListaConsumoEnergetico valor : ListaConsumoEnergetico.values()) {
			
			/* SÉ QUE SI USO ESTO EN EL EXAMEN ES UN 0, pero es un foreach. Soy
			 * consciente. Por lo que tengo entendido, si es un foreach, no pasa
			 * nada. */
			if(temp.equals(valor)) {
				objADevolver = ListaConsumoEnergetico.valueOf(temp);
				break;
			}
		}
		
		
		return objADevolver;
	}
	
	private ListaColores comprobarColor(String color) {
		ListaColores objADevolver = ListaColores.BLANCO;
		
		
		
		for(ListaColores valor : ListaColores.values()) {
			if(color.equals(valor)) {
				objADevolver = ListaColores.valueOf(color);
				break;
			}
		}
		
		
		return objADevolver;
		
	}
	
	/* Entiendo aquí por: "aumentar su precio base" que le suma un valor
	 * de euros como se indica en la tabla. Igualmente, si me he equivocado
	 * en la operación, se podría cambiar sin ningún problema o dificultad. */
	public void precioFinal() {
		switch(this.consumoEnergetico) {
		
		case A:
			this.precioBase += 100;
			break;
		case B:
			this.precioBase += 80;
			break;
		case C:
			this.precioBase += 60;
			break;
		case D:
			this.precioBase += 50;
			break;
		case E:
			this.precioBase += 30;
			break;
		case F:
			this.precioBase += 10;
			break;
		
		}
		
		if(peso > 0 && peso <= 19) {
			precioBase += 10;
		} else if(peso >= 20 && peso <= 49) {
			precioBase += 50;
		} else if(peso >= 50 && peso <= 79) {
			precioBase += 80;
		} else if(peso >= 80) {
			precioBase += 100;
		}
		
		
	}
	
}
