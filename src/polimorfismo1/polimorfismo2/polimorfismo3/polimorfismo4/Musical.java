package polimorfismo1.polimorfismo2.polimorfismo3.polimorfismo4;


// Subclase Música
class Musical extends Juego {
    private String cancion;
    private String instrumento;

    public Musical(String desarrollador, String nombre, int año, String cancion, String instrumento) {
        super(desarrollador, nombre, año);
        this.cancion = cancion;
        this.instrumento = instrumento;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Canción: " + cancion);
        System.out.println("Instrumento: " + instrumento);
    }
}

