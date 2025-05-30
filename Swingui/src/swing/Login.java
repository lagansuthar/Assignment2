package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame {
	JLabel jlabel1, jlabel2;
	JTextField field1, field2;
	JButton button1, button2;

	public Login() {
		jlabel1 = new Jlabel("Username");
		jlabel2 = new JLabel("Password");
		field1 = new field1(20);
		field2 = new field2(20);

	}
}
