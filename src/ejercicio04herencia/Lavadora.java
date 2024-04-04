package ejercicio04herencia;

public class Lavadora extends Electrodomestico {
	private int carga = 5;
	
	public Lavadora() {
		super();
	}
	
	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
	}
	
	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		
		if(carga > 0) {
			this.carga = carga;
		}
	}
	
	public int getCarga() {
		return this.carga;
	}
	
	public void precioFinal() {
		if(carga >= 30) {
			precioBase += 50;
		}
		
		super.precioFinal();
	}
	
	
	
}
