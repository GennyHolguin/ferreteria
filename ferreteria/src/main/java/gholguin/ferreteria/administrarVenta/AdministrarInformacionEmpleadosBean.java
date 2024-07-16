package gholguin.ferreteria.administrarVenta;

import gholguin.ferreteria.entidad.Empleado;
import gholguin.ferreteria.entidad.Producto;

public class AdministrarInformacionEmpleadosBean {

    AdministrarInventarioBean administrarInventarioBean = new AdministrarInventarioBean();
    public void agregarEmpleado(Empleado empleado) {
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    public void eliminarEmpleado(Empleado empleado) {
        System.out.println("Empleado eliminado: " + empleado.getNombre());
    }

    public void venderProducto(Producto producto, int cantidad) {
        administrarInventarioBean.actualizarInventario(producto,cantidad);
    }

}
