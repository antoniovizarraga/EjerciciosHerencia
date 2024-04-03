package ejercicio03herencia;

public class Perecedero extends Producto {

	private int diasACaducar;
	
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		
		if(diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}
	
	public int getDiasACaducar() {
		return this.diasACaducar;
	}
	
	public void setDiasACaducar(int valor) {
		if(diasACaducar >= 0) {
			this.diasACaducar = valor;
		}
	}
	
	@Override
	public double calcular(int cantidadProductos) {
		double resultado = 0;
		
		resultado = super.calcular(cantidadProductos);
		
		switch(diasACaducar) {
		
		case 1:
			resultado = resultado / 4;
			break;
		
		case 2:
			resultado = resultado / 3;
			break;
		
		case 3:
			resultado = resultado / 2;
			break;
		
		}
		
		return resultado;
	}
	
	@Override
	public String toString() {
		String res = "";
		
		res = super.toString();
		
		res += "Dias a caducar: " + diasACaducar + "\n";
		
		return res;
	}
	
	

}
