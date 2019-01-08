package at.km.currencyMadness.templateHook;

import at.km.currencyMadness.currencies.Dollar;

public class HookEuro2Dollar extends AbstractClassTemplate {

    Dollar dollar = new Dollar("1.13736");

    @Override
    public double getRate() {
        return dollar.getRate();
    }
}
