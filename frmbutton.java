import java.awt.*;
	public class frmbutton extends Frame
	{
		public static void main(String args[])
		{
			Frame fr;
			Button b1,b2;
			Panel P1;
			
			fr=new Frame("MyFrame");
			P1=new Panel();
			
			b1=new Button("Save");
			b2=new Button("View");
			
			P1.add(b1);
			P1.add(b2);
			
			fr.add(P1);
			
			fr.setSize(300,400);
			fr.setBackground(Color.red);
		    fr.setVisible(true);
			}
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	