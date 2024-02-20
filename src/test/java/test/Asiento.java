package test;

public class Asiento {
	
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color){
		
		if(color.equals("rojo")) {
			
			color= "rojo";
		}
		else if(color.equals("verde")) {
			
			color= "verde";
		}
		else if(color.equals("amarillo")) {
			
			color="amarillo";
		}
		else if(color.equals("negro")) {
			
			color= "negro";
		}
		else if(color.equals("blanco")) {
			
			color= "blanco";
		}
	}
}
