package polimorfismo1.polimorfismo2.polimorfismo3;

public class Rectangulo extends FiguraGeometrica {
     private String Vortices;
      private String Otro;

     public Rectangulo(String Radio,String Otro,String Perimetro,String Area,String Volumen) {
         super (Perimetro, Area, Volumen);
         this. Vortices = Vortices;
         this. Otro = Otro;
     }
     public String getVortices() {
         return Vortices;
     }
     public String getOtro(){
         return Otro;
     }

     @Override
     public String mostrarDatos (){
        return "Perimetro: "+Perimetro+"\nArea: "+Area+"\nVolumen: "+Volumen+"\nVortices: "+Vortices+"\nOtro: "+Otro;
   }
 }
