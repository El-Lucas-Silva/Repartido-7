package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        CuentaBancaria c2 = new CuentaBancaria("Juan", "Ejemplo");
        CuentaBancaria c3 = new CuentaBancaria("Richard",-9, "Ejemplo 2");
        CuentaBancaria c4 = new CuentaBancaria("Pamela",12678, "Ejemplo 3");

        System.out.println("========================");
        c1.mostrarResumen();
        System.out.println("========================");
        c2.mostrarResumen();
        System.out.println("========================");
        c3.mostrarResumen();
        System.out.println("========================");
        c4.mostrarResumen();
        System.out.println("========================");
    }
}
