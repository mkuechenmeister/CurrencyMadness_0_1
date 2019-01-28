package at.km.currencyMadness.adapter;

import at.km.currencyMadness.chainOfResponsibility.Calculate;
import at.km.currencyMadness.given.ISammelrechnung;
import at.km.currencyMadness.given.IUmrechnen;

public class Sammelrechner implements ISammelrechnung, Calculate {



    @Override
    public double sammelrechnen(double[] betraege, String Variante) {
        double sammelbetrag = 0;
        if (betraege != null) {
            for (double sb : betraege
            ) {
                sammelbetrag += sb;
            }
            return Calculate.calculate(Variante,sammelbetrag); //übergabe und Start der Kette
        } else {
            return -1;
        }

    }


}
