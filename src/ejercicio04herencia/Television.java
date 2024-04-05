package ejercicio04herencia;

public class Television extends Electrodomestico {
	private int resolucion = 20;

	private boolean sintonizador = false;

	public Television() {
		super();
	}

	public Television(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion,
	boolean sintonizador) {
		super(precioBase, color, consumoEnergetico, peso);
		
		if(resolucion > 0) {
			this.resolucion = resolucion;
		}
		
		this.sintonizador = sintonizador;
	}

	
	public int getResolucion() {
		return this.resolucion;
	}
	
	public boolean getSintonizador() {
		return this.sintonizador;
	}
	
	public void precioFinal() {
		if(resolucion >= 40) {
			double temp = precioBase * 30;
			temp /= 100;
			precioBase += temp;
		}
		
		if(sintonizador) {
			precioBase += 50;
		}
		
		super.precioFinal();
	}

}
