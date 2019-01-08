package at.km.currencyMadness.decorator.DecoDemo;

public class Workstation extends Computer {
    @Override
    public double getPreis() {
        return 2000;
    }

    @Override
    public String getType() {
        return "Lenovo Thinkstation  ";
    }
}
