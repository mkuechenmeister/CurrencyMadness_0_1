package at.km.currencyMadness.command.commandDemo;

public class AppCommandDemo {
    public static void main(String[] args) {
        ElectronicDevice newDevice = TvRemote.getElectronicDevice();
        TurnTvOn onCommand = new TurnTvOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        TurnVolUp upCommand = new TurnVolUp(newDevice);
        DeviceButton upPressed = new DeviceButton(upCommand);

        upPressed.press();
        upPressed.press();
        upPressed.press();
    }

}
