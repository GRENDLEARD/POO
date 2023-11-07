package polimorfismo1.polimorfismo2.polimorfismo3.polimorfismo4;

// Subclase Deporte
class Deporte extends Juego {
    private String tipo;
    private String equipos;

    public Deporte(String desarrollador, String nombre, int año, String tipo, String equipos) {
        super(desarrollador, nombre, año);
        this.tipo = tipo;
        this.equipos = equipos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de Deporte: " + tipo);
        System.out.println("Equipos: " + equipos);
    }
}


