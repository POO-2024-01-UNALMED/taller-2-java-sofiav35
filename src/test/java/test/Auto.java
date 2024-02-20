package test;

public class Auto {
	
	static int cantidadCreados=0;
	String modelo;
	int precio;
	String marca;
	Motor motor;
	int registro;
	Asiento[]asientos;
	
	public Auto(String modelo, int precio, String marca, Motor motor, Asiento[] asientos, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
        this.motor = motor;
        this.asientos = asientos;
        this.registro = registro;
	}
	
	public int cantidadAsientos() {
	       int cantidad = 0;
	       for (Asiento asiento : asientos) {
	           if (asiento != null) {
	               cantidad++;
	            }
	        }
	       return cantidad;   
	}
	public String verificarIntegridad() {
		if (registro.equals(this.registro)) {
            for (Asiento asiento : asientos) {
                if (asiento != null && !asiento.registro.equals(registro)) {
                    return "Las piezas no son originales";
	}
}
	
	
	

