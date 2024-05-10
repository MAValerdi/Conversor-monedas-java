package principal;

import modulos.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {

        Historial historial = new Historial();
        Menu menu = new Menu(historial);
        Conversor conversor = new Conversor();

        while (true) {

            menu.mostrarMenu();
            int opcion = menu.obtenerOpcion();

            if (opcion == 10) {
                break; // Salir del bucle si la opción es 10 (Salir)
            }

            if (opcion == 9) {
                menu.mostrarHistorial();
                continue; // Continuar con la siguiente iteración del bucle
            }

            if (opcion < 1 || opcion > 8) {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                continue; // Continuar con la siguiente iteración del bucle
            }

            Moneda monedaBase = Moneda.USD;    //Moneda.USD; // Por simplicidad, la moneda base la fijo en USD
            Moneda monedaDestino = Moneda.MXN;

            switch (opcion) {
                case 1:
                    monedaBase = Moneda.USD;
                    monedaDestino = Moneda.ARS;
                    break;
                case 2:
                    monedaBase = Moneda.ARS;
                    monedaDestino = Moneda.USD;
                    break;
                case 3:
                    monedaBase = Moneda.USD;
                    monedaDestino = Moneda.BRL;
                    break;
                case 4:
                    monedaBase = Moneda.BRL;
                    monedaDestino = Moneda.USD;
                    break;
                case 5:
                    monedaBase = Moneda.USD;
                    monedaDestino = Moneda.COP;
                    break;
                case 6:
                    monedaBase = Moneda.COP;
                    monedaDestino = Moneda.USD;
                    break;
                case 7:
                    monedaBase = Moneda.USD;
                    monedaDestino = Moneda.MXN;
                    break;
                case 8:
                    monedaBase = Moneda.MXN;
                    monedaDestino = Moneda.USD;
                    break;
                // Se podría Agregar más casos según las opciones de menú
            }

            //solicito el monto a convertir
            System.out.print("Ingrese el monto a convertir: ");
            double monto = menu.scanner.nextDouble();

            //formateo monto a moneda
            FormateaMoneda formateaMoneda = new FormateaMoneda();
            String montoFormateado = formateaMoneda.formatearMoneda(monto);

            //obtengo la fecha actual
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();

            // hago un formateador para obtener solo la hora:minutos:segundos
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String horaFormateda = currentTime.format(formatter);

            //obtengo los datos a convertir desde el gson
            String resultado = conversor.convertir(monto, monedaBase, monedaDestino);

            //muestro la información al usuario
            System.out.println("Fecha de conversión: " + currentDate + "_" + horaFormateda);
            System.out.println("moneda base " + monedaBase.getNombre());
            System.out.println("moneda destino " + monedaDestino.getNombre());
            System.out.println("monto " + montoFormateado + " " + monedaBase.getSigla());
            System.out.println("Total al tipo de cambio: " + resultado + " " + monedaDestino.getNombre());

            // se manda guardar la conversion al historial
            String conversion = ("Fecha: " + currentDate + "_" + horaFormateda + " - Monto: " + montoFormateado + " " + monedaBase.getSigla() + " - Total al tipo de cambio: " + resultado + " " + monedaDestino.getNombre());
            menu.agregarConversionalHistorial(conversion);
        }

        menu.limpiarHistorial();
        menu.cerrarScanner();
    }
}
