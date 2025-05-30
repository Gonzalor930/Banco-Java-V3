public class CuentaCorriente extends CuentaAbstracta {
    public CuentaCorriente(int id, String nombre, float balance, String email, int pin) {
        super(id, nombre, balance, email, pin);
    }

    @Override
    public void retirar(float monto) {
        if ((balance - monto) >= -50000) {
            balance -= monto;
            System.out.println("Retiro exitoso. Nuevo balance: " + balance);
        } else {
            System.out.println("Fondos insuficientes para sobregiro.");
        }
    }
}