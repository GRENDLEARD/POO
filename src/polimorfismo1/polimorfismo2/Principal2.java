package polimorfismo1.polimorfismo2;

 public class Principal2{
     public static void main (String[] args) {
         Animal misAnimales[] = new Animal[4];

         misAnimales [0] = new Animal("Lobo","negro","grande","Zona fria");
         misAnimales [1] = new Delfin("Delphinus capensis","Rapido","Delphinus capensis","Negro con Blanco","grande","lugares Frios ");
         misAnimales [2] = new Gato("El gato doméstico","Veloz","Felis silvestris catus","Negro","Peuqeño","Selva");
         misAnimales [3] = new Gusano("Oruga","Patas pequeñas","Lepidoptera","Verde","Muy pequeño","bosques, praderas");

         for (Animal Animales: misAnimales) {
             System. out.println (Animales.mostrarDatos ());
             System. out.println("");

         }
        }
    }