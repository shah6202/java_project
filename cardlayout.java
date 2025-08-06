import java.awt.*;
import java.lang.*;
import java.awt.event.*;
public class cardlayout implements ActionListener
	{
			Frame fr;
			Button b1,b2,b3,b4,b5;
			CardLayout cl;
			Panel pl;
		
		public cardlayout()
		{
			fr=new Frame("My Frame");
			cl=new CardLayout();
			pl=new Panel();
			
			fr.add(pl);
			
			b1=new Button("button 1");
			b2=new Button("button 2");
			b3=new Button("button 3");
			b4=new Button("button 4");
			b5=new Button("button 5");
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			
			pl.setLayout(cl);
			pl.add("Button-1",b1);
			pl.add("Button-2",b2);
			pl.add("Button-3",b3);
			pl.add("Button-4",b4);
			pl.add("Button-5",b5);
			
			fr.setSize(300,400);
			fr.setBackground(Color.yellow);
			fr.setVisible(true);
		}
		public void actionPerformed(ActionEvent e)
			{
				cl.next(pl);
			}
		public static void main(String args[])
			{
				cardlayout cl=new cardlayout();
			}
		}
			
			
			
			
			
			
			
			
			
			