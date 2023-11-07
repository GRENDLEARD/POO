
package polimorfismo1.polimorfismo2;
 public class Animal {
     protected String Raza;
     protected String Color;
     protected String Tamaño;
     protected String Habitad;

     public Animal(String Raza, String Color, String Tamaño, String Habitad) {
         this.Raza = Raza;
         this.Color = Color;
         this.Tamaño = Tamaño;
         this.Habitad = Habitad;    
     }

     public String getRaza(){
        return Raza;
     }
     
     public String getColor(){
        return Color;
     }

     public String getTamaño(){
        return Tamaño;
     }
     
     public String getHabitad(){
        return Habitad;
     }
     public String mostrarDatos () {
        return "Raza: "+Raza+" \nColor: "+Color+"\nTamaño: "+Tamaño+ "\nHabitad: "+Habitad;
    }
}

