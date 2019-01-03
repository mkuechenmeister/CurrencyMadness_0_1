package at.km.currencyMadness.chainOfResponsibility.demochain;

public class Numbers {
    private int nr1;
    private int nr2;
    private String calculationWanted;

    public Numbers(int nr1, int nr2, String calculationWanted) {
        this.nr1 = nr1;
        this.nr2 = nr2;
        this.calculationWanted = calculationWanted;
    }

    public int getNr1() {
        return nr1;
    }

    public int getNr2() {
        return nr2;
    }

    public String getCalculationWanted() {
        return calculationWanted;
    }
}
