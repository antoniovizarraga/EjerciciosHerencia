package ejercicio01interfaces;

public class Socio implements Comparable<Socio> {
	private int id;
	
	private String nombre = "";
	
	private int edad;
	
	public Socio(int id, String nombre, int edad) {
		if(id > 0) {
			this.id = id;
		}
		
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if(edad > 0) {
			this.edad = edad;
		}
	}
	
	@Override
	public String toString() {
		String res = "";
		
		res += "Nombre: " + nombre + "\n";
		res += "Edad: " + edad + "\n";
		res += "ID:" + id;
		
		return res;
	}

	@Override
	public int compareTo(Socio obj) {
		
		int res = 0;
		
		if(this.id < obj.id) {
			res = -1;
		} else if(this.id > obj.id) {
			res = 1;
		}
		
		
		
		return res;
	}
}
