import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox  implements ActionListener{
	int x= 0;
	public static void main(String[] args) {
		new JackInTheBox().initializeGui();
	
	}
	private void initializeGui() {
		JFrame frame1 = new JFrame();
		  JButton button = new JButton("surprise");
		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      frame1.add(button);
	          button.addActionListener(this);
			  frame1.setVisible(true);
			  frame1.pack();
			  
	}
	
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	private void showPicture(String fileName) { 
	     try {
	    	 JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	        
		          frame.pack();
	       
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
x++;
if(x== rand) {
	
	showPicture("jackInTheBox.png") ;
	playSound("homer-woohoo.wav");
}
	}

}
