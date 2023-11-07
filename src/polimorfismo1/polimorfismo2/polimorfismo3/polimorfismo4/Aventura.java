package polimorfismo1.polimorfismo2.polimorfismo3.polimorfismo4;

// Subclase Aventura
class Aventura extends Juego {
    private String lugar;
    private String personaje;

    public Aventura(String desarrollador, String nombre, int año, String lugar, String personaje) {
        super(desarrollador, nombre, año);
        this.lugar = lugar;
        this.personaje = personaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Lugar de Aventura: " + lugar);
        System.out.println("Personaje: " + personaje);
    }
}