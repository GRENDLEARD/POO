
package polimorfismo1;

class Animal {
    public void hacerSonido() {
        System.out.println("Este es un animal genérico");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }
}

