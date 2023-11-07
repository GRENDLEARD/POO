
package polimorfismo1.polimorfismo2.polimorfismo3;

public class Triangulo extends FiguraGeometrica {
     private String Tipos;
      private String Otro;

     public Triangulo(String Radio,String Otro,String Perimetro,String Area,String Volumen) {
         super (Perimetro, Area, Volumen);
         this. Tipos = Tipos;
         this. Otro = Otro;
     }
     public String getTipos() {
         return Tipos;
     }
     public String getOtro(){
         return Otro;
     }

     @Override
     public String mostrarDatos (){
        return "Perimetro: "+Perimetro+"\nArea: "+Area+"\nVolumen: "+Volumen+"\nTipos: "+Tipos+"Otro: "+Otro;
   }
 }
