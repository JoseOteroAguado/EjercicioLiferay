public class App {
    public static void main(String[] args) throws Exception {

        //Cesta 1
        System.out.println("\r\n Cesta 1: \r\n");

        Cesta cesta1 = new Cesta();

        Articulo a = new Articulo("Libro", false, false, 12.49);
        cesta1.anadirArticulo(a);

        Articulo b = new Articulo("CD de música", true, false, 14.99);
        cesta1.anadirArticulo(b);

        Articulo c = new Articulo("Barrita de chocolate", false, false, 0.85);
        cesta1.anadirArticulo(c);

        System.out.println(cesta1.toString());

        // Cesta 2
        System.out.println("\r\n Cesta 2: \r\n");

        Cesta cesta2 = new Cesta();

        Articulo d = new Articulo("Caja de bombones importados", false, true, 10);
        cesta2.anadirArticulo(d);

        Articulo e = new Articulo("Frasco de perfume importado", true, true, 47.50);
        cesta2.anadirArticulo(e);

        System.out.println(cesta2.toString());

        // Cesta 3
        System.out.println("\r\n Cesta 3: \r\n");

        Cesta cesta3 = new Cesta();

        Articulo f = new Articulo("Frasco de perfume importado", true, true, 27.99);
        cesta3.anadirArticulo(f);

        Articulo g = new Articulo("Frasco de perfume", true, false, 18.99);
        cesta3.anadirArticulo(g);

        Articulo h = new Articulo("Caja de pastillas", false, false, 9.75);
        cesta3.anadirArticulo(h);

        Articulo i = new Articulo("Bombones importados", false, true, 11.25);
        cesta3.anadirArticulo(i);

        System.out.println(cesta3.toString());



    }
}