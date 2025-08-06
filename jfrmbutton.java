import java.awt.*;
import javax.swing.*;
	public class jfrmbutton1 extends jFrame
	{
		public static void main(String args[])
		{
		JFrame fr;
		JButton b1, b2,b3,b4;
		JPanel p1;
		fr=new JFrame("my frame");
		p1=new JPanel();
		b1=new JButton("Save");
		b2=new JButton("View");
		b3=new JButton("Delete");
		b4=new JButton("Resume");
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
		
		