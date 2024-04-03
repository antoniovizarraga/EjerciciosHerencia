package ejercicio03herencia;

/**
 * Nos piden hacer un programa que gestione una serie de productos. 
 */
public class Producto {
	
	/**
	 * Nombre del producto
	 */
	protected String nombre = "";
	
	/**
	 * Precio de venta del producto
	 */
	protected double precio;
	
	/**
	 * Constructor del producto con todos los parámetros
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 */
	public Producto(String nombre, double precio) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if(precio >= 0) {
			this.precio = precio;
		}
	}
	
	/**
	 * Método get que devuelve el valor del atributo nombre
	 * @return Devuelve una cadena que será el valor del atributo nombre.
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Método set que establece un valor al atributo nombre
	 * @param valor El valor que estableceremos al atributo
	 */
	public void setNombre(String valor) {
		if(valor != null && !valor.equals("")) {
			this.nombre = valor;
		}
	}
	
	/**
	 * Método get que devuelve el valor del atributo precio
	 * @return Devuelve un double que será el valor del precio del producto
	 */
	public double getPrecio() {
		return this.precio;
	}
	
	/**
	 * Método set que establece el valor del atributo precio del producto
	 * @param valor El valor que asignaremos al atributo precio del producto
	 */
	public void setPrecio(double valor) {
		if(valor >= 0) {
			this.precio = valor;
		}
	}
	
	public double calcular(int cantidadProductos) {
		return this.precio * cantidadProductos;
	}
	
	public String toString() {
		String res = "";
		
		res += nombre + "\n";
		res += "Precio: " + precio + "\n";
		
		return res;
	}
}
