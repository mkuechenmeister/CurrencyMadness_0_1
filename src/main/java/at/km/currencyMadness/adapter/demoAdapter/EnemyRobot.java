package at.km.currencyMadness.adapter.demoAdapter;

import java.util.Random;

public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands() {
        int damage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot causes " + damage + " Damage with Hands");

    }

    public void calkForward() {
        int steps = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot walks " + steps + " Steps");

    }

    public void reactToHuman(String human) {
        System.out.println("Enemy Robot fighting " + human);
    }



}
