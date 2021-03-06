package at.km.currencyMadness.chainOfResponsibility.demochain;

public class Sub implements demochain {

    private demochain nextInChain;

    @Override
    public void setNextChain(demochain dc) {
        this.nextInChain = dc;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "sub") {
            System.out.println("Subtraktion gestartet\n");
            System.out.println(request.getNr1() + "-" + request.getNr2() + "="
                    + (request.getNr1() - request.getNr2()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
