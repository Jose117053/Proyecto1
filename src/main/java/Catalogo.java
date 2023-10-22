import java.util.Iterator;

/**
 * Interfaz para crear un iterador que encapsula nuestra forma de iterar los distintos catálogos.
 */
public interface Catalogo {

    /**
     * Método para iterar catálogos bajo uno solo.
     * @return El iterador encapsulado.
     */
    public Iterator<Producto> Iterador();
}
