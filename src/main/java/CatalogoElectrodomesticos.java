import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que modela el catálogo de electrodomésticos de la tienda virtual.
 * Utiliza un ArrayList para mostrar el catálogo bajo el patrón Iterator.
 */
public class CatalogoElectrodomesticos implements Catalogo {

    /* El ArrayList de productos. */
    ArrayList<Producto> productos;

    /**
     * Constructor que crea el ArrayList de productos y los agrega.
     */
    public CatalogoElectrodomesticos() {
        productos = new ArrayList<Producto>();
        productos.add(new Producto(10, "Licuadora", 2399));
        productos.add(new Producto(11, "Freidora de aire", 3899));
        productos.add(new Producto(12, "Lavadora", 7299));
    }

    /**
     * Getter que regresa el ArrayList de productos.
     * @return El ArrayList de productos.
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    /**
     * Nuestro iterador encapsulado para el catálogo.
     * @return El iterador de productos de electrónica.
     */
    @Override
    public Iterator<Producto> Iterador() {
        return productos.iterator();
    }
}
