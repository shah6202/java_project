import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class frmdepnew extends JFrame
{
	private JPanel p1,p2,p3,p4,p5,p6,p7;
	private JTextField t1,t2,t3,t4,t5,t6,t7,tprice,qnt,uprice,cprice;
	JLabel title,l1,l2,l3,l4;
	private JButton add,b1,b2,b3;
	private Container cn;
	String str1,str2;
	int qt,up,tp,cp,tmp,dep;
	

		public frmdepnew()
	{
	    super("TIME TABLE");
	    setSize(600,700);
	    getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cn=getContentPane();
		cn.setLayout(new GridLayout(15,1));
		cn.setBackground(new Color(100,50,155));
		
		l1=new JLabel("INAME :");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l2=new JLabel("QNT :");
		l2.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l3=new JLabel("UPRICE :");
		l3.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l4=new JLabel("TIME PERIOD :");
		l4.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		
		b1=new JButton("TPRICE");
		b1.addActionListener(new tpriceListener());
		b1.setToolTipText("Click to calculate Tprice");
		b2=new JButton("DEPRICATION");
		b2.addActionListener(new depreciationListener());
		b2.setToolTipText("Click to calculate depreciation");
		b3=new JButton("CPRICE");
		b3.addActionListener(new cpriceListener());
		b3.setToolTipText("Click to calculate Cprice");

		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		t6=new JTextField(10);
		t7=new JTextField(10);
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p7=new JPanel();
		
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
		p7.add(b3);
		p7.add(t7);
		
		cn.add(p1);
		cn.add(p2);
		cn.add(p3);
		cn.add(p4);
		cn.add(p5);
		cn.add(p6);
		cn.add(p7);
		
		
		
		
		
		pack();
		setVisible(true);
	}
       private class tpriceListener implements ActionListener
       {
	         
	   public void actionPerformed(ActionEvent e)
	        {
			str1=t2.getText();
			str2=t3.getText();
			qt=Integer.parseInt(str1);
			up=Integer.parseInt(str2);
			tp=qt*up;
			str1=Integer.toString(tp);
			t5.setText(str1);
			
			}
        }
		private class depreciationListener implements ActionListener
       {
	   
	   public void actionPerformed(ActionEvent e)
	        {
			str1=t4.getText();
		
			tmp=Integer.parseInt(str1);
			
			if (tmp>10)
				dep=tp*30/100;
			else
				{
				if (tmp>7 && tmp<=10)
					dep=tp*20/100;
				else
					{
					if (tmp>5 && tmp<=700)
						dep=tp*15/100;
					else
						dep=tp*10/100;
			str1=Integer.toString(dep);
			t6.setText(str1);
			
			}
        }
		}
		}
	   private class cpriceListener implements ActionListener
       {
	         
	   public void actionPerformed(ActionEvent e)
	        {
			str1=t5.getText();
			str2=t6.getText();
			tp=Integer.parseInt(str1);
			dep=Integer.parseInt(str2);
			cp =tp-dep;
			str1=Integer.toString(cp);
			t7.setText(str1);
			
			}
        }
	
	public static 
	
	void main(String args[])
	{
	

		frmdepnew frm=new frmdepnew();
		
	}
	}
	
		
		
		