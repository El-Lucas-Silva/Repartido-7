package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado("Carlos", 12000);
        Empleado e3 = new Empleado("Juan", 12000, 2);

        e1.calcularSueldoTotal();
        e2.calcularSueldoTotal();
        e3.calcularSueldoTotal();
    }
}
