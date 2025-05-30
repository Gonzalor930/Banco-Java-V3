import java.util.Scanner;

public class MenuBanco {
    private Banco banco;
    private LectorDeCuentas lector;
    private Scanner scanner;

    public MenuBanco(Banco banco) {
        this.banco = banco;
        this.lector = new LectorDeCuentas();
        this.scanner = new Scanner(System.in);
    }

    public void mostrar() {
        int opcion;
        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Agregar nueva cuenta");
            System.out.println("2. Ver todas las cuentas");
            System.out.println("3. Listar cuentas por tipo");
            System.out.println("4. Retirar dinero");
            System.out.println("5. Guardar cuentas en archivo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    CuentaAbstracta nuevaCuenta = lector.cargarCuenta();
                    if (nuevaCuenta != null) banco.agregarCuenta(nuevaCuenta);
                    break;
                case 2:
                    banco.mostrarTodasLasCuentas();
                    break;
                case 3:
                    System.out.println("1. Corriente\n2. Ahorro\n3. Común");
                    int tipo = scanner.nextInt();
                            if (tipo == 1) {
                                banco.mostrarPorTipo(CuentaCorriente.class);
                            } else if (tipo == 2) {
                                banco.mostrarPorTipo(CuentaAhorro.class);
                            }else if (tipo == 3) {
                                banco.mostrarPorTipo(CuentaBancaria.class);
                            }else{
                                System.out.println("Tipo inválido");
                            }
                    break;
                case 4:
                    System.out.print("Ingrese ID de la cuenta: ");
                    int idRet = scanner.nextInt();
                    System.out.print("Ingrese monto a retirar: ");
                    float monto = scanner.nextFloat();
                    System.out.print("Ingrese PIN: ");
                    int pin = scanner.nextInt();
                    CuentaAbstracta cuenta = banco.obtenerCuenta(idRet);
                    if (cuenta != null && cuenta.validarPin(pin)) {
                        cuenta.retirar(monto);
                    } else {
                        System.out.println("\u274C Error: cuenta no encontrada o PIN incorrecto");
                    }
                    break;
                case 5:
                    GuardadoDeCuentas.guardarCuentas(banco.getCuentas(), "cuentas.txt");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }
}
