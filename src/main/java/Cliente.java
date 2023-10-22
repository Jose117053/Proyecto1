/**
 * Clase que modela a un cliente de la tienda virtual.
 */
public abstract class Cliente implements Observer{

    /* El usuario del cliente */
    String usuario;
    /* La contraseña del cliente */
    String contrasena;
    /* El nombre del cliente */
    String nombre;
    /* El número de teléfono del cliente. */
    String telefono;
    /* La dirección del cliente, */
    String direccion;
    /* La cuenta bancaria del cliente. */
    String cuentaBancaria;
    /* El país de origen del cliente. */
    String pais;
    /* El identificador del cliente, */
    int id;
    /* El idioma asociado al pais del cliente */
    Idioma idioma;


    Tienda tienda;

    /**
     * Constructor de un cliente
     */

    public Cliente(String usuario, String contrasena, String nombre, String telefono, String direccion, String cuentaBancaria, String pais, Idioma idioma, Tienda tienda){
        this.usuario=usuario;
        this.contrasena=contrasena;
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        this.cuentaBancaria=cuentaBancaria;
        this.pais=pais;
        this.idioma=idioma;
        this.tienda=tienda;
        tienda.Registrar(this);


    }

    /**
     * Metodo para obtener el descuento dependiendo de la nacionalidad del cliente
     */

    @Override
    public abstract int getOferta();


}