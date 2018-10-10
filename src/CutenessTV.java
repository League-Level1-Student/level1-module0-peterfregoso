
	import java.applet.AudioClip;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JApplet;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;


	public class  CutenessTV implements ActionListener{
	public static void main(String[] args) {
		new CutenessTV().createUI();
	}
	JButton orangeShirtKid = new JButton();
	JButton swipeIt = new JButton();
	JButton thanosShark = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	private void createUI() {
		frame.add(panel);
		// 2. Make the frame visible
	frame.setVisible(true);
		// 3. Set the text of the orangeShirtKid to "Click me!"
	orangeShirtKid.setText("orangeShirtKid");
		// 4. Set the text of the swipeIt to "Click me!"
	swipeIt.setText("swipeIt");
	thanosShark.setText("ThanosShark");
		// 5. Add an action listener to the orangeShirtKid
	orangeShirtKid.addActionListener((ActionListener) this);
		// 6. Add an action listener to the swipeIt
	swipeIt.addActionListener((ActionListener) this);
	thanosShark.addActionListener(this);
		// 7. Add the orangeShirtKid to the panel
	panel.add(orangeShirtKid);
		// 8. Add the swipeIt to the panel
	panel.add(swipeIt);
	panel.add(thanosShark);
		// 9. Pack the frame
	frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
	frame.setTitle("cutnesstv");

	}
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		System.out.println("buttonpressed"+ buttonPressed);

	System.out.println("click");

	if(buttonPressed == orangeShirtKid) {
	System.out.println("hit");
	playSound("orangeShirtKid.wav");
	}
	else if (buttonPressed == swipeIt) {
		System.out.println("head");
		playSound("31024__popo5525__swipeItp2.wav");
	}
		}
		
		/* If the buttonPressed was the orangeShirtKid....*/
			// Set the text of the swipeIt to "No, click Me!"
			// Set the PREFERRED size of the swipeIt to BIG
			// Set the text of the orangeShirtKid to "Click Me!"
			// Set the PREFERRED size of the orangeShirtKid to SMALL
		
		
		/* If the buttonPressed was the swipeIt, do the opposite. */
	private void playSound(String fileName) {
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	    sound.play();
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	}




