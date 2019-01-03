package at.km.currencyMadness;

import at.km.currencyMadness.jsonHelper.ExchangeApi;
import at.km.currencyMadness.jsonHelper.WebConnect;
import okhttp3.OkHttpClient;

import java.io.IOException;

public class app {

    public static void main(String[] args) throws IOException {
        WebConnect ezb = new WebConnect();
        ExchangeApi bank = ezb.doIt();
        String aud = bank.getRates().getAUD();
        System.out.println("AUD = "+aud);
        System.out.println(bank.getRates());
        System.out.println(bank.getDate());
    }
}
