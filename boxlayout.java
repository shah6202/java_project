import java.awt.*;
import javax. swing.*;
	
	public class boxlayout extends Frame
	{
		public static void main(String args[])
		{
		JFrame fr;
		JPanel pl;
		BoxLayout b1;
		JButton ok,cancel;
		
		fr=new JFrame("My Frame");
		pl=new JPanel();
		b1=new BoxLayout(pl,BoxLayout.X_AXIS);
		
		pl.setLayout(b1);
		
		ok=new JButton("OK");
		cancel=new JButton("Cancel");
		
		fr.getContentPane().add(pl,BorderLayout.CENTER);
		pl.add(new JLabel("this is box layout"));
		pl.add(ok);
		pl.add(cancel);
		
		fr.setSize(300,400);
		fr.setBackground(Color.red);
		fr.setVisible(true);
		}
	}
