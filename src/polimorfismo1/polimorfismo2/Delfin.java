
package polimorfismo1.polimorfismo2;

public class Delfin extends Animal {
     private String Taxonomia;
      private String Otro; 

     public Delfin (String Taxonomia, String Otro, String Raza, String Color, String Tamaño, String Habitad) {
       super (Raza, Color, Tamaño,Habitad);
     this.Taxonomia = Taxonomia;
     this.Otro = Otro;
    }
     public String getTaxonomia(){
        return Taxonomia;
    }
     public String getOtro(){
        return Otro;
    }
 
     @Override
     public String mostrarDatos () {
        return "Raza: "+Raza+" \nColor: "+Color+"\nTamaño: "+Tamaño+ "\nHabitad :"+Habitad+ "\nTaxonomia :" +Taxonomia+ "\nOtro :" +Otro;
    }
}