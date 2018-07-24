import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		rob.setX(50);
		rob.setY(550);
		rob.setSpeed(10);
		rob.penDown();
		for (int i = 0; i < 10; i++) {
			
			
		drawHouse();
		}
	}

static	Robot rob = new Robot("batman");


	static void drawHouse(int hieght) {
	
		
		rob.setPenColor(0, 255, 0);
		rob.turn(90);
		rob.move(50);
		rob.turn(270);
		rob.move(hieght);
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
		rob.move(hieght);
		rob.turn(180);
	}
	
}