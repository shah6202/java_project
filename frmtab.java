
import java.awt.*;
import javax.swing.*;
	
	public class frmtab extends JFrame
	{
		public static void main(String args[])
		{
		JFrame fr;
		JPanel pl,pl1;
		
		fr=new JFrame("Using Tabbed Pane");
		
		JTabbedPane tb=new JTabbedPane();
		
		pl=new JPanel();
		pl.add(new JButton("First pane"));
		tb.addTab("Official",null,pl,"Official Info");
		
		pl1=new JPanel();
		pl1.add(new JButton("Second pane"));
		tb.addTab("Personal",null,pl1,"personal info");
		
	    
		
		fr.getContentPane().add(tb);
		
		
		
		fr.setSize(300,400);
		fr.getContentPane().setBackground(Color.blue);
		fr.setVisible(true);
		}
	}
