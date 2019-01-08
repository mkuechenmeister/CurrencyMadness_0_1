package at.km.currencyMadness.decorator;

public class AktuelleUmrechnung extends Umrechnung {

    private String variante;
    private double summe;

    public AktuelleUmrechnung(String variante, double summe) {
        this.variante = variante;
        this.summe = summe;
    }

    @Override
    public String getText() {
        return this.variante;
    }

    @Override
    public double getSum() {
        return summe;
    }
}
