package at.km.currencyMadness.command.commandDemo;

public class TurnVolUp implements Command {
    ElectronicDevice theDevice;

    public TurnVolUp(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.volUp();
    }
}
