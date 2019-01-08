package at.km.currencyMadness.decorator.DecoDemo;

public class Netzwerkadapter extends Dekorierer {

    Computer computer;

    public Netzwerkadapter(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getType() {
        return computer.getType() + " mit zusätzlichem Netzwerkadapter";
    }

    @Override
    public double getPreis() {
        return computer.getPreis() + 133.55;
    }
}
