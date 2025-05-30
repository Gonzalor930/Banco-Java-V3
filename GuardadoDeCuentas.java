import java.io.*;
import java.util.Collection;

public class GuardadoDeCuentas {

    public static void guardarCuentas(Collection<CuentaAbstracta> cuentas, String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (CuentaAbstracta cuenta : cuentas) {
                writer.write(cuenta.serializar());
                writer.newLine();
            }
            System.out.println(" Cuentas guardadas correctamente en " + archivo);
        } catch (IOException e) {
            System.out.println(" Error al guardar cuentas: " + e.getMessage());
        }
    }
}
