import java.util.*;
public class LectorDeCuentas {
    private Scanner scanner = new Scanner(System.in);

    public CuentaAbstracta cargarCuenta() {
        int id;
        do {
            System.out.print("Ingrese ID de cuenta (0 para salir): ");
            id = scanner.nextInt();
            scanner.nextLine();
        } while (id == 0);

        String nombre;
        do {
            System.out.print("Ingrese nombre del titular: ");
            nombre = scanner.nextLine();
            System.out.println("Confirmar nombre: " + nombre + " (1=Afirmativo, 2=Reingresar): ");
        } while (scanner.nextInt() != 1);
        scanner.nextLine();

        float balance;
        do {
            System.out.print("Ingrese balance inicial: ");
            balance = scanner.nextFloat();
            System.out.println("Confirmar balance: " + balance + " (1=Afirmativo, 2=Reingresar): ");
        } while (scanner.nextInt() != 1);
        scanner.nextLine();

        String email;
        do {
            System.out.print("Ingrese email: ");
            email = scanner.nextLine();
            System.out.println("Confirmar email: " + email + " (1=Afirmativo, 2=Reingresar): ");
        } while (scanner.nextInt() != 1);
        scanner.nextLine();

        int pin;
        do {
            System.out.print("Ingrese un PIN numérico: ");
            pin = scanner.nextInt();
            System.out.println("Confirmar PIN: " + pin + " (1=Afirmativo, 2=Reingresar): ");
        } while (scanner.nextInt() != 1);
        scanner.nextLine();

        int tipo;
        do {
            System.out.println("Seleccione tipo de cuenta: 1-Común, 2-Ahorro, 3-Corriente");
            tipo = scanner.nextInt();
        } while (tipo < 1 || tipo > 3);

        switch (tipo) {
            case 1:
                return new CuentaBancaria(id, nombre, balance, email, pin);
            case 2:
                return new CuentaAhorro(id, nombre, balance, email, pin);
            case 3:
                return new CuentaCorriente(id, nombre, balance, email, pin);
            default:
                return null;
        }
    }
}