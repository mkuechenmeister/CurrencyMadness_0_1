package at.km.currencyMadness.adapter.demoAdapter;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot theRobot) {
        this.theRobot = theRobot;
    }

    @Override
    public void fireWeapon() {

        theRobot.smashWithHands();

    }

    @Override
    public void driveForward() {

        theRobot.calkForward();
    }

    @Override
    public void assignDriver(String drivername) {

        theRobot.reactToHuman(drivername);

    }
}
