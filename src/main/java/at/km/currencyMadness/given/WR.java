package at.km.currencyMadness.given;

public abstract class WR implements IUmrechnen {

    private String variante;
    private double betrag;

    @Override
    public double umrechnen(String variante, double betrag) {

        /*double rate = Varianten.getRate(variante);
        double result = betrag * rate;
        return result;*/

        return -1;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    private void checkForCurrency() {

    }
}
