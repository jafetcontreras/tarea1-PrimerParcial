package src.main.java.hn.uth.tarea_Primer_parcial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular el área de un círculo");
            System.out.println("2. Calcular el área de un cuadrado");
            System.out.println("3. Calcular el área de un rectángulo");
            System.out.println("4. Calcular el área de un triángulo");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del círculo:");
                    double radio = scanner.nextDouble();
                    System.out.println("El área del círculo es: " + calculator.calcularAreaCirculo(radio));
                    break;
                case 2:
                    System.out.println("Ingrese el lado del cuadrado:");
                    double lado = scanner.nextDouble();
                    System.out.println("El área del cuadrado es: " + calculator.calcularAreaCuadrado(lado));
                    break;
                case 3:
                    System.out.println("Ingrese la base del rectángulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double altura = scanner.nextDouble();
                    System.out.println("El área del rectángulo es: " + calculator.calcularAreaRectangulo(base, altura));
                    break;
                case 4:
                    System.out.println("Ingrese la base del triángulo:");
                    double baseT = scanner.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double alturaT = scanner.nextDouble();
                    System.out.println("El área del triángulo es: " + calculator.calcularAreaTriangulo(baseT, alturaT));
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}