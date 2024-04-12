package ejercicio02interfaces;

public class Futbolista implements Comparable<Futbolista>{
	
	private int numeroCamiseta;
	
	private String nombre = "";
	
	private int edad;
	
	private int numeroGoles;
	
	public Futbolista(int numeroCamiseta, String nombre, int edad, int numeroGoles) {
		if(numeroCamiseta > 0) {
			this.numeroCamiseta = numeroCamiseta;
		}
		
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if(edad > 0) {
			this.edad = edad;
		}
		
		if(numeroGoles >= 0) {
			this.numeroGoles = numeroGoles;
		}
	}
	
	@Override
	public String toString() {
		
		String res = "";
		
		res += "Número de camiseta: " + numeroCamiseta + "\n";
		res += "Nombre: " + nombre + "\n";
		res += "Edad: " + edad + "\n";
		res += "Número de Goles: " + numeroGoles;
		
		return res;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		Futbolista fut = (Futbolista) obj;
		
		if(numeroCamiseta == fut.numeroCamiseta && nombre.equalsIgnoreCase(fut.nombre)) {
			res = true;
		}
		
		return res;
	}

	@Override
	public int compareTo(Futbolista o) {
		int res = 0;
		
		
		
		return res;
	}

}
