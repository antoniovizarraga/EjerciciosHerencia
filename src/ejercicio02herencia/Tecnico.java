package ejercicio02herencia;

public class Tecnico extends Operario {
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String res = "";
		
		res = super.toString();
		
		res += " -> Tecnico";
		
		return res;
	}
}
