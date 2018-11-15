package elirambarak;
import robocode.*;
import java.awt.Color;
import java.util.*;
// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * TestBot - a robot by (your name here)
 */
public class TestBot2  extends AdvancedRobot
{
	/**
	 * run: TestBot's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here
		Random r= new Random();
	//	boolean lock=false;
		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.red,Color.blue,Color.green); // body,gun,radar
		setAdjustGunForRobotTurn(true);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			
			//	ahead(100);
			while(getX()>50 && getBattleFieldWidth()-getX()>50 && getY()>50 && getBattleFieldHeight()-getY()>50){
				setTurnGunRight(180);
				ahead(10);
				
			}
			//setTurnRight(90);
			//setAhead(100);
			back(80);
			setTurnRight(90);	
			turnGunRight(180);
			
			
			
			//	back(100);
			//	turnGunRight(360);
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		//turnGunLeft(0);
		//stop();
		//turnRight(e.getBearing());
		//turnGunLeft(e.getBearing());
			if(getX()>50 && getBattleFieldWidth()-getX()>50 && getY()>50 && getBattleFieldHeight()-getY()>50){
				setAhead(10);
			}
			else{
				//setTurnRight(90);
				//setAhead(100);	
					setBack(80);
			setTurnRight(90);	
			}
			if((e.getBearing()-(getGunHeading()-getHeading())>0)) turnGunRight(e.getBearing()-(getGunHeading()-getHeading()));
			else turnGunLeft(-1*(e.getBearing()-(getGunHeading()-getHeading())));
		 if(e.getDistance()<=150){
            fire(3);
         }else{
            fire(1.1);
         }
    	turnGunLeft(30);
		//turnGunLeft(5);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
	//	turnGunRight(e.getBearing()-(getGunHeading()-getHeading()));
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(30);
		turnRight(120);	
		
	}	
}
