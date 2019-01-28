package at.km.currencyMadness.jsonHelper;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class WebConnect {
    OkHttpClient client = new OkHttpClient();

    String getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        WebConnect example = new WebConnect();
        String response = example.getJSON("https://api.exchangeratesapi.io/latest");
        //String response = example.getJSON("http://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml");
        System.out.println(response);
    }

    public  ExchangeApi doIt() throws IOException {
        Gson gson = new Gson();
        //ExchangeApi exchangeApi = gson.fromJson(getJSON("https://api.exchangeratesapi.io/latest"), ExchangeApi.class);
        ExchangeApi exchangeApi = gson.fromJson(getJSON("http://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml"), ExchangeApi.class);
        return exchangeApi;

    }
}