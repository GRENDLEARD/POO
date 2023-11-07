
package polimorfismo1.polimorfismo2.polimorfismo3.polimorfismo4;
 public class Juego {
     protected String Desarrolador;
     protected String Nombre;
     protected String Año;


     public Juego(String Desarrolador, String Nombre, String Año) {
         this.Desarrolador = Desarrolador;
         this.Nombre = Nombre;
         this.Año = Año;  
     }

     public String getDesarrolador(){
        return Desarrolador;
     }
     
     public String getNombre(){
        return Nombre;
     }

     public String getAño(){
        return Año;
     }
   
     public String mostrarDatos () {
        return "Desarrolador: "+Desarrolador+" \nNombre: "+Nombre+"\nAño: "+Año;
    }
}

