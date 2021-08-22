import java.text.NumberFormat;
import java.util.ArrayList;

public class Cesta {

    private ArrayList<Articulo> cestaDeCompras = new ArrayList<Articulo>();

    public Cesta(){

    }

    public void anadirArticulo(Articulo articulo){
        this.cestaDeCompras.add(articulo);
    }

    public String toString() {
        
        NumberFormat dinero = NumberFormat.getCurrencyInstance();

        String ticket = "";
        double impuestoAplicado = 0;
        double precioTotal = 0;

        for(int i = 0; i < this.cestaDeCompras.size(); i++){
            ticket += cestaDeCompras.get(i).toString() + "\r\n";
            impuestoAplicado += cestaDeCompras.get(i).getPrecioFinal() - cestaDeCompras.get(i).getPrecioInicial();
            precioTotal += cestaDeCompras.get(i).getPrecioFinal();
        }
        ticket += "Impuesto sobre las ventas: " +dinero.format(impuestoAplicado) +"\r\n";

        ticket += "Total: " +dinero.format(precioTotal);
        return ticket;
    }

}
