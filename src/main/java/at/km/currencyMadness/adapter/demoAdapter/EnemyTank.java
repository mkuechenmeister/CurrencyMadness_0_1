package at.km.currencyMadness.adapter.demoAdapter;


import java.util.Random;

public class EnemyTank implements EnemyAttacker {
    Random generator = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank does" + attackDamage + " Damage");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank moves" + movement + " Spaces");

    }

    @Override
    public void assignDriver(String drivername) {
        System.out.println(drivername + " is Driving the Tank");
    }
}
