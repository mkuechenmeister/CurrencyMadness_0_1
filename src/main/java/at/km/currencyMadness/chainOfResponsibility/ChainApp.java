package at.km.currencyMadness.chainOfResponsibility;

import at.km.currencyMadness.adapter.Sammelrechner;
import at.km.currencyMadness.chainOfResponsibility.Calculate;


public class ChainApp {
    public static void main(String[] args) {

        Sammelrechner sammelrechner = new Sammelrechner();
        double euro2Dollar = Calculate.calculate("Euro2Dollar", 5000);
        double euro2Yen = Calculate.calculate("Euro2Yen", 5500);

        double[] sammelbetrag = {5,10,15,25,30};
        double sb = sammelrechner.sammelrechnen(sammelbetrag, "Euro2Yen");


        System.out.println(euro2Dollar + "Methode e2d");
        System.out.println(euro2Yen +"Methode e2y");
        System.out.println(sb + "Via Sammelrechner");
    }
}

