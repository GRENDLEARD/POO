package polimorfismo1.polimorfismo2.polimorfismo3;

public class Cuadrado extends FiguraGeometrica {
     private String Lados;
      private String Otro;

     public Cuadrado(String Lados,String Otro,String Perimetro,String Area,String Volumen) {
         super (Perimetro, Area, Volumen);
         this. Lados = Lados;
         this. Otro = Otro;
     }
     public String getLados() {
         return Lados;
     }
     public String getOtro(){
         return Otro;
     }

     @Override
     public String mostrarDatos (){
        return "Perimetro: "+Perimetro+"\nArea: "+Area+"\nVolumen: "+Volumen+"\nLados: "+Lados+"Otro: "+Otro;
   }
 }

