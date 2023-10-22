public abstract class ClienteEspanol extends Cliente{

    int descuento;

    public ClienteEspanol(String usuario, String contrasena, String nombre, String telefono, String direccion, String cuentaBancaria, String pais, Idioma idioma, Tienda tienda){
        super(usuario, contrasena, nombre, telefono, direccion, cuentaBancaria, pais, idioma, tienda);
    }

    @Override
    public int getOferta(){
        descuento=tienda.getDescuento();
        return descuento;

    }

    public void notificacionDeOferta(){
        System.out.println("El cliente " + nombre + " ha ganado un cupon de descuento en el área de Alimentos");
    }

}