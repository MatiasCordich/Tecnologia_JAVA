package interfaces;

public interface Pesable {

	// ---------- Método abstracto (no tiene lógica) ----------
	public double getPesoEnGr();
	
	
	// ---------- Método concreto (tiene un cuerpo lógico) ----------
	public default double getPesoEnKg() {
		return this.getPesoEnGr() / 1000;
	}
	
	public default double getPesoEnMg() {
		return this.getPesoEnGr() * 1000;
	}
	
}
