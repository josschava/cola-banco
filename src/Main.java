public class Main {
    public static void main (String args[]){
        Cola cola = new Cola();
        cola.insercion(new Nodo(new Persona(5, "Jos", false)));
        cola.insercion(new Nodo(new Persona(2, "Adrian", false)));
        cola.insercion(new Nodo(new Persona(3, "Bitan", false)));
        cola.insercion(new Nodo(new Persona(4, "Laura", false)));
        cola.insercion(new Nodo(new Persona(1, "Pablo", false)));

        System.out.println(cola.imprimir());

        System.out.println(cola.encuentra(1));
        System.out.println(cola.encuentra(5));
        cola.atiende();
        System.out.println(cola.encuentra(1));
        cola.insercion(new Nodo(new Persona(6, "James", true)));
        cola.insercion(new Nodo(new Persona(7, "Isa", false)));
        cola.insercion(new Nodo(new Persona(8, "Pedro", true)));
        System.out.println(cola.imprimir());


    }
}
