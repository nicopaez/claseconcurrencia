package concurrencia;

/**
 * Created by nicopaez on 4/25/17.
 */
public class Comprador implements Runnable {

    private static final int CANTIDAD_ENTRADAS_DESEADAS = 1;
    private final Boleteria boleteria;
    private int cantidadEntradasCompradas;

    public Comprador(Boleteria unaBoleteria) {
        this.boleteria = unaBoleteria;
        this.cantidadEntradasCompradas = 0;
    }

    public void comprarEntrada() {
        this.boleteria.venderEntrada();
        this.cantidadEntradasCompradas++;
    }

    @Override
    public void run() {
        while (cantidadEntradasCompradas < CANTIDAD_ENTRADAS_DESEADAS) {
            this.comprarEntrada();
        }
    }

    public int getCantidadEntradasCompradas() {
        return this.cantidadEntradasCompradas;
    }
}
