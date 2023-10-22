public class Ingles implements Idioma {
    /**
     * Método que se encargará de darle la bienvenida al usuario al entrar a la tienda virtual.
     * @return una representación en cadena con la bienvenida al usuario.
     */
    public String bienvenido() {
        return "*** WELCOME TO CHEEMS-MART! ***\nShop online\n";
    }

    /**
     * Método que se encargará de definir la opción para iniciar sesión y entrar a la tienda virtual.
     * @return una representación en cadena con el texto "Iniciar sesion".
     */
    public String iniciarSesion() {
        return "Log in";
    }

    /**
     * Método que se encargará de definir el texto que le pedirá al cliente su nombre de usuario para que
     * este pueda iniciar sesión.
     * @return una representación en cadena con el texto "Nombre de usuario".
     */
    public String ingresaUsuario() {
        return "User name: ";
    }

    /**
     * Método que se encargará de decirle al usuario que ingrese su contraseña para entrar a la tienda.
     * @return una representación en cadena con el texto "Contraseña".
     */
    public String ingresaContraseña() {
        return "Password: ";
    }

    /**
     * Método que se encargará de definir el texto con la opción para salir de la simulación de la tienda virtual.
     * @return una representación en cadena con el texto "Iniciar sesión", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String salirDelSistema() {
        return "0. Close System.\n";
    }

    /**
     * Método que se encargará de definir el texto que da la opción al usuario de ver los productos de la tienda.
     * @return una representación en cadena con el texto "Ver productos", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String msjVerProductos() {
        return "1. Product catalog\n";
    }

    /**
     * Método que se encargará de definir el texto que da la opción al usuario de comprar los productos de la tienda.
     * @return una representación en cadena con el texto "Carrito de compras", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String msjRealizarCompra() {
        return "2. Add to shopping car\n";
    }

    /**
     * Método que se encargará de definir el texto con la opción para salir de la tienda virtual y REGRESAR al menú de
     * principal.
     * @return una representación en cadena con el texto "Cerrar sesión", cambiará dependiendo de la
     * nacionalidad del cliente.
     */
    public String salir() {
        return "0. Log out\n";
    }

    public String agregarProducto() {
        return "*** Shopping car ***\n";
    }

    public String finalizarCompra() {
        return "1. Buy now \n";
    }
    public String cancelarCompra() {
        return "2. Cancel purchase \n";
    }
    public String fondosInsuficientes() {
        return "Ups! It seems you don't have enough money, select other products.";
    }
    public String mostrarTicket() {
        return "Here is your ticket:\n";
    }
    public String fechaEntrega() {
        return "Your products will arrive on November 5th.";
    }
    public String msjCompraSegura() {
        return "We need to verify that it is you.\nEnter your account number: ";
    }
    public String cuentaBloqueada() {
        return "Sorry our data doesn't match the account number you entered, your account will be temporarily blocked.\n";
    }
    public String compraExitosa() {
        return "Your purchase was successful!\n";
    }
}