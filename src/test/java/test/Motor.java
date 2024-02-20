package test;

public class Motor {
	
	int numeroCilindros;
    String tipo;
    int registro;

   public Motor(int numeroCilindros, String tipo, int registro) {
       this.numeroCilindros = numeroCilindros;
       this.tipo = tipo;
       this.registro = registro;
   }

   public void cambiarRegistro(int nuevoRegistro) {
       this.registro = nuevoRegistro;
   }
   
   public void asignarTipo(String tipo) {
       if (tipo.equals("electrico") ) {
           this.tipo = tipo;
        
       } 
       else if(tipo.equals("gasolina")) {
       	this.tipo=tipo;
       }
     }
}
