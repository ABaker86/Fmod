package com.File.Mod.Adam;

import javax.swing.*;

/** This is a program for modifying the time-stamp on files*/

public class Filemod  {
	public static void main (String [] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{public void run(){
			
		JFrame jf = new MainFrame("File Mod");
		jf.setSize(500, 400);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);	
			
		}
	});
}}
