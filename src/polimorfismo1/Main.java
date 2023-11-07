package polimorfismo1;
public class Main {
    public static void main(String[] args) {
        Animal miMascota;

        miMascota = new Perro();
        miMascota.hacerSonido();  // Llama al método hacerSonido de la clase Perro

        miMascota = new Gato();
        miMascota.hacerSonido();  // Llama al método hacerSonido de la clase Gato
    }
}
