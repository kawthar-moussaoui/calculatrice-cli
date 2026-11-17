package dz.univ.calculatrice;

import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== CALCULATRICE ===");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            final String choice = scanner.nextLine();

            if ("0".equals(choice)) {
                System.out.println("Au revoir !");
                break;
            }

            if (!"1".equals(choice) && !"2".equals(choice)) {
                System.out.println("Choix invalide.");
                continue;
            }

            System.out.print("Premier nombre : ");
            final double firstNumber = Double.parseDouble(scanner.nextLine());

            System.out.print("Deuxième nombre : ");
            final double secondNumber = Double.parseDouble(scanner.nextLine());

            final Operation operation;

            if ("1".equals(choice)) {
                operation = new AddOperation();
            } else {
                operation = new SubtractOperation();
            }

            final double result = operation.apply(firstNumber, secondNumber);
            System.out.println("Résultat : " + result);
        }

        scanner.close();
    }
}