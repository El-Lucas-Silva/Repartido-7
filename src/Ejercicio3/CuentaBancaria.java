package Ejercicio3;

public class CuentaBancaria {

    private String titular;
    private int saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
    this.titular = "Invitado";
    this.tipoCuenta = "Caja de ahorro";
    }

    public CuentaBancaria(String titular, String tipoCuenta) {
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String titular, int saldo, String tipoCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    void mostrarInfo(){
        System.out.println("Titular: "+ this.titular);
        System.out.println("Saldo: "+ this.saldo);
        System.out.println("Tipo de cuenta: "+ this.tipoCuenta);
    }

    void mostrarResumen(){
        mostrarInfo();
        if (this.saldo > 0){
            System.out.println("La cuenta tiene fondos");
        } else if (this.saldo == 0) {
            System.out.println("La cuenta no tiene fondos");
        } else {
            System.out.println("La cuenta esta sobregirada");
        }
    }

}
