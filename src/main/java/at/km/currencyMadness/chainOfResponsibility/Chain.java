package at.km.currencyMadness.chainOfResponsibility;

import at.km.currencyMadness.given.WR;

public abstract class Chain extends WR{

    protected Chain nextChain;

    public void setNextChain(Chain nextChain){
        this.nextChain = nextChain;
    }

    public double execute(String variante, double betrag) {
        return super.umrechnen(variante, betrag);
    }
}
