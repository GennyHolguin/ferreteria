package gholguin.ferreteria.administrarVenta;

import gholguin.ferreteria.entidad.Cliente;
import gholguin.ferreteria.entidad.Empleado;

public class GestionarVentasBean {

    public void procesarPago(Cliente cliente, Empleado empleado, double monto) {
        // Lógica para que el sistema de pago procese el pago
        System.out.println("Procesando pago de $" + monto + " para " + cliente.toString() + " con " + empleado.toString());
    }
}
