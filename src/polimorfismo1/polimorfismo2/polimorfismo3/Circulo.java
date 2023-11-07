package polimorfismo1.polimorfismo2.polimorfismo3;

public class Circulo extends FiguraGeometrica {
     private String Radio;
      private String Otro;

     public Circulo(String Radio,String Otro,String Perimetro,String Area,String Volumen) {
         super (Perimetro, Area, Volumen);
         this. Radio = Radio;
         this. Otro = Otro;
     }
     public String getRadio() {
         return Radio;
     }
     public String getOtro(){
         return Otro;
     }

     @Override
     public String mostrarDatos (){
        return "Perimetro: "+Perimetro+"\nArea: "+Area+"\nVolumen: "+Volumen+"\nRadio: "+Radio+"\nOtro: "+Otro;
   }
 }
