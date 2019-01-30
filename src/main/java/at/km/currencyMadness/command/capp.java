package at.km.currencyMadness.command;

public class capp {

    public static void main(String[] args) {

        CommandReceiver rec = new CommandReceiver();
        ExecuteCommand ec = new ExecuteCommand(rec);
        double execute = ec.execute(5, 15);
        System.out.println(ec.undo());
        System.out.println(ec.undo());
        System.out.println(ec.execute(15,5));
        System.out.println(ec.execute(15,5));
        System.out.println(execute);

    }
}
