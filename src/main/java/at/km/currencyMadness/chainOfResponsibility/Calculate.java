package at.km.currencyMadness.chainOfResponsibility;

import at.km.currencyMadness.chainOfResponsibility.demochain.*;

public interface Calculate {

    static double calculate(String variante, double wert) {

        Chain e2d = new Euro2Dollar();
        Chain e2y = new Euro2Yen();


        e2d.setNextChain(e2y);


        return e2d.execute(variante, wert);


    }

}
