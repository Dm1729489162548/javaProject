import javax.swing.*;
import java.awt.*;
class gui
{
	public static void main(String args[])
	{
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		JLabel lb1=new JLabel("enter a no.");
		lb1.setBounds(20,20,70,20);
		JTextField txt1=new JTextField();
		txt1.setBounds(60,20,70,20);
		jf.setVisible(true);
		jf.setSize(500,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}