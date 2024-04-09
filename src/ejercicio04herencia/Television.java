package ejercicio04herencia;

/**
 * Clase que representa a un televisor y hereda de Electrodomestico
 */
public class Television extends Electrodomestico {
	
	/**
	 * Atributo que representa la resolución del televisor
	 */
	private int resolucion = 20;

	/**
	 * Atributo que representa el sintonizador TDT del televisor.
	 */
	private boolean sintonizador = false;

	/**
	 * Constructor vacío del televisor
	 */
	public Television() {
		super();
	}

	/**
	 * Constructor con los parámetros precioBase y peso del electrodoméstico
	 * @param precioBase El precio base del electrodoméstico
	 * @param peso El peso del electrodoméstico
	 */
	public Television(double precioBase, int peso) {
		// Llamamos al constructor del padre
		super(precioBase, peso);
	}

	/**
	 * Constructor con todos los parámetros
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param resolucion
	 * @param sintonizador
	 */
	public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion,
	boolean sintonizador) {
		// Invocamos al constructor del padre
		super(precioBase, color, consumoEnergetico, peso);
		
		// Asigna el valor de resolución sólo si es mayor que 0
		if(resolucion > 0) {
			this.resolucion = resolucion;
		}
		
		// Asignamos el valor directamente al sintonizador porque
		// sólo tendrá dos valores posibles al ser un boolean.
		this.sintonizador = sintonizador;
	}

	/**
	 * Método get que devuelve la resolución del televisor.
	 * @return Devuelve la resolución del televisor
	 */
	public int getResolucion() {
		return this.resolucion;
	}
	
	/**
	 * Método get que devuelve el sintonizador del televisor
	 * @return Devuelve el boolean del sintonizador del televisor
	 */
	public boolean getSintonizador() {
		return this.sintonizador;
	}
	
	/**
	 * Comprobamos si la resolución o el sintonizador cumplen unos
	 * requisitos para saber si aumentar el precio base o no.
	 */
	public void precioFinal() {
		if(resolucion >= 40) {
			double temp = precioBase * 30;
			temp /= 100;
			precioBase += temp;
		}
		
		if(sintonizador) {
			precioBase += 50;
		}
		
		// Llamamos al método del padre
		super.precioFinal();
	}

}
