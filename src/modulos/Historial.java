package modulos;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<String> historial;

    public Historial() {
        historial = new ArrayList<>();
    }

    public void agregarConversion(String conversion) {
        historial.add(conversion);
    }

    public void mostrarHistorial() {
        //si el hostorial esta vacio manda mensaje y regresa
        if (historial.isEmpty()) {
            System.out.println("No se ha realizado ninguna  conversión hasta el momento, Seleccionar una opción de conversión, por favor!!!");
        } else {
            System.out.println("Historial de conversiones realizadas:");
            for (int i = 0; i < historial.size(); i++) {
                System.out.println(historial.get(i));
            }
        }
    }

    public void limpiarHistorial() {
        historial.clear();
        System.out.println("Historial limpiado. Gracias por utilizar el Sistema. Hasta Pronto!!!");
    }
}
