package gholguin.ferreteria.administrarVenta;

import gholguin.ferreteria.entidad.Producto;

import java.util.ArrayList;
import java.util.List;

public class AdministrarInventarioBean {

    private List<Producto> productos=new ArrayList<>();
    Producto cemento= new Producto(1,"cemento",36000.0,50);

    public void actualizarInventario(Producto producto,int cantidad) {
        if (cantidad <= producto.getCantidadStock()) {
            producto.setCantidadStock(producto.getCantidadStock()-cantidad);
            System.out.println("Venta realizada: " + cantidad + " unidades de " + producto.getNombre());
        } else {
            System.out.println("No hay suficiente stock de " + producto.getNombre());
        }
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarStock(Producto producto,int cantidad) {
        producto.setCantidadStock(producto.getCantidadStock()+cantidad);
        System.out.println("Se agregaron " + cantidad + " unidades de " + producto.getNombre() + " al inventario.");
    }

    public int verificarStockDisponible() {
        return cemento.getCantidadStock();
    }
}
