package dz.univ.calculatrice;

<<<<<<< HEAD
public interface Operation {

    double apply(double firstNumber, double secondNumber);

    String getSymbol();
}
=======
/** Contrat commun des opérations de la calculatrice. */
public interface Operation {
    double execute(double first, double second);

    String symbol();
}
>>>>>>> upstream/main
