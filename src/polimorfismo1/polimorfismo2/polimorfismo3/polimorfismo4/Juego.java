
package polimorfismo1.polimorfismo2.polimorfismo3.polimorfismo4;
 // Clase base Juego
class Juego {
    private String desarrollador;
    private String nombre;
    private int año;

    public Juego(String desarrollador, String nombre, int año) {
        this.desarrollador = desarrollador;
        this.nombre = nombre;
        this.año = año;
    }

    public void mostrarDatos() {
        System.out.println("Desarrollador: " + desarrollador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Año: " + año);
    }
}