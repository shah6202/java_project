import java.awt.*;
	public class flowlayout extends Frame
	{
		public static void main(String args[])
		{
		
		Frame fr;
		Button b1,b2,b3,b4,b5,b6;
		FlowLayout f1;
		
		fr=new Frame("My Frame");
		f1=new FlowLayout(FlowLayout.LEFT,30,30);
		
	    	b1=new Button("Save");
			b2=new Button("View");
			b3=new Button("Delete");
		    b4=new Button("Resume");
			b5=new Button("Pause");
			b6=new Button("Stop");
			
			fr.setLayout(f1);
			fr.add(b1);
			fr.add(b2);
			fr.add(b3);
			fr.add(b4);
			fr.add(b5);
			fr.add(b6);
			
			fr.setSize(500,400);
			fr.setBackground(Color.yellow);
			fr.setVisible(true);
		}
	}
