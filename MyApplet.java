import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class MyApplet extends Applet implements ActionListener
{	Button b;
	TextField t;	
	public void init()
	{
		
		/*g.setColor(Color.green);
		g.fillRect(20,30,20,30);
		g.setColor(Color.yellow);
		g.drawString("Applet Program",200, 200);*/
		t= new TextField();
		b=new Button("Sumbit");
		t.setBounds(10,20,150,20);
		b.setBounds(10,50,70,60);
		add(t);
		add(b);
		b.addActionListener(this);
		setLayout(null);
		
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		t.setText("Yo!! Yo!! Khana Kha lo!!");
	}
}
