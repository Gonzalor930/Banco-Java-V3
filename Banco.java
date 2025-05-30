import java.util.*;
public class Banco {
    private Map<Integer, CuentaAbstracta> cuentas = new HashMap<>();

    public void agregarCuenta(CuentaAbstracta cuenta) {
        cuentas.put(cuenta.getId(), cuenta);
    }

    public CuentaAbstracta obtenerCuenta(int id) {
        return cuentas.get(id);
    }

    public void eliminarCuenta(int id) {
        cuentas.remove(id);
    }

    public void mostrarTodasLasCuentas() {
        for (CuentaAbstracta cuenta : cuentas.values()) {
            cuenta.consultarSaldo();
        }
    }
    public void mostrarPorTipo(Class<?> tipoCuenta) {
        for (CuentaAbstracta cuenta : cuentas.values()) {
            if (tipoCuenta.isInstance(cuenta)) {
                cuenta.consultarSaldo();
            }
        }
    }

    public Collection<CuentaAbstracta> getCuentas() {
        return cuentas.values();
    }
}
