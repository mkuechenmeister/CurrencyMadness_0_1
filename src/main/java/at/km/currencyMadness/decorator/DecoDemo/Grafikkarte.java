package at.km.currencyMadness.decorator.DecoDemo;

public class Grafikkarte extends Dekorierer {

    Computer computer;

    public Grafikkarte(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getType() {
        return computer.getType() + " mit NVIDIA Quadro";
    }

    @Override
    public double getPreis() {
        return computer.getPreis()+450;
    }
}
