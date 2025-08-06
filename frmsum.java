import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class frmsum extends JFrame
{

private JPanel p1,p2,p3,p4,p5,p6;
private JTextField t1,t2,t3;
JLabel title,l1,l2,l3;
private JButton add1,ext;
private Container cn;
String str1,str2,str3;
int n1,n2,n3;
public frmsum()
{
		super("SUM OF TWO NOS");
		setSize(600,700);
        getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cn=getContentPane();
		cn.setLayout(new GridLayout(15,1));
		cn.setBackground(new Color(200,150,100));
		
		title=new JLabel("WELCOME TO ENTRY SCREEN");
		title.setFont(new Font("Monotype corsiva",Font.BOLD,30));
		title.setForeground(new Color(225,150,246));
		title.setBounds(0,0,805,80);
		p1=new JPanel();
		p1.add(title);
		p1.setBackground(new Color(152,26,150));
		cn.add(p1);
		l3=new JLabel("Sum is");
		
		l2=new JLabel("Enter Second NO.");
		l2.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l3=new JLabel("Sum is");
		l3.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		
		p2=new JPanel();
		p2.add(l3);
		p2.setBackground(new Color(100,150,150));
		cn.add(p2);
	    t1=new JTextField(10);
	    p3=new JPanel();
	    l1=new JLabel("Enter 1st N0");
		l1.setFont (new Font("Monotype corsiva",Font.BOLD,16));
		p3.add(l1);
		p3.add(t1);
		cn.add(p3);
		
		l2=new JLabel("Enter Second No");
		l2.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		
		t2=new JTextField(10);
        p4=new JPanel();		
		p4.add(l2);
		p4.add(t2);
		cn.add(p4);
		
		add1=new JButton("Sum");
		add1.addActionListener(new addListener());
		add1.setToolTipText("Click to add");
		add1.setMnemonic('S');
		add1.setBackground(Color.yellow);
		t3=new JTextField(10);
		
		p5=new JPanel();
		p5.add(add1);
		p5.add(t3);
		cn.add(p5);
		p6=new JPanel();
		
		ext=new JButton("Exit");
		ext.addActionListener(new exitListener());
		ext.setToolTipText("Click to Exit");
		ext.setBackground(Color.yellow);
		p6.add(ext);
		cn.add(p6);
		pack();
		setVisible(true);
		}
		private class exitListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
			dispose();
			}
		}
private class addListener implements ActionListener
       {
	   public void actionPerformed(ActionEvent e)
	        {
			str1=t1.getText();
			str2=t2.getText();
			n1=Integer.parseInt(str1);
			n2=Integer.parseInt(str2);
			n3=n1+n2;
			str3=Integer.toString(n3);
			t3.setText(str3);
			
			}
		}
		
		public static void main(String args[])
	{
	frmsum sm=new frmsum();
}
}



	
	
		
		

