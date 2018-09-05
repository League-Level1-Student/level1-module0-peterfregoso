import javax.swing.JOptionPane;

public class TheLeagueRocks {
public static void main(String[] args) {
	weRock();
	
	String hi = JOptionPane.showInputDialog(null, "whats your name");
	rocker(hi);
	truth(hi);
	String wow = JOptionPane.showInputDialog("what would you like to echo");
	echo(wow);
	String times= JOptionPane.showInputDialog("how many times would you like to say this word");
	 int d = Integer.parseInt(times);
	 repeat(wow + " ",d);
}
public static void weRock () {
	JOptionPane.showMessageDialog(null, "The league rocks");
}
public static void rocker(String name) {
	JOptionPane.showMessageDialog(null, name + " rocks!");

}
public static void truth(String name) {
	if(name.equalsIgnoreCase("peter")) {
		JOptionPane.showMessageDialog(null, name + " is awsome");	
	}
	else {
		
JOptionPane.showMessageDialog(null, name + " is annoying");
	}
	
}
public static void echo(String word) {
	JOptionPane.showMessageDialog(null, word + " "+ word);
	
}
public static void repeat(String word, int w) {
	String e= word;
	for (int i = 0; i < w; i++) {
word = word + e;
	}
	
	JOptionPane.showMessageDialog(null, word + " ");
}
public static void getTheBestCoder() {
	
}
}
