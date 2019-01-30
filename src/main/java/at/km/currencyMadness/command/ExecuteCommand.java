package at.km.currencyMadness.command;

public class ExecuteCommand implements ICommand {

    CommandReceiver receiver;

    public ExecuteCommand(CommandReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public double execute(double betrag, double rate) {
       return receiver.umrechnen(betrag, rate);
    }

    @Override
    public double undo() {
        return receiver.getInput();
    }
}
