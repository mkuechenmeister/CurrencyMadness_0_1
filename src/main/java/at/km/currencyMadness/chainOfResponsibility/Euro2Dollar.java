package at.km.currencyMadness.chainOfResponsibility;

import at.km.currencyMadness.currencies.Currencies;
import at.km.currencyMadness.currencies.Dollar;
import at.km.currencyMadness.given.WR;

public class Euro2Dollar extends Chain{






    @Override
    public double execute(String variante, double betrag) {
        if (variante == "USD") {

            Currencies dollar = new Dollar("2");
            return umrechnen(variante, betrag);
        } else {
           this.nextChain.execute(variante,betrag);
        }
        return -1;

    }


}
