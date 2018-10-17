import javax.swing.JPanel;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
public class SensitiveKeyboard implements KeyListener {

public static void main(String[] args) {
new SensitiveKeyboard().key();
}
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
public void key() {
frame.setVisible(true);
frame.add(panel);

frame.addKeyListener(this);
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
}
static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("typed");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	speak("ouch");
	System.out.println("pressed");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("realesed");
}
}

