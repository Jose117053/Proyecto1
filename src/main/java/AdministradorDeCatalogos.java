import java.util.Iterator;

/**
 * Clase que modela un administrador de catálogos.
 */
public class AdministradorDeCatalogos {

    /* El catálogo de Alimentos. */
    CatalogoAlimentos catalogoAlimentos;
    /* El catálogo de Electrónica. */
    CatalogoElectonica catalogoElectonica;
    /* El catálogo de Electrodomésticos. */
    CatalogoElectrodomesticos catalogoElectrodomesticos;

    /**
     * Constructor que agrega todos los catálogos de la tienda.
     */
    public AdministradorDeCatalogos(CatalogoAlimentos catalogoAlimentos, CatalogoElectonica catalogoElectonica, CatalogoElectrodomesticos catalogoElectrodomesticos) {
        this.catalogoAlimentos = catalogoAlimentos;
        this.catalogoElectonica = catalogoElectonica;
        this.catalogoElectrodomesticos = catalogoElectrodomesticos;
    }

    /**
     * Método que imprime un catálogo con el iterador encapsulado.
     * @param iterador El iterador encapsulado.
     */
    private void leerCatalogo(Iterator<Producto> iterador) {
        while (iterador.hasNext()) {
            Producto producto = iterador.next();
            System.out.print("Código: " + producto.getCodigo() + ", ");
            System.out.print("Producto: " + producto.getNombre() + ", ");
            System.out.print("Precio: $" + producto.getPrecio() + ".\n");
        }
    }

    /**
     * Método que imprime los catálogos.
     */
    public void leerCatalogo() {
        System.out.println("********** CATÁLOGO DE ALIMENTOS **********");
        leerCatalogo(catalogoAlimentos.Iterador());
        System.out.println("********** CATÁLOGO DE ELECTRÓNICA **********");
        leerCatalogo(catalogoAlimentos.Iterador());
        System.out.println("********** CATÁLOGO DE ELECTRODOMÉSTICOS **********");
        leerCatalogo(catalogoAlimentos.Iterador());
    }
}
