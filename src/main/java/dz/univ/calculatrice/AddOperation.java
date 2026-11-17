package dz.univ.calculatrice;

public final class AddOperation implements Operation {

    @Override
    public double apply(final double firstNumber, final double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public String getSymbol() {
        return "+";
    }
}