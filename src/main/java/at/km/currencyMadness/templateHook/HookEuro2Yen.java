package at.km.currencyMadness.templateHook;

import at.km.currencyMadness.currencies.Yen;

public class HookEuro2Yen extends AbstractClassTemplate {
    Yen yen = new Yen("122.34");
    @Override
    public double getRate() {
        return yen.getRate();
    }
}
