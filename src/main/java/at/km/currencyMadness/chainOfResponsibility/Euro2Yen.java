package at.km.currencyMadness.chainOfResponsibility;

public class Euro2Yen extends Chain{






    @Override
    public double execute(String variante, double betrag) {
        if (variante == "Euro2Yen") {
            return umrechnen("JPY", betrag);
        } else {
            this.nextChain.execute(variante,betrag);
        }
        return -1;

    }


}
