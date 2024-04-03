package ejercicio02herencia;

/**
 * Clase que representa a un empleado
 */
public class Empleado {
	/**
	 * Atributo que será el nombre del empleado
	 */
	private String nombre = "";
	
	/**
	 * Constructor de empleado sin parámetros
	 */
	public Empleado() {
		
	}
	
	/**
	 * Constructor de empleado que asignará al atributo nombre el valor del parámetro
	 * @param nombre El valor que le asignaremos al atributo nombre
	 */
	public Empleado(String nombre) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Método get que devuelve el nombre del Empleado
	 * @return Devuelve lo que valga el atributo nombre
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Método set que establece un valor al atributo Nombre del empleado
	 * @param valor Le pasamos como parámetro el valor que asignaremos al atributo
	 */
	public void setString(String valor) {
		if(valor != null && !valor.equals("")) {
			nombre = valor;
		}
	}
	
	/**
	 * Función que se encargará de imprimir los atributos de la clase Empleado.
	 */
	public String toString() {
		String res = "";
		
		res += "Empleado " + nombre;
		
		return res;
	}
}
