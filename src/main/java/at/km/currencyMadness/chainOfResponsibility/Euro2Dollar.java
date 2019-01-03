package at.km.currencyMadness.chainOfResponsibility;

import at.km.currencyMadness.given.WR;

public class Euro2Dollar implements Chain{

    private Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;

    }

    @Override
    public void execute(String variante, double betrag) {
        if (variante == "USD") {


        } else {
            nextInChain.execute(variante,betrag);
        }

    }


}
