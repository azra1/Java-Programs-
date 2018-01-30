import javax.swing.*;
import java.awt.event.*;
class Swings implements ActionListener
{
	JButton b1;
	JTextField tf;
	JFrame f;
	JLabel l;
	Swings()
	{
		b1=new JButton("Click");
		b1.setBounds(200,200,150,150);//(x,y,width,height)
		tf=new JTextField();
		l= new JLabel("0");
		tf.setBounds(10,20,150,20);
		f=new JFrame();
		l.setBounds(30,50,170,40);
		f.setSize(700,700);
		f.add(b1);
		f.add(tf);
		f.add(l);
		b1.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new Swings();
	}
	public void actionPerformed(ActionEvent e)
	{
		l.setText("YO! YO! KHANA KHA LO!!");
	}
}
		
