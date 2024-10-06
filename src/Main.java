import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner scanner = new Scanner(System.in);
        int longitud = CapturarLongitud(scanner);
        double media;
        double[] conjunto = new double[longitud];

        // Lectura de datos
        conjunto = CapturarConjunto(conjunto, longitud, scanner);

        // Calcular medio de conjunto
        media = CalcularMedia(conjunto,longitud);

        // Desplegar resultado con formato de 2 dígitos
        System.out.printf("La media de los numero ingresados es: %.02f\n", media);
    }

    private static double CalcularMedia(double[] conjunto, int longitud) {
        double temp = 0;

        for(int i = 0 ; i < longitud ; i++){
            temp += conjunto[i];
        }

        return temp / longitud;
    }

    private static double[] CapturarConjunto(double[] conjunto, int longitud, Scanner scanner) {
        for(int i = 0 ; i < longitud ; i++){
            System.out.printf("Introduce el número %d: ", i + 1);

            while (!scanner.hasNextDouble()){
                System.out.println("Ingresa un número válido...");
                scanner.next();
            }

            conjunto[i] = scanner.nextDouble();
        }
        return conjunto;
    }

    private static int CapturarLongitud(Scanner scanner) {
        // Lectura tamaño del arreglo
        System.out.print("¿Cuántos números deseas ingresar?: ");

        while(!scanner.hasNextInt()){
            System.out.println("Por favor, ingresa un número válido...");
            System.out.print("¿Cuántos números deseas ingresar?: ");
            scanner.next();
        }

        return scanner.nextInt();
    }
}