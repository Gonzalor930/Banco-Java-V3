public class CuentaAhorro extends CuentaAbstracta {
    public CuentaAhorro(int id, String nombre, float balance, String email, int pin) {
        super(id, nombre, balance, email, pin);
    }

    @Override
    public void retirar(float monto) {
        if (monto <= balance) {
            balance -= monto;
            System.out.println("Retiro exitoso. Nuevo balance: " + balance);
        } else {
            System.out.println("Fondos insuficientes, su saldo es: " + balance);
        }
    }
}