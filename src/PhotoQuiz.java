/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
//String image1 = "https://cdn.pixabay.com/photo/2017/05/19/21/12/java-2327538_960_720.png";
                String image1 = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Felis_silvestris_silvestris_small_gradual_decrease_of_quality.png/200px-Felis_silvestris_silvestris_small_gradual_decrease_of_quality.png" ;
		// 2. create a variable of type "Component" that will hold your image
Component com;
		// 3. use the "createImage()" method below to initialize your Component
com = createImage(image1);
		// 4. add the image to the quiz window
quizWindow.add(com);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question = JOptionPane.showInputDialog("what animal is this?");
		// 7. print "CORRECT" if the user gave the right answer
if(question.equalsIgnoreCase("cat")) {
	JOptionPane.showMessageDialog(null, "correct");
}
else {
	JOptionPane.showMessageDialog(null, "incorrect");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(com);

		// 10. find another image and create it (might take more than one line of code)
String image2 = "https://i.ytimg.com/vi/3ZUlICjw7XQ/sddefault.jpg#404_is_fine";
Component comp;
comp = createImage(image2);
quizWindow.add(comp);
		// 11. add the second image to the quiz window

		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String leg = JOptionPane.showInputDialog("what part of the body is this");
if(leg.equalsIgnoreCase("leg")|| leg.equalsIgnoreCase("legs")) {
	JOptionPane.showMessageDialog(null, "correct");
	// 14+ check answer, say if correct or incorrect, etc.
}
else {
	JOptionPane.showMessageDialog(null, "incorrect");
}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





