package concurrencia;

/**
 * Created by nicopaez on 4/25/17.
 */
public class Boleteria {

    private int cantidadDeEntradasDisponibles = 1;

    public void venderEntrada() {
        if (cantidadDeEntradasDisponibles > 0) {
            // simulamos que la transaccion de venta no es instantanea
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cantidadDeEntradasDisponibles--;
        }
        else {
            throw new RuntimeException();
        }
    }
}
