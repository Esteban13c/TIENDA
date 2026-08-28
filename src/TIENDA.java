import java.security.PrivateKey;

public class TIENDA {

    private String producto ;
    private String codigo;
    private double precio;
    private int Stock;

    public TIENDA() {
    }

    public TIENDA(String producto, String codigo, double precio, int stock) {
        this.producto = producto;
        this.codigo = codigo;
        this.precio = precio;
        Stock = stock;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPecio() {
        return precio;
    }

    public void setPecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    @Override
    public String toString() {
        return "TIENDA{" +
                "producto='" + producto + '\'' +
                ", codigo='" + codigo + '\'' +
                ", pecio=" + precio +
                ", Stock=" + Stock +
                '}';
    }

    //METODO VENDER (Cambiado a 'vender' para coincidir con tu compañero)
    public int vender(int cantidad){
        return Stock -= cantidad;
    }

    //METODO ABASTECER
    public int abastecer(int cantidad){
        return Stock += cantidad;
    }


    // CONSULTAR VALOR TOTAL DEL STOCK
    public double valorstock() {
        double total = this.Stock * this.precio;
        System.out.println("VALOR TOTAL DEL STOCK: " + total);
        return total;
    }

    // MOSTRAR INFORMACION (Ajustado para mostrar los textos idénticos a los de tu compañero y el Stock real)
    public void mostrarinformacio(){
        System.out.println("CODIGO: " + codigo);
        System.out.println("NOMBRE PRODUCTO: " + producto);
        System.out.println("VALOR U: " + precio);
        System.out.println("STOCK : " + Stock);
    }
}