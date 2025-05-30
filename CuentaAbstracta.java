public abstract class CuentaAbstracta {
    protected int id;
    protected String nombre;
    protected float balance;
    protected String email;
    protected int pin;
    
    public CuentaAbstracta(int id, String nombre, float balance, String email, int pin) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
        this.email = email;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    public void consultarSaldo() {
        System.out.println("Titular: " + nombre +
                " | ID: " + id +
                " | Saldo: $" + balance +
                " | Tipo: " + this.getClass().getSimpleName());
    }

    public boolean validarPin(int pinIngresado) {
        return this.pin == pinIngresado;
    }

    public void depositar(float monto) {
        if (monto > 0) {
            balance += monto;
            System.out.println(" Depósito exitoso.");
        } else {
            System.out.println(" Monto inválido.");
        }
    }

    public void retirar(float montoRetiro) {
        if (montoRetiro <= balance) {
            balance -= montoRetiro;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Fondos insuficientes. Saldo actual: $" + balance);
        }
    }

    public String serializar() {
        return id + "," + nombre + "," + balance + "," + email + "," + pin + "," + this.getClass().getSimpleName();
    }
}
    


