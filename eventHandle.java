import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class eventHandle implements ActionListener
{
	JFrame jf=null;
	JButton jb1=null,jb2=null,jb3=null;
	JTextField t1=null,t2=null,t3=null;
	JLabel l1=null,l2=null,l3=null;
	int res;
	eventHandle()
	{
		jf=new JFrame("CALCULATOR");
		jf.setSize(300,250);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		
		l1=new JLabel("Enter no.1:");
		l1.setBounds(20,20,100,30);
		jf.add(l1);
		t1=new JTextField();
		t1.setBounds(130,20,100,30);
		jf.add(t1);

		l2=new JLabel("Enter no.2:");
		l2.setBounds(20,60,100,30);
		jf.add(l2);
		t2=new JTextField();
		t2.setBounds(130,60,100,30);
		jf.add(t2);

		jb1=new JButton("ADD");
		jb1.setBounds(20,100,100,50);
		jf.add(jb1);
		jb1.addActionListener(this);
		
		jb2=new JButton("SUB");
		jb2.setBounds(130,100,100,50);
		jf.add(jb2);
		jb2.addActionListener(this);

		l3=new JLabel("RESULT:");
		l3.setBounds(20,160,100,30);
		jf.add(l3);
		t3=new JTextField();
		t3.setBounds(130,160,100,30);
		t3.setEditable(false);
		jf.add(t3);
		
		jb3=new JButton("CLEAR");
		jb3.setBounds(20,200,100,50);
		jf.add(jb3);
		jb3.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jb1)
		{
			res=(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText()));
			t3.setText(""+res);
		}
		else if(ae.getSource()==jb2)
		{
			res=(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText()));
			t3.setText(""+res);	
		}
		else if(ae.getSource()==jb3)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	
	}
	public static void main(String args[])
	{
		new eventHandle();
	}
}