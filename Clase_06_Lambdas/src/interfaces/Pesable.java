package interfaces;

@FunctionalInterface
public interface Pesable {
	
	// ------ Metodo abstracto de la interfaz Pesable ------ //
	public double getPesoEnGr();

	public default double getPesoEnKg() {
		return this.getPesoEnGr() / 1000;
	}

	public default double getPesoEnMg() {
		return this.getPesoEnGr() * 1000;
	}
}
