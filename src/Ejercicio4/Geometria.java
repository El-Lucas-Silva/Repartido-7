package Ejercicio4;

import java.sql.SQLOutput;

public class Geometria {

    //Cuadrado
    public void calcularArea(int num1){
        System.out.println("El area de su cuadrado es: "+ (num1 * num1));
    }

    //Recangulo
    public void calcularArea(int num1, int num2){
        System.out.println("El area de su rectangulo es: "+ (num1 * num2));
    }

    //Circulo
    public void calcularArea(double num1){
        System.out.println("El area de su circulo es: "+ (3.14 * num1 * 3.14));
    }
}
