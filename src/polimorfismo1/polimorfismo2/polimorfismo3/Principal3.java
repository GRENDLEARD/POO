package polimorfismo1.polimorfismo2.polimorfismo3;

public class Principal3{
     public static void main (String[] args) {
         FiguraGeometrica misFiguras[] = new FiguraGeometrica[5];

         misFiguras [0] = new FiguraGeometrica("2L + 2W","L x W","L x W x H");
         misFiguras [1] = new Circulo("mdmmdmd","sjjsjsjsjsj","jsjsjsjsjs","sjjsjsjsj","sjsjjsjs");
         misFiguras [2] = new Cuadrado("djjdjd","jsjsjsjsjs","ajajjaja","sjjsjjss","ksksksks");
         misFiguras [3] = new Rectangulo("dnndjdjddj","jsjsjssj","jsjsjsjs","jdjdjdjd","jsjjsjsjs");
         misFiguras [4] = new Triangulo("sjjsjsjs","sksksksks","jjsjssjsjs","jajajaj","skskksks");

         for (FiguraGeometrica Figuras: misFiguras) {
             System. out.println (Figuras.mostrarDatos ());
             System. out.println("");

             }
        }
    }