package Ejercicio5;

public class Conversor {

    //Metros a CM
    public void convertir(double metros) {
        System.out.println(metros +" Metros son "+ metros * 100 +" centimetros");
    }

    //Kg a gramos
    public void convertir(double kg, String tipo) {
        if (tipo.equals("Peso") || tipo.equals("peso")) {
            System.out.println(kg + " Kilogramos equivalen a " + kg * 1000 + " gramos.");
        } else {
            System.out.println("El ''tipo'' ingresado no es valido.");
        }
    }

    //Fahrenheit a Celsius
    public void convertir(double temperatura, boolean esTemperatura) {
        if (esTemperatura) {
            System.out.println(temperatura + "Fahrenheit equivalen a " + ((temperatura - 32) * 5 / 9) + "Celsius.");
        } else {
            System.out.println("La variable no es una temperatura.");
        }
    }
}
