package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        Producto p2 = new Producto("Vaso", 30);
        Producto p3 = new Producto("PC Gamer", 22000, 28);

        p1.mostrarInfo();
        System.out.println("=================");
        p2.mostrarInfo();
        System.out.println("=================");
        p3.mostrarInfo();
    }
}