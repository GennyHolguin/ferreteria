package gholguin.ferreteria;


import gholguin.ferreteria.entidad.Cliente;
import gholguin.ferreteria.entidad.Empleado;
import gholguin.ferreteria.gestionproducto.GestionarInventarioBean;
import gholguin.ferreteria.gestionproducto.GestionarPagoBean;
import gholguin.ferreteria.entidad.Producto;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Cliente, Vendedor, Inventario y Producto
        Cliente cliente1 = new Cliente(1, "Juan Pérez", "Calle Principal 123","32132");
        Empleado vendedor1 = new Empleado(1, "María González","Vendedor");
        GestionarInventarioBean administrarInventarioBean = new GestionarInventarioBean();
        Producto producto1 = new Producto(1, "Martillo", 10.5, 50);
        Producto producto2 = new Producto(2, "Destornillador", 5.75, 100);

        // Agregar productos al inventario
        administrarInventarioBean.agregarProducto(producto1);
        administrarInventarioBean.agregarProducto(producto2);

        // Crear e interactuar con el sistema de pago
        GestionarPagoBean gestionarVentasBean = new GestionarPagoBean();
        gestionarVentasBean.procesarPago(cliente1, vendedor1, producto1.getPrecio());

        // Actualizar el inventario después de una venta
        administrarInventarioBean.actualizarInventario(producto1, -1);
    }
}