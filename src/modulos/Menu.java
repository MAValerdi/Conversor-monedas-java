package modulos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public Scanner scanner;
    public Historial historial;

    public Menu(Historial historial) {
        scanner = new Scanner(System.in);
        this.historial = historial;

    }


    public void mostrarMenu() {
        System.out.println("************************************************");
        System.out.println("Bienvenido al Conversor de Monedas!!!  ");
        System.out.println(" ");
        System.out.println("1. Convertir de Dólar Americano a Peso Argentino");
        System.out.println("2. Convertir de Peso Argentino  a Dólar Americano");
        System.out.println("3. Convertir de Dólar Americano a Real Brasileño");
        System.out.println("4. Convertir de Real Brasileño a Dólar Americano");
        System.out.println("5. Convertir de Dólar Americano a Peso Colombiano");
        System.out.println("6. Convertir de Peso Colombiano a Dólar Americano");
        System.out.println("7. Convertir de Dólar Americano a Peso Mexicano");
        System.out.println("8. Convertir de Peso Mexicano a Dólar Americano");
        System.out.println("9. Ver historial de conversiones");
        System.out.println("10. SALIR");
        System.out.println("*************************************************");
    }


    public int obtenerOpcion() {
        try {
            System.out.println("Indica el número de opción que desees convertir o 10 para Salir ");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar una opción de Menú del 1 al 10. Intenta nuevamente, por favor.");
            scanner.next(); // Limpiar el buffer de entrada
            return obtenerOpcion(); // Llamada recursiva para volver a solicitar la opción
        }

    }


    public void mostrarHistorial() {
        historial.mostrarHistorial();
    }


    public void agregarConversionalHistorial(String conversion) {
        historial.agregarConversion(conversion);
    }


    public void limpiarHistorial() {
        historial.limpiarHistorial();
    }

    public void cerrarScanner() {
        scanner.close();
    }

}
