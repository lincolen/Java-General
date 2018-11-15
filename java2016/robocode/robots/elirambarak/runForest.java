package elirambarak;
import robocode.*;
import java.util.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * EliramFirstRobot - a robot by (your name here)
 */
public class runForest extends AdvancedRobot
{
	/**
	 * run: EliramFirstRobot's default behavior
	 */
	public void run() {
	Random r= new Random();
	int zig,lockOn;
	zig=0;
	lockOn=0;
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			   setAhead(70);
			if(zig==0){   
            	setTurnRight(80);
				zig=1;
			}	
			else{
				setTurnLeft(100);	
				zig=0;
			}	
            	turnGunLeft(180);
	
			
		
			
				
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		turnGunRight(e.getBearing()-getBearing());
	 if(e.getDistance()<=200){
            fire(3);
			
        }else{
            fire(1);
        }
		turnGunRight(90);

		//turnGunLeft(50);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(0);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(30);
		turnLeft(120);	
		
		
	}	
}
