package at.km.currencyMadness.command;

import at.km.currencyMadness.given.IUmrechnen;

public class CommandReceiver implements IReceiver {

   private double input;
   private double ergebnis;


    @Override
    public double umrechnen(double betrag, double rate) {
        input = betrag;
        ergebnis = betrag * rate;
        return ergebnis;
    }

    public double getInput() {
        return input;
    }
}
