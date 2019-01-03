package at.km.currencyMadness.currencies;

public class Yen extends Currencies {

    public Yen(String rate) {
        super("JPY", "Japanese Yen", Double.parseDouble(rate));
    }



}
