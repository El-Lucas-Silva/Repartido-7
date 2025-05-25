package Ejercicio6;

public class Notificador {

    //Mensaje simple
    public void enviarMensaje(String txt){
        System.out.println("Mensaje: "+ txt);
        System.out.println("Se ha enviado correctamente");
    }

    //Mensaje a destinatario
    public void enviarMensaje(String txt, String para){
        System.out.println("Mensaje: "+ txt);
        System.out.println("Se ha enviado correctamente a "+ para);
    }

    //Mensaje con archivo
    public void enviarMensaje(String txt, String para, String prioridad, String fileName){
        System.out.println("Mensaje: "+ txt);
        System.out.println("Contiene: "+ fileName);
        System.out.println("Prioridad: "+ prioridad);
        System.out.println("Se ha enviado correctamente a "+ para);
    }
}
