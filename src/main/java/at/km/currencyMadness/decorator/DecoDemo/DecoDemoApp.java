package at.km.currencyMadness.decorator.DecoDemo;

public class DecoDemoApp {
    public static void main(String[] args) {

        Computer workstation = new AIO();
        workstation = new Netzwerkadapter(workstation);
        System.out.println(workstation.getType() + "\nPreis: " + workstation.getPreis());

    }
}
