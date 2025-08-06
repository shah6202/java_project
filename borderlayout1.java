import java.awt.*;

	public class borderlayout1 extends Frame
	{
		public static void main(String args[])
		{
		
			Frame fr;
			Button b1,b2,b3,b4,b5;
			BorderLayout bl;
			
			fr=new Frame("My Frame");
			bl=new BorderLayout(20,20);
			
			b1=new Button("East");
			b2=new Button("West");
			b3=new Button("North");
			b4=new Button("South");
			b5=new Button("Center");
			
			
			fr.setLayout(bl);
			fr.add("East",b1);
			fr.add("West",b2);
			fr.add("North",b3);
			fr.add("South",b4);
			fr.add("Center",b5);
			
			
			fr.setSize(1000,1000);
			fr.setBackground(Color.blue);
			fr.setVisible(true);
		}
	}
	
	
	
	
	
	
	
	
