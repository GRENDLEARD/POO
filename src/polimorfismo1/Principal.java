package polimorfismo1;

 public class Principal{
     public static void main (String[] args) {
         Vehiculo misvehiculos[] = new Vehiculo[4];

         misvehiculos [0] = new Vehiculo("GH67", "Ferrari", "A89");
         misvehiculos [1] = new VehiculoTurismo (4, "78HJ", "Audi", "P14");
         misvehiculos[2] = new VehiculoDeportivo (500, "45GH", "Toyota", "KJ8");
         misvehiculos [3] = new VehiculoFurgoneta (2000, "JI8", "Toyota", "J9");

         for (Vehiculo vehiculos: misvehiculos) {
             System. out.println (vehiculos.mostrarDatos ());
             System. out.println("");

         }
        }
    }