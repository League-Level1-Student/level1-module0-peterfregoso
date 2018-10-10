import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class  soundEffects implements ActionListener{
public static void main(String[] args) {
	new soundEffects().createUI();
}
JButton hitmarker = new JButton();
JButton Headshot = new JButton();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
private void createUI() {
	frame.add(panel);
	// 2. Make the frame visible
frame.setVisible(true);
	// 3. Set the text of the hitmarker to "Click me!"
hitmarker.setText("hitmarker");
	// 4. Set the text of the Headshot to "Click me!"
Headshot.setText("headshot");
	// 5. Add an action listener to the hitmarker
hitmarker.addActionListener((ActionListener) this);
	// 6. Add an action listener to the Headshot
Headshot.addActionListener((ActionListener) this);
	// 7. Add the hitmarker to the panel
panel.add(hitmarker);
	// 8. Add the Headshot to the panel
panel.add(Headshot);
	// 9. Pack the frame
frame.pack();
	// 10. Set the title of the frame to "Demanding Buttons"
frame.setTitle("demanding Buttons");

}
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	System.out.println("buttonpressed"+ buttonPressed);

System.out.println("click");

if(buttonPressed == hitmarker) {
System.out.println("hit");
playSound("hitmarker.wav");
}
else if (buttonPressed == Headshot) {
	System.out.println("head");
	playSound("31024__popo5525__headshotp2.wav");
}
	}
	
	/* If the buttonPressed was the hitmarker....*/
		// Set the text of the Headshot to "No, click Me!"
		// Set the PREFERRED size of the Headshot to BIG
		// Set the text of the hitmarker to "Click Me!"
		// Set the PREFERRED size of the hitmarker to SMALL
	
	
	/* If the buttonPressed was the Headshot, do the opposite. */
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}

}


