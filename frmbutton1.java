import java.awt.*;
	public class frmbutton1 extends Frame
	{
		public static void main(String args[])
		{
		Frame fr;
		Button b1,b2,b3,b4;
		Panel p1;
		fr=new Frame("my frame");
		p1=new Panel();
		b1=new Button("Save");
		b2=new Button("View");
		b3=new Button("Delete");
		b4=new Button("Resume");
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		fr.add(p1);
		fr.setSize(600,700);
		fr.setBackground(Color.red);
		fr.setVisible(true);
	}
}
		
		