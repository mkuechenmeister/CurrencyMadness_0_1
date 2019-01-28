package at.km.currencyMadness.chainOfResponsibility;

import at.km.currencyMadness.templateHook.AbstractClassTemplate;
import at.km.currencyMadness.templateHook.HookEuro2Dollar;

public class Euro2Dollar extends Chain{






    @Override
    public double execute(String variante, double betrag) {
        if (variante == "Euro2Dollar") {

            return umrechnen("Euro2Dollar", betrag);
        } else {

           return this.nextChain.execute(variante, betrag);
        }


    }


}
