package ejercicio03herencia;

public class NoPerecedero extends Producto {
	
	private String tipo = "";
	
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		
		if(tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
		
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String valor) {
		if(valor != null && !valor.equals("")) {
			this.tipo = valor;
		}
	}
	
	@Override
	public String toString() {
		String res = "";
		
		res = super.toString();
		
		res += "Tipo:" + tipo + "\n";
		
		return res;
	}
	
	public double calcular(int cantidadProductos) {
		return super.calcular(cantidadProductos);
	}

	
	
	
}
