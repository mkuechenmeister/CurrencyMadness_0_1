package at.km.currencyMadness.command.commandDemo;

public class TurnTvOff implements Command {
    ElectronicDevice theDevice;

    public TurnTvOff(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }
}
