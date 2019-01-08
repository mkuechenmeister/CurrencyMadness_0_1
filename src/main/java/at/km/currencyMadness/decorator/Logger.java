package at.km.currencyMadness.decorator;

public class Logger extends Decorator {

    AktuelleUmrechnung umrechnung;
    private String von;
    private String zu;

    public void setElements() {
        String text = umrechnung.getText();
        String[] split = text.split("2");
        this.von = split[0];
        this.zu = split[1];
    }

    public void setZu(String zu) {
        this.zu = zu;
    }

    public Logger(AktuelleUmrechnung umrechnung) {
        this.umrechnung = umrechnung;
    }

    @Override
    public String getText() {
        setElements();
        return "Umrechnungsvorgang, Variante "+
                von+" zu "+zu+
                " mit dem Betrag von "+
                umrechnung.getSum()+" "+zu+
                " erfolgreich umgerechnet";
    }

    @Override
    public double getSum() {
        return umrechnung.getSum();
    }
}
