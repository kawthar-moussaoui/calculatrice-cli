package dz.univ.calculatrice;

import java.util.Scanner;

<<<<<<< HEAD
public final class Main {

=======
/** Interface en ligne de commande de la calculatrice. */
public final class Main {
>>>>>>> upstream/main
    private Main() {
    }

    public static void main(final String[] args) {
<<<<<<< HEAD
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
=======
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("\n=== CALCULATRICE ===");
                System.out.println("1. Addition");
                System.out.println("2. Soustraction");
                System.out.println("0. Quitter");
                System.out.print("Votre choix : ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Choix invalide.");
                    scanner.nextLine();
                    continue;
                }
                int choice = scanner.nextInt();
                if (choice == 0) {
                    running = false;
                } else if (choice == 1 || choice == 2) {
                    System.out.print("Premier nombre : ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Nombre invalide.");
                        scanner.nextLine();
                        continue;
                    }
                    double first = scanner.nextDouble();
                    System.out.print("Deuxième nombre : ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Nombre invalide.");
                        scanner.nextLine();
                        continue;
                    }
                    double second = scanner.nextDouble();
                    Operation operation = choice == 1
                            ? new AddOperation() : new SubtractOperation();
                    System.out.println("Résultat : " + operation.execute(first, second));
                } else {
                    System.out.println("Choix invalide.");
                }
            }
        }
    }
}
>>>>>>> upstream/main
