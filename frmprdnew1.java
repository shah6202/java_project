import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class frmprdnew1 extends JFrame
{ 
	private JPanel p1,p2;
	private JTextField icode,iname;
	JLabel title, l1,l2;
	private Container cn;
	
	
	public frmprdnew1()
	{
	super("SHOP INFORMATION");
	setSize(600,700);
	getContentPane().setLayout(null);
   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cn=getContentPane();
		cn.setLayout(new GridLayout(15,1));
		cn.setBackground(new Color(100,50,155));
		
		l1=new JLabel("icode :");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l2=new JLabel("iname :");
		l2.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		
		icode=new JTextField(10);
		iname=new JTextField(10);
		p1=new JPanel();
		p2=new JPanel();
		
		p1.add(l1);
		p1.add(icode);
		p2.add(l2);
		p2.add(iname);
		
		cn.add(p1);
		cn.add(p2);
		pack();
		setVisible(true);
	}
	
	public static void main(String args[])
	{
	

		frmprdnew1 frm=new frmprdnew1();
		
		
		
	}
	}
	
	