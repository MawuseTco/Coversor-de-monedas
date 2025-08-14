package src;

import java.util.Scanner;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorMonedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Conversor de Monedas ===");
            System.out.println("1. USD a EUR");
            System.out.println("2. EUR a USD");
            System.out.println("3. USD a ARS");
            System.out.println("4. ARS a USD");
            System.out.println("5. USD a BRL");
            System.out.println("6. BRL a USD");
            System.out.println("7. EUR a ARS");
            System.out.println("8. ARS a EUR");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            if (opcion == 9) break;
            String from = "", to = "";
            switch (opcion) {
                case 1: from = "USD"; to = "EUR"; break;
                case 2: from = "EUR"; to = "USD"; break;
                case 3: from = "USD"; to = "ARS"; break;
                case 4: from = "ARS"; to = "USD"; break;
                case 5: from = "USD"; to = "BRL"; break;
                case 6: from = "BRL"; to = "USD"; break;
                case 7: from = "EUR"; to = "ARS"; break;
                case 8: from = "ARS"; to = "EUR"; break;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }
            System.out.print("Ingresa el monto a convertir: ");
            double monto = scanner.nextDouble();
            ConversionResult result = ApiService.convertirMoneda(from, to, monto);
            if (result != null && "success".equals(result.getResult())) {
                System.out.printf("%.2f %s = %.2f %s\n", monto, from, result.getConversionResult(), to);
            } else {
                System.out.println("Error al obtener la tasa de cambio.");
            }
        }
        scanner.close();
        System.out.println("¡Hasta luego!");
    }
}
