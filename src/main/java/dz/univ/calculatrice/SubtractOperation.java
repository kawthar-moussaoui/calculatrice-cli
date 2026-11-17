package dz.univ.calculatrice;

<<<<<<< HEAD
public final class SubtractOperation implements Operation {

    @Override
    public double apply(final double firstNumber, final double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public String getSymbol() {
        return "-";
    }
}
=======
/** Soustraction de deux nombres réels. */
public class SubtractOperation implements Operation {
    @Override
    public double execute(final double first, final double second) {
        return first - second;
    }

    @Override
    public String symbol() {
        return "-";
    }
}
>>>>>>> upstream/main
