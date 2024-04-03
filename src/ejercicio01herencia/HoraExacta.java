package ejercicio01herencia;

/**
 * A partir de la clase Hora, implementar la clase HoraExacta, que incluye en la
 * hora los segundos. Además de los métodos heredados de Hora
 */
public class HoraExacta extends Hora {

	/**
	 * Atributo que rige los segundos del reloj.
	 */
	private int segundo;

	/**
	 * Constructor con los datos pasados como parámetros
	 * 
	 * @param hora    Atributo de la clase padre pasado como parámetro que
	 *                representa las horas del reloj.
	 * @param minuto  Atributo de la clase padre pasado como parámetro que
	 *                representa los minutos del reloj.
	 * @param segundo Atributo de la clase padre pasado como parámetro que
	 *                representa los segundos del reloj
	 */
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);

		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}

	/**
	 * Función que devuelve el atributo segundo.
	 * 
	 * @return Devuelve el valor del atributo segundo
	 */
	public int getSegundo() {
		return this.segundo;
	}

	/**
	 * Función que establece un valor al atributo segundo
	 * 
	 * @param valor Se le pasa como parámetro el valor a establecer al atributo
	 * @return Devuelve true o false indicando si se pudo realizar la operación de
	 *         escritura.
	 */
	public boolean setSegundo(int valor) {
		boolean transaccion = false;

		if (valor >= 0 && valor <= 59) {
			this.segundo = valor;
			transaccion = true;
		}

		return transaccion;
	}

	/**
	 * Función que suma un segundo más al reloj.
	 */
	@Override
	public void inc() {
		this.segundo++;
		if (segundo == 60) {
			segundo = 0;
			super.inc();
		}
	}

	/**
	 * Función que devuelve un String con la representación de la hora:
	 * hora:minutos:segundos. Ejemplo: 03:05:58
	 * 
	 */
	@Override
	public String toString() {
		String textoAImprimir = super.toString();
		
		textoAImprimir += ":";
		
		if(segundo < 10) {
			textoAImprimir += "0";
		}

		textoAImprimir += segundo;
		
		return textoAImprimir;
	}

}
