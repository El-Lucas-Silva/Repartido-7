package Ejercicio2;

public class Empleado {

    private String nombre;
    private int sueldoBase;
    private int horasExtra;

    public Empleado() {
    }

    public Empleado(String nombre, int sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public Empleado(String nombre, int sueldoBase, int horasExtra) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
    }

    void calcularSueldoTotal(){
        System.out.println("El sueldo total es: " + (this.sueldoBase + (250 * this.horasExtra)));
    }
}
