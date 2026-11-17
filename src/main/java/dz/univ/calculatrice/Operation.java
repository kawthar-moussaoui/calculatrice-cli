package dz.univ.calculatrice;

public interface Operation {

    double apply(double firstNumber, double secondNumber);

    String getSymbol();
}