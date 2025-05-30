public interface OperacionesCuenta {
    void depositar(float monto);
    void retirar(float monto);
    void consultarSaldo();
    boolean validarPin(int pin);
    int getId();
}