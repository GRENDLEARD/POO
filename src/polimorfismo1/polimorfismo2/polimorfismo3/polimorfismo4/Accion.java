package polimorfismo1.polimorfismo2.polimorfismo3.polimorfismo4;

public class Accion extends Juego{
     private String Objetivo;
      private String Otro; 

     public Accion (String Objetivo, String Otro, String Desarrolador, String Nombre, String Año) {
    super (Desarrolador, Nombre, Año);
     this.Objetivo = Objetivo;
     this.Otro = Otro;
    }
     public String getObjetivo(){
        return Objetivo;
    }
     public String getOtro(){
        return Otro;
    }
 
     @Override
     public String mostrarDatos () {
        return "Desarrolador: "+Desarrolador+" \nNombre: "+Nombre+"\nAño: "+Año+"\nObjetivo: "+Objetivo+"\nOtro"+Otro;
    }
}