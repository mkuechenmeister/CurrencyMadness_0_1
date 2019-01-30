package at.km.currencyMadness.adapter.demoAdapter;

public class AdapterDemoApp {

    public static void main(String[] args) {

        EnemyTank tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        EnemyRobotAdapter adaptedRobot = new EnemyRobotAdapter(robot);


        System.out.println("**********************Tank****************");
        tank.driveForward();
        tank.fireWeapon();
        tank.assignDriver("Dummy");
        System.out.println("******************Adapted Robot****************");
        adaptedRobot.driveForward();
        adaptedRobot.fireWeapon();
        adaptedRobot.assignDriver("Dummy");



    }
}
