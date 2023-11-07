package polimorfismo1.polimorfismo2.polimorfismo3.polimorfismo4;


class Simulacion extends Juego {
    private String consola;
    private String realismo;

    public Simulacion(String desarrollador, String nombre, int año, String consola, String realismo) {
        super(desarrollador, nombre, año);
        this.consola = consola;
        this.realismo = realismo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Consola: " + consola);
        System.out.println("Realismo: " + realismo);
    }
}