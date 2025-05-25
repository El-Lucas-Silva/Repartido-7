package Ejercicio1;

public class Producto {

    private String nombre;
    private int precio;
    private int stock;

    public Producto() {}

    public Producto (String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo () {
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Precio "+ this.precio);
        System.out.println("Stock: "+ this.stock);
    }
}

