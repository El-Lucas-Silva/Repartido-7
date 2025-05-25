package Ejercicio6;

public class Main {
    public static void main(String[] args) {
    Notificador n1 = new Notificador();
    System.out.println("============================================");
    n1.enviarMensaje("Hola bro, que tal?");
    System.out.println("============================================");
    n1.enviarMensaje("Que onda mano¿", "Joaco");
    System.out.println("============================================");
    n1.enviarMensaje("Buenas chaval", "Samuel", "Alta", "Aceituna.jpg");
    System.out.println("============================================");
    }
}
