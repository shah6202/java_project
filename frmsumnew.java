import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class frmsumnew extends JFrame
{
   private JPanel p1,p2,p3,p4,p5,p6;
   private JTextField acn,nm,amt,interest,tax,namt;
   JLabel title,l1,l2,l3;
   private JButton add1,b1,b2,b3;
   private Container cn;
   String str1,str2,str3;
   int amt1,it1,tax1,namt1;
   
   
   public frmsumnew()
   {
   super("BANK INFORMATION");
   setSize(600,700);
   getContentPane().setLayout(null);
   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cn=getContentPane();
		cn.setLayout(new GridLayout(15,1));
		cn.setBackground(new Color(100,50,155));
		
		l1=new JLabel("ACN :");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l2=new JLabel("NM :");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		l3=new JLabel("AMT :");
		l1.setFont(new Font("Monotype corsiva",Font.BOLD,16));
		
		b1=new JButton("INT");
		b1.addActionListener(new interestListener());
		b1.setToolTipText("Click to calculate Interest");
		b2=new JButton("TAX");
		b2.addActionListener(new taxListener());
		b2.setToolTipText("Click to calculate tax");
		
		
       
		
		
		b3=new JButton("NAMT");
		b3.addActionListener(new namtListener());
		b3.setToolTipText("Click to calculate namt");
		
		
		
		
		acn=new JTextField(10);
		nm=new JTextField(10);
		amt=new JTextField(10);
		interest=new JTextField(10);
		tax=new JTextField(10);
		namt=new JTextField(10);
		
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		
		
		p1.add(l1);
		p1.add(acn);
		p2.add(l2);
		p2.add(nm);
		p3.add(l3);
		p3.add(amt);
		p4.add(b1);
		p4.add(interest);
		p5.add(b2);
		p5.add(tax);
		p6.add(b3);
		p6.add(namt);
		
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
			str1=amt.getText();
			amt1=Integer.parseInt(str1);
			it1=amt1*10/100;
			str1=Integer.toString(it1);
			interest.setText(str1);
			
			}
        }
private class taxListener implements ActionListener
       {
	   public void actionPerformed(ActionEvent e)
	        {
			str2=amt.getText();
			amt1=Integer.parseInt(str2);
			tax1=amt1*3/100;
			str2=Integer.toString(tax1);
			tax.setText(str2);
			
			}
		}
		private class namtListener implements ActionListener
       {
	   public void actionPerformed(ActionEvent e)
	        {
			str3=amt.getText();
			amt1=Integer.parseInt(str3);
			str1=interest.getText();
			it1=Integer.parseInt(str1);
			str1=tax.getText();
			tax1=Integer.parseInt(str1);
			namt1=amt1+it1-tax1;
			
			str3=Integer.toString(namt1);
			namt.setText(str3);
			
			}
		}
	
	public static void main(String args[])
	{
		frmsumnew frm=new frmsumnew();
		
		
		
	}
	}
	
		
		
		
   