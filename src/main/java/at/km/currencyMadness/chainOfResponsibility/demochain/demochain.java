package at.km.currencyMadness.chainOfResponsibility.demochain;

public interface demochain {
    public void setNextChain(demochain dc);

    public void calculate(Numbers request);
}
