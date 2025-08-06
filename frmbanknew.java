import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class frmbanknew extends JFrame
{
		private JPanel p1,p2,p3,p4,p5,p6;
		private JTextField t1,t2,t3,t4,t5,t6;
		JLabel title,l1,l2,l3,l4;
		private JButton add,b1,b2;
		private Container cn;
		String str1,str2;
	    int tamt,interest,netamount;
		
	public frmbanknew()
	{
	    super("acn type");
	    setSize(600,700);
	    getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cn=getContentPane();
		cn.setLayout(new GridLayout(15,1));
		cn.setBackground(new Color(100,50,155));
		
		l1=new JLabel("ACN NO :");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l2=new JLabel("NAME:");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l3=new JLabel("TRANSACTION TYPE:");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l4=new JLabel("TRANSACTION AMOUNT:");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		
		b1=new JButton("interest");
		b1.addActionListener(new interestListener());
		b1.setToolTipText("Click to calculate interest");
		b2=new JButton("net_amount");
		b2.addActionListener(new netamountListener());
		b2.setToolTipText("Click to calculate netamount");
		

		
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
	
	private class interestListener implements ActionListener
       {
	         
	   public void actionPerformed(ActionEvent e)
	        {
			str1=t3.getText();
			str2=t4.getText();
			//str2=Integer.parseInt(str2);
			tamt=Integer.parseInt(str2);
			if(str1.compareTo("saving")==0)
				interest=tamt*7/100;
				else
				{
					if(str1.compareTo("current")==0)
						interest=tamt*5/100;
				else
				{
					if(str1.compareTo("fixed")==0)
					interest=tamt*8/100;
				}
				}
		
			str1=Integer.toString(interest);
			t5.setText(str1);
			
			}
        }
	
		private class netamountListener implements ActionListener
       {
	         
	   public void actionPerformed(ActionEvent e)
	        {
			str1=t4.getText();
			str2=t5.getText();
			tamt=Integer.parseInt(str1);
			interest=Integer.parseInt(str2);
			netamount=tamt+interest;
			str1=Integer.toString(netamount);
			t6.setText(str1);
			
			}
        }
	
	
	public static void main(String args[])
	{
	

		frmbanknew frm=new frmbanknew();
		
		
		
	}
	}
	