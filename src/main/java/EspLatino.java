/**
 * Clase EspCastellano encargada de implementar los métodos de la interfaz idioma para que el cliente pueda realizar sus compras
 * en la tienda en línea Cheems-Mart en el idioma de su país (México).
 */
public class EspLatino implements Idioma {
    /**
     * Método que se encargará de darle la bienvenida al usuario al entrar a la tienda virtual.
     * @return una representación en cadena con la bienvenida al usuario.
     */
    public String bienvenido() {
        return "*** BIENVENID@ A CHEEMS-MART ***\nCompra online\n";
    }

    /**
     * Método que se encargará de definir la opción para iniciar sesión y entrar a la tienda virtual.
     * @return una representación en cadena con el texto "Iniciar sesion".
     */
    public String iniciarSesion() {
        return "Iniciar sesión\n";
    }

    /**
     * Método que se encargará de definir el texto que le pedirá al cliente su nombre de usuario para que 
     * este pueda iniciar sesión. 
     * @return una representación en cadena con el texto "Nombre de usuario".
     */
    public String ingresaUsuario() {
        return "Nombre de usuario: ";
    }

    /**
     * Método que se encargará de decirle al usuario que ingrese su contraseña para entrar a la tienda.
     * @return una representación en cadena con el texto "Contraseña".
     */
    public String ingresaContraseña() {
        return "Constraseña: ";
    }

    /**
     * Método que se encargará de definir el texto con la opción para salir de la simulación de la tienda virtual.
     * @return una representación en cadena con el texto "Salir del sistema.".
     */
    public String salirDelSistema() {
        return "0. Salir del sistema.\n";
    }

    /**
     * Método que se encargará de definir el texto que da la opción al usuario de ver los productos de la tienda.
     * @return una representación en cadena con el texto "Ver productos".
     */
    public String msjVerProductos() {
        return "1. Ver productos\n";
    }

    /**
     * Método que se encargará de definir el texto que da la opción al usuario de comprar los productos de la tienda.
     * @return una representación en cadena con el texto "Carrito de compras", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String msjRealizarCompra() {
        return "2. Agregar al carrito\n";
    }

    /**
     * Método que se encargará de definir el texto con la opción para salir de la tienda virtual y REGRESAR al menú de 
     * principal.
     * @return una representación en cadena con el texto "Cerrar sesión".
     */
    public String salir() {
        return "0. Cerrar sesión";
    }

    /**
     * Método que se encargará de definir el texto que le dirá al usuario que esta en el menú en el cual elige sus productos.
     * @return una representación en cadena con el texto "Carrito de compras".
     */
    public String agregarProducto() {
        return "*** CARRITO DE COMPRAS ***\n";
    }

    /**
     * Método que se encargará de definir el texto con la opción para el usuario de finalizar su compra.
     * @return una representación en cadena con el texto "Finalizar compra".
     */
    public String finalizarCompra() {
        return " 1. Finalizar compra\n";
    }

    /**
     * Método que se encargará de definir el texto con la opción para el usuario de cancelar su compra.
     * @return una representación en cadena con el texto "Cancelar compra".
     */
    public String cancelarCompra() {
        return " 2. Cancelar compra\n";
    }

    /**
     * Método que se encargará de definir el texto que le dirá al usuario que no tiene el suficiente dinero
     * para pagar los productos que desea compar. 
     * @return una representación en cadena que diga que no hay fondos suficientes en la cuenta de banco.
     */
    public String fondosInsuficientes() {
        return "Ups, parece que no hay fondos suficientes en tu cuenta, elege tus productos de nuevo.";
    }

    /**
     * Método que se encargará de definir el texto que te dirá que se mostrará tu ticket de compra.
     * @return una representación en cadena con el texto "Aquí esta tu ticket de compra".
     */
    public String mostrarTicket() {
        return "Aquí esta tu ticket de compra:\n";
    }

    /**
     * Método que se encargará de dar la fecha estimada de entrega de los productos comprados.
     * @return una representación en cadena con la fecha estimada de entrega de los productos comprados.
     */
    public String fechaEntrega() {
        return "Su pedido llegará entre el 5 y 6 de noviembre.\n";
    }

    /**
     * Método que se encargará definir el texto que le pedirá al cliente su cuenta bancaria para garantizar que
     * la compra sea segura y resgardar la información de los usuarios.
     * @return una representación en cadena con el mensaje que le pedirá al cliente su cuenta bancararia para
     * verificar que efectivamente sea este el que está relizando la compra.
     */
    public String msjCompraSegura() {
        return "Necesitamos verificar que seas tú.\nIngresa tu número de cuenta bancaria: ";
    }

    /**
     * Método que se encargará definir el texto que le dirá al usuario que su cuenta fue bloqueda por fallas
     * en el proceso de la compra segura.
     * @return una representación en cadena que le dirá al cliente que su cuenta fue bloqueada.
     */
    public String cuentaBloqueada() {
        return "Nuestros datos no coinciden con los datos ingresados, tu cuenta será bloqueada temporalmente.\n";
    }

    /**
     * Método que se encargará definir el texto que le dirá al cliente que su cuenta fué exitosa.
     * @return una representación en cadena con el mensaje "Tu compra fue exitosa!".
     */
    public String compraExitosa() {
        return "Tu compra fue exitosa!\n";
    }
}