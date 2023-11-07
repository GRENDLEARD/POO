package polimorfismo1.polimorfismo2.polimorfismo3.polimorfismo4;

// Subclase Acción
class Accion extends Juego {
    private String objetivo;
    private String historia;

    public Accion(String desarrollador, String nombre, int año, String objetivo, String historia) {
        super(desarrollador, nombre, año);
        this.objetivo = objetivo;
        this.historia = historia;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Objetivo: " + objetivo);
        System.out.println("Historia: " + historia);
    }
}