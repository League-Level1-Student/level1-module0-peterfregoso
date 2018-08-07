import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		rob.setX(50);
		rob.setY(550);
		rob.setSpeed(10);
		rob.penDown();
		Random ran = new Random();
		String name;

		for (int i = 0; i < 10; i++) {
			int num = ran.nextInt(3);
			if(num == 0) {
			  name= "small";
			}
			else  if(num== 1){
				name= "medium";
			}
			else {
				name= "large";

			}
		
		drawHouse(name); 
		}
	}

static	Robot rob = new Robot("batman");


	static void drawHouse( String name) {
		int height = 0;
	if( name.equalsIgnoreCase("small")) {
		 height += 60;
		 drawPointyRoof(name);
	}
	else if (name.equalsIgnoreCase("medium")) {
		 height += 120;
		 drawPointyRoof(name);
	}
	else {
		height += 250;
		drawFlatRoof(name);
	}

	}
	    static void drawFlatRoof(String name) {
	    	int height = 0;
	    
	rob.turn(90);
	rob.move(50);
	rob.turn(270);
	rob.setRandomPenColor();

	rob.move(250);
	rob.turn(90);
	rob.move(25);
	rob.turn(90);
	rob.move(250);
	rob.turn(180);
}
	    static void drawPointyRoof(String name) {
	    int height = 0;
	    	if( name.equalsIgnoreCase("small")) {
	   		 height += 60;
	   	}
	   	else if (name.equalsIgnoreCase("medium")) {
	   		 height += 120;
	   	}
	    
		rob.setPenColor(0,255,0);
		rob.turn(90);
		rob.move(50);
		rob.turn(270);
		rob.setRandomPenColor();
		rob.move(height);	
		rob.turn(45);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(45);
rob.move(height);
rob.turn(180);
}
}