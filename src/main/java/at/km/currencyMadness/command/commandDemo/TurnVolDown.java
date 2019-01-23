package at.km.currencyMadness.command.commandDemo;

public class TurnVolDown implements Command {

    ElectronicDevice theDevice;

    public TurnVolDown(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.volDown();
    }
}
