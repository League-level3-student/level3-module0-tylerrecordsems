package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
public static void main(String[] args) {
	
boolean end=false;
        // 2. create an array of 5 robots.
Robot[] robots = new Robot[5];
        // 3. use a for loop to initialize the robots.

for(int i = 0; i < robots.length; i++){
    robots[i]=new Robot("batman");
    robots[i].setY(500);
}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
    robots[0].setX(150);
    robots[1].setX(300);
    robots[2].setX(450);
    robots[3].setX(600);
    robots[4].setX(750);
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    Random gen = new Random();
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    while(end!=true) {
    	for (int i = 0; i < 5; i++) {
    		robots[i].setSpeed(10);
    		robots[i].move(gen.nextInt(100));
    		if (robots[i].getY()<=100) {
    			JOptionPane.showMessageDialog(null, "YAY Robot "+i+" WON!");
    			end=true;
    			break;
    		}
    	}
    	
    }
    
        // 7. declare that robot the winner and throw it a party!
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

}
}