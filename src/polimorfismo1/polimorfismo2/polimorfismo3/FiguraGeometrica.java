/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo1.polimorfismo2.polimorfismo3;

 public class FiguraGeometrica {
     protected String Perimetro;
     protected String Area;
     protected String Volumen;

     public FiguraGeometrica(String Perimetro, String Area, String Volumen) {
         this.Perimetro = Perimetro;
         this.Area = Area;
         this.Volumen = Volumen;
     }

     public String getPerimetro(){
        return Perimetro;
     }
     
     public String getArea(){
        return Area;
     }

     public String getVolumen(){
        return Volumen;
     }
     
     public String mostrarDatos () {
        return "Perimetro: "+Perimetro+" \nArea: "+Area+"\nVolumen: "+Volumen;
    }
}
