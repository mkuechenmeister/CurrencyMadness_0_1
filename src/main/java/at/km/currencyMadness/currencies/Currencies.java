package at.km.currencyMadness.currencies;

import at.km.currencyMadness.given.WR;

public abstract class Currencies{

    private String code;
    private String text;
    private double rate;

    public Currencies(String code, String text, double rate) {
        this.code = code;
        this.text = text;
        this.rate = rate;
    }

    public Currencies getCurrency(String Code) {
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRevertRate() {
        return (1 / getRate());
    }
}
