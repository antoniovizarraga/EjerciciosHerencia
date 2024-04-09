package ejercicio04herencia;

/**
 * Clase hija que hereda de electrodoméstico
 */
public class Lavadora extends Electrodomestico {
	
	/**
	 * Atributo que representa la carga de la lavadora
	 */
	private int carga = 5;
	
	/**
	 * Constructor vacío
	 */
	public Lavadora() {
		super();
	}
	
	/**
	 * Constructor con los parámetros precioBase, y peso (Herededos de electrodoméstico).
	 * @param precioBase El precio base del electrodoméstico
	 * @param peso El peso del electrodoméstico
	 */
	public Lavadora(double precioBase, int peso) {
		// Llamamos al constructor del padre
		super(precioBase, peso);
	}
	
	/**
	 * Constructor con todos los parámetros, incluido los heredados.
	 * @param precioBase El precio base del electrodoméstico
	 * @param color El color del electrodoméstico
	 * @param consumoEnergetico Consumo energético del electrodoméstico
	 * @param peso El peso del electrodoméstico
	 * @param carga La carga de la lavadora
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		
		// Llamamos al constructor del padre
		super(precioBase, color, consumoEnergetico, peso);
		
		// Comprobamos que la carga no sea negativa ni esté a 0
		if(carga > 0) {
			this.carga = carga;
		}
	}
	
	/**
	 * Método get que devuelve la carga de la lavadora
	 * @return Devuelve la carga de la lavadora
	 */
	public int getCarga() {
		return this.carga;
	}
	
	/**
	 * Método para comprobar el precio final de la lavadora.
	 */
	public void precioFinal() {
		
		// Si la lavadora es mayor o igual que 30, súmale 50
		if(carga >= 30) {
			precioBase += 50;
		}
		
		// Llamamos también al método del padre para que haga
		// el resto de comprobaciones.
		super.precioFinal();
	}
	
	
	
}
