package at.km.currencyMadness.chainOfResponsibility;

public class Euro2Dollar extends Chain{






    @Override
    public double execute(String variante, double betrag) {
        if (variante == "Euro2Dollar") {
                        return umrechnen("USD", betrag);
        } else {
           this.nextChain.execute(variante,betrag);
        }
        return -1;

    }


}
