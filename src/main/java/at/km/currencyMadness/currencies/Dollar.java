package at.km.currencyMadness.currencies;

public class Dollar extends Currencies {

    public Dollar(String rate) {
        super("USD", "US Dollar", Double.parseDouble(rate));
    }



}
