import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class frmmstatusnew extends JFrame
{
		private JPanel p1,p2,p3,p4,p5,p6;
		private JTextField t1,t2,t3,t4,t5,t6;
		JLabel title,l1,l2,l3,l4;
		private JButton add,b1,b2;
		private Container cn;
		
		public frmmstatusnew()
	{
	    super("martial status");
	    setSize(600,700);
	    getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cn=getContentPane();
		cn.setLayout(new GridLayout(15,1));
		cn.setBackground(new Color(100,50,155));
		
		l1=new JLabel("CODE:");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l2=new JLabel("NAME:");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l3=new JLabel("MARTIAL STATUS:");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l4=new JLabel("SALARY:");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		
		b1=new JButton("ALLOUNCE");
		b2=new JButton("NET SALARY");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		t6=new JTextField(10);
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		
		p1.add(l1);
		p1.add(t1);
		p2.add(l2);
		p2.add(t2);
		p3.add(l3);
		p3.add(t3);
		p4.add(l4);
		p4.add(t4);
		p5.add(b1);
		p5.add(t5);
		p6.add(b2);
		p6.add(t6);
		
		cn.add(p1);
		cn.add(p2);
		cn.add(p3);
		cn.add(p4);
		cn.add(p5);
		cn.add(p6);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String args[])
	{
	

		frmmstatusnew frm=new frmmstatusnew();
		
		
		
	}
	}
	