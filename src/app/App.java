package app;

import api.ConsultaMoneda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    // Definición de las constantes de las monedas para evitar errores tipográficos
    private static final String USD = "USD";
    private static final String ARS = "ARS";
    private static final String BRL = "BRL";
    private static final String COP = "COP";

    public static void main(String[] args) {
        menu();
    }

    // Metodo para realizar la consulta de conversión de monedas
    public static void lecturaMoneda(String monedaOrigen, String monedaDestino) {
        try {
            ConsultaMoneda consulta = new ConsultaMoneda();
            var moneda = consulta.buscarMoneda(monedaOrigen);
            System.out.println("1 " + monedaOrigen + " equivale a " + moneda.conversion_rates().get(monedaDestino) + " " + monedaDestino);
        } catch (Exception e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    // Menú principal del sistema
    public static void menu() {
        Scanner lectura = new Scanner(System.in);
        int opcion = -1;

        do {
            mostrarMenu();
            try {
                System.out.print("Ingrese una opción: ");
                opcion = lectura.nextInt();
                ejecutarOpcion(opcion);
            } catch (InputMismatchException e) {
                System.out.println("Opción no válida, por favor ingrese un número.");
                lectura.next(); // Limpiar la entrada no válida
            }
        } while (opcion != 7);

        lectura.close();
    }

    // Muestra el menú principal al usuario
    private static void mostrarMenu() {
        System.out.println("*********************************************************");
        System.out.println("Sea bienvenido al sistema de consulta de monedas:");
        System.out.println("1) Dólar → ARS");
        System.out.println("2) ARS → Dólar");
        System.out.println("3) Dólar → Real Brasileño");
        System.out.println("4) Real Brasileño → Dólar");
        System.out.println("5) Dólar → Peso Colombiano");
        System.out.println("6) Peso Colombiano → Dólar");
        System.out.println("7) Salir");
        System.out.println("*********************************************************");
    }

    // Ejecuta la opción seleccionada por el usuario
    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Dólar → ARS");
                lecturaMoneda(USD, ARS);
                break;
            case 2:
                System.out.println("ARS → Dólar");
                lecturaMoneda(ARS, USD);
                break;
            case 3:
                System.out.println("Dólar → Real Brasileño");
                lecturaMoneda(USD, BRL);
                break;
            case 4:
                System.out.println("Real Brasileño → Dólar");
                lecturaMoneda(BRL, USD);
                break;
            case 5:
                System.out.println("Dólar → Peso Colombiano");
                lecturaMoneda(USD, COP);
                break;
            case 6:
                System.out.println("Peso Colombiano → Dólar");
                lecturaMoneda(COP, USD);
                break;
            case 7:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opción no válida, por favor intente de nuevo.");
                break;
        }
    }
}
