package at.km.currencyMadness.chainOfResponsibility;

public class Euro2Yen extends Chain{






    @Override
    public double execute(String variante, double betrag) {
        if (variante == "Euro2Yen") {
            return umrechnen("Euro2Yen", betrag);
        } else {
            System.out.println("Unable to perform Calculation");
            //this.nextChain.execute(variante,betrag);
        }
        return -1;

    }


}
