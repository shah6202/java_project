import java.awt.*;
public class frmchoice1 extends Frame
{
	public static void main(String args[])
	{
	Frame fr;
	Panel p1;
	Choice ch;
	
	fr=new Frame("My Frame");
	p1=new Panel();
	ch=new Choice();
	
	ch.addItem("option-1");
	ch.addItem("option-2");
	ch.addItem("option-3");
	ch.addItem("option-4");
	ch.addItem("option-5");
	ch.addItem("option-6");
	p1.add(ch);
	fr.add(p1);
	
	fr.setSize(300,400);
	fr.setBackground(Color.red);
	fr.setVisible(true);
	}
   }