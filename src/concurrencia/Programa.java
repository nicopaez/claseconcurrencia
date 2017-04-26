package concurrencia;

/**
 * Created by nicopaez on 4/25/17.
 */
public class Programa {

    public static final void main(String args[]) throws InterruptedException {
        System.out.println("hola");

        Boleteria boleteriaCompartida = new Boleteria();
        Comprador comprador1 = new Comprador(boleteriaCompartida);
        Comprador comprador2 = new Comprador(boleteriaCompartida);

        Thread hilo1 = new Thread(comprador1);
        Thread hilo2 = new Thread(comprador2);

        hilo1.start();
        hilo2.start();

        Thread.sleep(5000);
        System.out.println("Comprador1.CantidadDeEntradas:" + comprador1.getCantidadEntradasCompradas());
        System.out.println("Comprador2.CantidadDeEntradas:" + comprador2.getCantidadEntradasCompradas());

    }
}
