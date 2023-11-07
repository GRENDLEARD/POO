package polimorfismo1.polimorfismo2.polimorfismo3.polimorfismo4;
public class Principal4 {
    public static void main(String[] args) {
        Juego[] juegos = new Juego[5];

        juegos[0] = new Accion("Rockstar Games", "Grand Theft Auto V", 2013, "Completar misiones", "Crimen y corrupción en Los Santos");
        juegos[1] = new Deporte("EA Sports", "FIFA 23", 2022, "Fútbol", "Equipos de fútbol");
        juegos[2] = new Simulacion("Maxis", "The Sims 4", 2014, "PC", "Realismo en simulación de vida");
        juegos[3] = new Aventura("Naughty Dog", "Uncharted 4: A Thief's End", 2016, "Mundo antiguo y tesoros perdidos", "Nathan Drake");
        juegos[4] = new Musical("Harmonix", "Rock Band", 2007, "Canciones variadas", "Instrumentos musicales virtuales");

        for (Juego juego : juegos) {
            juego.mostrarDatos();
            System.out.println(); // Separador entre juegos
        }
    }
}
