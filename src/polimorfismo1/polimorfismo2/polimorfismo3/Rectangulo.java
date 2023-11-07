package polimorfismo1.polimorfismo2.polimorfismo3;

public class Rectangulo extends FiguraGeometrica {
     private String Vertices;
      private String Otro;

     public Rectangulo(String Radio,String Otro,String Perimetro,String Area,String Volumen) {
         super (Perimetro, Area, Volumen);
         this. Vertices = Vertices;
         this. Otro = Otro;
     }
     public String getVertices() {
         return Vertices;
     }
     public String getOtro(){
         return Otro;
     }

     @Override
     public String mostrarDatos (){
        return "Perimetro: "+Perimetro+"\nArea: "+Area+"\nVolumen: "+Volumen+"\nVertices: "+Vertices+"Otro: "+Otro;
   }
 }
