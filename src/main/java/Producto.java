/**
 * Clase que modela los productos de la tienda.
 */
public class Producto {

    /* El código identificador del producto. */
    int codigo;
    /* El nombre del producto. */
    String nombre;
    /* El precio del producto. */
    double precio;

    /**
     * Contructor del producto.
     * @param codigo El código identificador del producto.
     * @param nombre El nombre del producto.
     * @param precio El precio del producto.
     */
    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Getter que regresa el código identificador del producto.
     * @return El código identificador del producto.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Getter que regresa el nombre del producto.
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter que regresa el precio del producto.
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }


    /**
     * Cliente cliente
     * switch(cliente.pais)
     *  case mexico:
     *
     *
     *
     */
}
