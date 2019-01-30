package at.km.currencyMadness.decorator;

public class Gebuehren extends Decorator {

    private Umrechnung umrechnung;

    public Gebuehren(Umrechnung umrechnung) {
        this.umrechnung = umrechnung;
    }

    @Override
    public String getText() {
        return umrechnung.getText();
    }

    @Override
    public double getSum() {
        return umrechnung.getSum() * 1.005;
    }
}
