import java.util.LinkedList;
public class Tienda implements Sujeto {
    /* Porcentaje de descuento de los productos */
    private int descuento;

    /* La lista de clientes mexicanos */
    LinkedList<Cliente> clientesMexicanos = new LinkedList<>();

    /* La lista de clientes espanioles */
    LinkedList<Cliente> clientesEspanioles = new LinkedList<>();

    /* La lista de clientes estadounidenses */
    LinkedList<Cliente> clientesEstadounidenses = new LinkedList<>();

    /**
     * Metodo que notifica al cliente que tiene una oferta
     */


    @Override
    public void NotificarOferta(){
        System.out.println("oferta");
    }

    @Override
    public void Registrar(Cliente cliente){
        String pais=cliente.pais;

        if(pais == "Mexico")
            clientesMexicanos.add(cliente);
        else if(pais.equals( "Espana"))
            clientesEspanioles.add(cliente);
        else
            clientesEstadounidenses.add(cliente);

    }

    public void setDescuento(int descuento){
        this.descuento=descuento;
    }

    public int getDescuento(){
        return descuento;
    }

    public void OfertaElectronica(){


    }
    public void OfertaElectrodomesticos(){

    }
    public void OfertaAlimentos(){

    }
    @Override
    public void Remover(Cliente c){

    }
}