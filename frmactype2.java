import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class frmactype2 extends JFrame
{
	private JPanel p1,p2,p3,p4,p5,p6,p7,p8;
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JLabel title,l1,l2,l3,l4,l5;
	private JButton add,b1,b2,b3;
	private Container cn;
	String str1,str2,str3;
	int currentbalance,balanceamount,depositamount,withdrawamount,interest,netbalance;
	
	public frmactype2()
	{
		super("AC_TYPE");
	    setSize(600,700);
	    getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cn=getContentPane();
		cn.setLayout(new GridLayout(15,1));
		cn.setBackground(new Color(100,50,155));
		
		l1=new JLabel("AC_N0 :");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l2=new JLabel("NAME :");
		l2.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l3=new JLabel("BALANCE_AMOUNT :");
		l3.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l4=new JLabel("DEPOSIT_AMOUNT :");
		l4.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l5=new JLabel("WITHDRAW_AMOUNT :");
		l5.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		
		b1=new JButton("current_balance");
		b1.addActionListener(new currentbalanceListener());
		b1.setToolTipText("Click to calculate currentbalance");
		b2=new JButton("interest");
		b2.addActionListener(new interestListener());
		b2.setToolTipText("Click to calculate interest");
		b3=new JButton("net_balance");
		b3.addActionListener(new netbalanceListener());
		b3.setToolTipText("Click to calculate netbalance");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		t6=new JTextField(10);
		t7=new JTextField(10);
		t8=new JTextField(10);
		
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p7=new JPanel();
		p8=new JPanel();
		
		p1.add(l1);
		p1.add(t1);
		cn.add(p1);
		p2.add(l2);
		p2.add(t2);
		cn.add(p2);
		p3.add(l3);
		p3.add(t3);
		cn.add(p3);
		p4.add(l4);
		p4.add(t4);
		cn.add(p4);
		p5.add(l5);
		p5.add(t5);
		cn.add(p5);
		p6.add(b1);
		p6.add(t6);
		cn.add(p6);
		p7.add(b2);
		p7.add(t7);
		cn.add(p7);
		p8.add(b3);
		p8.add(t8);
		cn.add(p8);
		
		pack();
		setVisible(true);
		
	}	
	private class currentbalanceListener implements ActionListener
       {
	         
	   public void actionPerformed(ActionEvent e)
	        {
			str1=t3.getText();
			str2=t4.getText();
			str3=t5.getText();
			balanceamount=Integer.parseInt(str1);
			depositamount=Integer.parseInt(str2);
			withdrawamount=Integer.parseInt(str3);
			currentbalance=balanceamount+depositamount-withdrawamount;	
			str1=Integer.toString(currentbalance);
			t6.setText(str1);
			}
	   }
	   private class interestListener implements ActionListener
       {
	         
	   public void actionPerformed(ActionEvent e)
	        {
			str1=t6.getText();
			//str2=t5.getText();
			interest=Integer.parseInt(str2);
			  if (currentbalance>20000)
					interest=currentbalance*30/100;
				else
				{
					if(currentbalance>15000 && currentbalance<=15000)
							interest=currentbalance*20/100;
				else
				{
					if(currentbalance>10000 && currentbalance<=15000)
							interest=currentbalance*15/100;
				else
				{
					if(currentbalance>10000)
							interest=currentbalance*10/100;
				}
				}
				}
			str1=Integer.toString(interest);
			t7.setText(str1);	
        }	
	}
	private class netbalanceListener implements ActionListener
       {
	         
	   public void actionPerformed(ActionEvent e)
	        {
			str1=t6.getText();
			str2=t7.getText();
			currentbalance=Integer.parseInt(str1);
			interest=Integer.parseInt(str2);
			netbalance=currentbalance+interest;	
			str1=Integer.toString(netbalance);
			t8.setText(str1);
			}
	   }
						
	
		public static void main(String args[])
	{
		frmactype2 frm=new frmactype2();	
	}
	}
