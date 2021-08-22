import java.text.NumberFormat;

public class Articulo {

    private String nombre;
    private boolean impuestoBasico;
    private boolean importado;
    private double precioInicial;
    private double precioFinal;

    public Articulo(String nombre, boolean impuestoBasico, boolean importado, double precioInicial){
        this.nombre = nombre;
        this.impuestoBasico = impuestoBasico;
        this.importado = importado;
        this.precioInicial = precioInicial;
        this.precioFinal = precioInicial;

        aplicarImpuestos();
    }


    private void aplicarImpuestos(){
        double porcentajeImpuesto = 0.0;

        if(this.impuestoBasico){
            porcentajeImpuesto += 0.1;
        }

        if(this.importado){
            porcentajeImpuesto += 0.05;
        }
        
        double impuesto = this.precioInicial * (porcentajeImpuesto);
        //Se redondea al 0.05 más cercano el impuesto añadido.
        double impuestoRedondeado = Math.round(impuesto * 20.0) / 20.0;
        this.precioFinal += impuestoRedondeado;
    }


    public double getPrecioInicial(){
        return this.precioInicial;
    }
    public double getPrecioFinal(){
        return this.precioFinal;
    }

    public String toString() {
        NumberFormat dinero = NumberFormat.getCurrencyInstance();
        return this.nombre+": "+dinero.format(this.precioFinal);
    }
}
