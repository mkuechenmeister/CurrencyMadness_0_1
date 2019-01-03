package at.km.currencyMadness.chainOfResponsibility.demochain;

public interface ChainSetter {

     static int doYourMagic(int first, int second, String what) {
        demochain chain1 = new Add();
        demochain chain2 = new Sub();
        demochain chain3 = new Div();
        demochain chain4 = new Mul();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        Numbers request = new Numbers(first,second,what);

        chain1.calculate(request);
        return 1;

    }

}
