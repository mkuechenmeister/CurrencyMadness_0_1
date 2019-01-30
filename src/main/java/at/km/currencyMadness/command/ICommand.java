package at.km.currencyMadness.command;

public interface ICommand {

    public double execute(double betrag, double rate);

    public double undo();
}
