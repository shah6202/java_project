import java.awt.*;
public class menu extends Frame
{
	public static void main(String args[])
	{
		Frame fr;
		MenuBar mb;
		
		fr=new Frame("MyMenu");
		mb=new MenuBar();
		
		fr.setMenuBar(mb);
		
		Menu mfile,medit;
		mfile=new Menu("File");
		medit=new Menu("Edit");
		
		mb.add(mfile);
		mb.add(medit);
		
		
		MenuItem mnew,mclose,mcopy,mpaste;
		
		mnew=new Menu("New");
		mclose=new Menu("Close");
		
		mfile.add(mnew);
		mfile.add(mclose);
		
		mcopy=new MenuItem("Copy");
		mpaste=new MenuItem("Paste");
		medit.add(mcopy);
		medit.add(mpaste);
		
		mclose.setEnabled(false);
		
		CheckboxMenuItem mprint;
		mprint=new CheckboxMenuItem("Print");
		
		mfile.add(mprint);
		mfile.addSeparator();
		
		Menu mfont;
		mfont=new Menu("Font");
		mfile.add(mfont);
		mfont.add("Arial");
		mfont.add("Times New Roman");
		
		
		fr.setSize(400,400);
		fr.setBackground(Color.blue);
		fr.setVisible(true);
	}
	
}
		