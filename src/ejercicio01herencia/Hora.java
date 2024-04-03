package ejercicio01herencia;

/**
 * Diseñar la clase Hora, que representa un instante de tiempo compuesto por la
 * hora (de 0 a 23) y los minutos.
 */
public class Hora {

	/**
	 * Atributo que representa las horas del reloj.
	 */
	protected int hora;

	/**
	 * Atributo que representa los minutos del reloj.
	 */
	protected int minuto;

	/**
	 * Constructor que recoge los datos pasados como parámetros. Comprueba si los
	 * valores de entrada son correctos.
	 * 
	 * @param hora
	 * @param minuto
	 */
	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}

		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
	}

	/**
	 * Función que incrementa la hora en un minuto.
	 * 
	 */
	public void inc() {
		if (hora == 23 && minuto == 59) {
			hora = 0;
			minuto = 0;
		} else if (minuto == 59) {
			hora++;
			minuto = 0;
		} else {
			minuto++;
		}

	}

	/**
	 * Función que devuelve el atributo hora
	 * 
	 * @return Devuelve el valor del atributo hora
	 */
	public int getHora() {
		return this.hora;
	}

	/**
	 * Función que devuelve lo que valga el atributo minuto
	 * 
	 * @return Devuelve el valor del atributo minuto
	 */
	public int getMinuto() {
		return this.minuto;
	}

	/**
	 * Función que establece un valor al atributo minutos
	 * 
	 * @param valor Se le pasa como parámetro el valor a establecer al atributo
	 *              minuto.
	 * @return Devuelve true o false indicando si se pudo añadir el valor o no.
	 */
	public boolean setMinutos(int valor) {
		boolean transaccion = false;

		if (valor >= 0 && valor <= 59) {
			this.minuto = valor;
			transaccion = true;
		}

		return transaccion;
	}

	/**
	 * Función que establece un valor al atributo hora
	 * 
	 * @param valor Se le pasa como parámetro el valor a establecer al atributo
	 *              hora.
	 * @return Devuelve true o false indicando si se pudo añadir el valor o no.
	 */
	public boolean setHora(int valor) {
		boolean transaccion = false;

		if (valor >= 0 && valor <= 23) {
			this.hora = valor;
		}

		return transaccion;
	}

	/**
	 * Función que devuelve un String con la representación de la hora:
	 * hora:minutos. Ejemplo: 3:05
	 */
	public String toString() {
		String textoAImprimir = "";

		if(hora < 10) {
			textoAImprimir += "0" + hora + ":";
		} else {
			textoAImprimir += hora + ":";
		}
		
		if(minuto < 10) {
			textoAImprimir += "0" + minuto;
		} else {
			textoAImprimir += minuto;
		}	
		
		return textoAImprimir;
	}
	
	
}
