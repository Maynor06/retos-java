package Herencia_Polimorfismo_09;

public class Herencia {

    public static void main(String[] args) {
        Animal perro = new Dog("Peluche");
        Animal gato = new Cat("pelusa");

        perro.sound();
        gato.sound();
    }

}

abstract class Animal{

    private String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    abstract public void sound();
}

// extiende de la clase animal
class Dog extends Animal{

    public Dog(String nombre) {
        super(nombre);
    }

    public void sound(){
        System.out.println("Guau");
    }
}

class Cat extends Animal{
    public Cat(String nombre) {
        super(nombre);
    }
    public void sound(){
        System.out.println("Miau");
    }
}
