package at.km.currencyMadness.chainOfResponsibility;

import at.km.currencyMadness.given.WR;

public abstract class Chain{



    public abstract void setNextChain(Chain nextChain);

    public double execute(String variante, double betrag) {
        return -1;
    }
}
