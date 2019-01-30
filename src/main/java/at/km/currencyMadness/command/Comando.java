package at.km.currencyMadness.command;

public interface Comando {

    static double command(double betrag, double rate) {
        CommandReceiver rec = new CommandReceiver();
        ExecuteCommand ec = new ExecuteCommand(rec);
        return ec.execute(betrag, rate);
    }
}
