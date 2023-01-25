
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esta es la rama principal");

        System.out.println("El primer cambio en la rama principal");

        Persona p1 = new Persona("Laura", 46);
        System.out.println(p1);

        Persona p2 = new Persona("Julian", 15);
        System.out.println(p2);
    }
}
