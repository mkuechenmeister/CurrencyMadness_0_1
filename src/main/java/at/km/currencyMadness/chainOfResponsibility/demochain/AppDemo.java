package at.km.currencyMadness.chainOfResponsibility.demochain;

public class AppDemo {


    public static void main(String[] args) {
        ChainSetter.doYourMagic(5,10,"add");
        ChainSetter.doYourMagic(5,10,"div");
        ChainSetter.doYourMagic(5,10,"mul");
        ChainSetter.doYourMagic(5,10,"sub");
        ChainSetter.doYourMagic(5,10,"duff");
    }
}
