/**
 * Interfaz publica encargada de manejar los mensajes que aparecerán en la simulación de la tienda virtual, estos cambiarán dependiendo 
 * de la nacionalidad del cliente, es decir se enccontrarán en diferentes idiomas. 
 */
public interface Idioma {
    /**
     * Método que se encargará de darle la bienvenida al usuario al entrar a la tienda virtual.
     * @return una representación en cadena con la bienvenida al usuario.
     */
    public String bienvenido();

    /**
     * Método que se encargará de definir la opción para iniciar sesión y entrar a la tienda virtual.
     * @return una representación en cadena con el texto "Iniciar sesion", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String iniciarSesion();

    /**
     * Método que se encargará de definir el texto que le pedirá al cliente su nombre de usuario para que 
     * este pueda iniciar sesión. 
     * @return una representación en cadena con el texto "Nombre de usuario", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String ingresaUsuario();

    /**
     * Método que se encargará de decirle al usuario que ingrese su contraseña para entrar a la tienda.
     * @return una representación en cadena con el texto "Ingresar contraseña", cambiará el idioma en
     * el que se encuentre dependiendo de nacionalidad del cliente.
     */
    public String ingresaContraseña();

    /**
     * Método que se encargará de definir el texto con la opción para salir de la simulación de la tienda virtual.
     * @return una representación en cadena con el texto "Iniciar sesión", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String salirDelSistema();

    /**
     * Método que se encargará de definir el texto que da la opción al usuario de ver los productos de la tienda.
     * @return una representación en cadena con el texto "Ver productos", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String msjVerProductos();

    /**
     * Método que se encargará de definir el texto que da la opción al usuario de comprar los productos de la tienda.
     * @return una representación en cadena con el texto "Carrito de compras", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String msjRealizarCompra();

    /**
     * Método que se encargará de definir el texto con la opción para salir de la tienda virtual y REGRESAR al menú de 
     * principal.
     * @return una representación en cadena con el texto "Cerrar sesión", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String salir();

    /**
     * Método que se encargará de definir el texto que le dirá al usuario que se encuentra en el menú para elegir productos.
     * @return una representación en cadena con el texto "Lista de productos", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String agregarProducto();

    /**
     * Método que se encargará de definir el texto con la opción para el usuario de finalizar su compra.
     * @return una representación en cadena con el texto "Finalizar compra", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String finalizarCompra();

    /**
     * Método que se encargará de definir el texto con la opción para el usuario de cancelar su compra.
     * @return una representación en cadena con el texto "Cancelar compra", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String cancelarCompra();

    /**
     * Método que se encargará de definir el texto que le dirá al usuario que no tiene el suficiente dinero
     * para pagar los productos que desea compar. 
     * @return una representación en cadena con el texto "Fondos insuficientes", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String fondosInsuficientes();

    /**
     * Método que se encargará de definir el texto que te dirá que se mostrará tu ticket de compra.
     * @return una representación en cadena con el texto "Ticket de compra realizada", cambiará dependiendo de 
     * la nacionalidad del cliente.
     */
    public String mostrarTicket();

    /**
     * Método que se encargará de dar la fecha estimada de entrega de los productos comprados.
     * @return una representación en cadena con la fecha estimada de entrega de los productos comprados,
     * cambiará dependiendo de la nacionalidad del cliente.
     */
    public String fechaEntrega();

    /**
     * Método que se encargará definir el texto que le pedirá al cliente su cuenta bancaria para garantizar que
     * la compra sea segura y resgardar la información de los usuarios.
     * @return una representación en cadena con el mensaje que le pedirá al cliente su cuenta bancararia para
     * verificar que efectivamente sea este el que está relizando la compra.
     */
    public String msjCompraSegura();

    /**
     * Método que se encargará definir el texto que le dirá al usuario que su cuenta fue bloqueda por fallas
     * en el proceso de la compra segura.
     * @return una representación en cadena que le dirá al cliente que su cuenta fue bloqueada.
     */
    public String cuentaBloqueada();

    /**
     * Método que se encargará definir el texto que le dirá al cliente que su cuenta fué exitosa.
     * @return una representación en cadena con el mensaje "Compra exitosa", cambiará dependiendo de la 
     * nacionalidad del cliente.
     */
    public String compraExitosa();
}