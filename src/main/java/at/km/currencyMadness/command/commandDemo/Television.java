package at.km.currencyMadness.command.commandDemo;

public class Television implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Tv is On");

    }

    @Override
    public void off() {
        System.out.println("Tv is off");

    }

    @Override
    public void volUp() {
        volume++;
        System.out.println("Tv is at Volume "+volume);
    }

    @Override
    public void volDown() {
        if (volume > 0) {
            volume--;
        } else {
            volume = 0;
        }
        System.out.println("Tv is at volume " + volume);
    }
}
