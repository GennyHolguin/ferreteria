package gholguin.ferreteria;

import gholguin.ferreteria.administrarVenta.AdministrarInventarioBean;
import gholguin.ferreteria.administrarVenta.GestionarVentasBean;
import gholguin.ferreteria.entidad.Cliente;
import gholguin.ferreteria.entidad.Empleado;
import gholguin.ferreteria.entidad.Producto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Cliente, Vendedor, Inventario y Producto
        Cliente cliente1 = new Cliente(1, "Juan Pérez", "Calle Principal 123","32132");
        Empleado vendedor1 = new Empleado(1, "María González","Vendedor");
        AdministrarInventarioBean administrarInventarioBean = new AdministrarInventarioBean();
        Producto producto1 = new Producto(1, "Martillo", 10.5, 50);
        Producto producto2 = new Producto(2, "Destornillador", 5.75, 100);

        // Agregar productos al inventario
        administrarInventarioBean.agregarProducto(producto1);
        administrarInventarioBean.agregarProducto(producto2);

        // Crear e interactuar con el sistema de pago
        GestionarVentasBean gestionarVentasBean = new GestionarVentasBean();
        gestionarVentasBean.procesarPago(cliente1, vendedor1, producto1.getPrecio());

        // Actualizar el inventario después de una venta
        administrarInventarioBean.actualizarInventario(producto1, -1);
    }
}