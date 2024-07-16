package gholguin.ferreteria.entidad;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(int id, String nombre, double precio, int cantidadStock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }


    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
}
