package Clases_08;

import java.util.*;

public class RetoClase {

    public static void main(String[] args) {
        // inicializamos la clase, que es una pila de datos 'String'
        Pila pila = new Pila();

        //añadimos elementos
        pila.add("Maynor");
        pila.add("Deisota");
        pila.add("Yonicua");
        pila.add("Fatimota");

        // imprimimos los elementos del objeto
        System.out.println(pila.toString());

        // eliminamos un elemento siguiendo el comportamiento de pila ultimo
        // en entrar primero en salir
        pila.remove();
        System.out.println(pila.toString());

        System.out.println(" ");
        System.out.println(" ---------------> DATOS COLA <-----------------");

        // inicializamos la clase, que es un objeto del tipo Clases_08.Cola de datos 'String'
        Cola cola = new Cola();
        // añadimos elementos al objeto
        cola.add("Maynor");
        cola.add("Deisota");
        cola.add("Yonicua");
        cola.add("Fatimota");

        //imprimimos los elementos del objeto
        System.out.println(cola.toString());

        //eliminamos un elemento siguiendo el comportamiento de
        // primero en entrar primero en salir
        cola.remove();

        // imprimimos los elementos
        System.out.println(cola.toString());


    }

}

class Pila{

    private Stack<String> stack = new Stack<>();

    public void add(String elemento){
        stack.push(elemento);
    }

    public String remove(){
        return stack.pop();
    }

    public int size(){
        return stack.size();
    }
    public String toString(){
        return stack.toString();
    }
}

class Cola {

    private Queue<String> queue = new LinkedList<>();
    public void add(String elemento){
        queue.add(elemento);
    }
    public String remove(){
        return queue.remove();
    }
    public int size(){
        return queue.size();
    }
    public String toString(){
        return queue.toString();
    }

}
