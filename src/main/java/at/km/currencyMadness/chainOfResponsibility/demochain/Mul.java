package at.km.currencyMadness.chainOfResponsibility.demochain;

public class Mul implements demochain {

    private demochain nextInChain;

    @Override
    public void setNextChain(demochain dc) {
        this.nextInChain = dc;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "mul") {
            System.out.println("Multiplikation gestartet\n");
            System.out.println(request.getNr1() + "*" + request.getNr2() + "="
                    + (request.getNr1() * request.getNr2()));
        } else {
            System.out.println("Unable to perform Calculation");
        }
    }
}
