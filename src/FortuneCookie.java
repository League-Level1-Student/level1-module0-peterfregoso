import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	
public static void main(String[] args) {
	

	FortuneCookie fc = new FortuneCookie();
	fc.showButton();
	
}
public void showButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);

	JButton button = new JButton();
	
	frame.add(button);

	button.addActionListener(this);


    System.out.println("Button clicked");
    frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("click");
	int rand = new Random().nextInt(5);
	if(rand == 0) {
		JOptionPane.showMessageDialog(null, "you are nice");
	}
	else if(rand == 1) {
		JOptionPane.showMessageDialog(null, "you are mean");
	}
	else if(rand == 2) {
		JOptionPane.showMessageDialog(null, "you are sad");
	}
	else if(rand == 3) {
		JOptionPane.showMessageDialog(null, "you have good luck");
	}
	else {
		JOptionPane.showMessageDialog(null, "you have bad luck");
	}
}
}