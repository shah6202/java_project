import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class frmprdnew extends JFrame
{
	private JPanel p1,p2,p3,p4,p5,p6,p7;
	private JTextField icode,iname,qnt,uprice,tprice,discount,cprice;
	JLabel title,l1,l2,l3,l4;
	private JButton add1,b1,b2,b3;
	private Container cn;
	String str1,str2;
	int qt,up,tp,ds,cp;
	
	
	public frmprdnew()
	{
	super("SHOP INFORMATION");
	setSize(600,700);
	getContentPane().setLayout(null);
   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cn=getContentPane();
		cn.setLayout(new GridLayout(15,1));
		cn.setBackground(new Color(100,50,155));
		
		l1=new JLabel("ICODE :");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l2=new JLabel("INAME :");
		l2.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l3=new JLabel("QNT :");
		l3.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l4=new JLabel("UPRICE :");
		l4.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		
		b1=new JButton("TPRICE");
		b1.addActionListener(new tpriceListener());
		b1.setToolTipText("Click to calculate Tprice");
		b2=new JButton("DISCOUNT");
		b2.addActionListener(new discountListener());
		b2.setToolTipText("Click to calculate discount");
		b3=new JButton("CPRICE");
		b3.addActionListener(new cpriceListener());
		b3.setToolTipText("Click to calculate current_price");
		
		
		icode=new JTextField(10);
		iname=new JTextField(10);
		qnt=new JTextField(10);
		uprice=new JTextField(10);
		tprice=new JTextField(10);
		discount=new JTextField(10);
		cprice=new JTextField(10);
		
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p7=new JPanel();
		
		p1.add(l1);
		p1.add(icode);
		p2.add(l2);
		p2.add(iname);
		p3.add(l3);
		p3.add(qnt);
		p4.add(l4);
		p4.add(uprice);
		p5.add(b1);
		p5.add(tprice);
		p6.add(b2);
		p6.add(discount);
		p7.add(b3);
		p7.add(cprice);
		
		
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
			str1=qnt.getText();
			str2=uprice.getText();
			qt=Integer.parseInt(str1);
			up=Integer.parseInt(str2);
			tp=qt*up;
			str1=Integer.toString(tp);
			tprice.setText(str1);
			
			}
        }
		private class discountListener implements ActionListener
       {
	   public void actionPerformed(ActionEvent e)
	        {
			str1=tprice.getText();
			tp=Integer.parseInt(str1);
			if(tp>10000)
				ds=tp*10/100;
			else
			    {
				   if(tp>7000 && tp<=10000)
					ds=tp*7/100;
				   else
				    {
				        if(tp>5000 && tp<=7000)
						  ds=tp*5/100;
						else
						  ds=tp*3/100;
					}
				}
					
			str1=Integer.toString(ds);
			discount.setText(str1);
			
			}
        }
		
		private class cpriceListener implements ActionListener
       {
	   public void actionPerformed(ActionEvent e)
	        {
			str1=tprice.getText();
			str2=discount.getText();
		    tp=Integer.parseInt(str1);
		    ds=Integer.parseInt(str2);
		     cp=tp-ds;
			str1=Integer.toString(cp);
			cprice.setText(str1);
			
			
			}
        }
		
		
	public static void main(String args[])
	{
	

		frmprdnew frm=new frmprdnew();
		
		
		
	}
	}
	
	
