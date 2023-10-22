import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que modela el catálogo de alimentos de la tienda virtual.
 * Utiliza un ArrayList para mostrar el catálogo bajo el patrón Iterator.
 */
public class CatalogoAlimentos implements Catalogo {

    /* El ArrayList de productos. */
    ArrayList<Producto> productos;

    /**
     * Constructor que crea el ArrayList de productos y los agrega.
     */
    public CatalogoAlimentos() {
        productos = new ArrayList<Producto>();
        productos.add(new Producto(20, "Pierna de pavo ", 377));
        productos.add(new Producto(21, "Bodegón de frutas", 450));
        productos.add(new Producto(22, "Canasta básica", 2243));
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
     * @return El iterador de productos de alimento.
     */
    @Override
    public Iterator<Producto> Iterador() {
        return productos.iterator();
    }
}
