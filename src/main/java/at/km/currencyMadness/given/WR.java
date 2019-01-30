package at.km.currencyMadness.given;

import at.km.currencyMadness.command.Comando;
import at.km.currencyMadness.decorator.AktuelleUmrechnung;
import at.km.currencyMadness.decorator.Gebuehren;
import at.km.currencyMadness.decorator.Logger;
import at.km.currencyMadness.decorator.Umrechnung;
import at.km.currencyMadness.templateHook.AbstractClassTemplate;
import at.km.currencyMadness.templateHook.HookEuro2Dollar;
import at.km.currencyMadness.templateHook.HookEuro2Yen;

public abstract class WR implements IUmrechnen {

    private String variante;
    private double betrag;

    @Override
    public double umrechnen(String variante, double betrag) {

        AbstractClassTemplate template = getTemplate(variante);
        String text = "%f %s %f";

        if (template != null) {

            double umgerechnet = Comando.command(betrag, template.getRate());//Übergabe des umzurechnenden Betrages an das Command-Pattern Interface
            Umrechnung umrechnung = new AktuelleUmrechnung(variante, umgerechnet); //Decorator
            umrechnung = new Logger((AktuelleUmrechnung) umrechnung); //Decorator mit dem Aufruf des Loggers
            System.out.println(umrechnung.getText());
            umrechnung = new Gebuehren(umrechnung); //Decorator mit Aufruf des Gebührenrechners
            umgerechnet = umrechnung.getSum();
            System.out.println(umgerechnet);
            return umgerechnet;


        } else {

            return -1;
        }




    }

    private AbstractClassTemplate getTemplate(String variante) {
        AbstractClassTemplate template = null;

        switch (variante) {


            case "Euro2Dollar":
                template = new HookEuro2Dollar();
                break;

            case "Euro2Yen":
                template = new HookEuro2Yen();
                break;

            default:
                template = null;
                break;
        }
        return template;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    private void checkForCurrency() {

    }
}
