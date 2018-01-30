import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Extra implements ActionListener
{
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JFrame f;
	Extra()
	{
		b1=new JButton("Azra");
		b2= new JButton("Stuti");
		b3=new JButton("Rawat");
		b4=new JButton("Emu");
		b5=new JButton("Emu");
		b6=new JButton("Emu");
		b7=new JButton("Emu");
		b8=new JButton("Emu");
		tf=new JTextField();
		f=new JFrame();
		f.setSize(100,100);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(tf);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
	}
	public static void main(String arg[])
	{
		new Extra();
	}
	public void actionPerformed(ActionEvent e)
	{
	}
}
 
	