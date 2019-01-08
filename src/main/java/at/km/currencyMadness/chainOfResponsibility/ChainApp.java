package at.km.currencyMadness.chainOfResponsibility;

import at.km.currencyMadness.chainOfResponsibility.Calculate;

public class ChainApp {
    public static void main(String[] args) {
        Calculate.calculate("Euro2Dollar", 5000);
        Calculate.calculate("Euro2Yen", 5500);
    }
}
