package com.File.Mod.Adam;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	public MainFrame (String title){
		super (title);
		
//Set layout manager
	setLayout(new BorderLayout());
//Declare swing components
		JMenuBar menuBar;
		JMenu menu, submenu;
		JMenuItem menuItem;
	
//create swing components
		/*create menu bar*/
		menuBar  = new JMenuBar();
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription(
		        "The only menu in this program that has menu items");
		menuBar.add(menu);
///set second menue item
		//Build second menu in the menu bar.
		menu = new JMenu("Help");
		menu.setMnemonic(KeyEvent.VK_N);
		menu.getAccessibleContext().setAccessibleDescription(
		        "This menu does nothing");
		menuBar.add(menu);

		
		setJMenuBar(menuBar);
		
		//a group of JMenuItems
		//////////////////////////
		final JTextArea textArea = new JTextArea();
		JButton button = new JButton("click me!");
//add components to content pane
	
	Container c = getContentPane();
	c.add(textArea, BorderLayout.CENTER);
	c.add(button, BorderLayout.SOUTH);
	
///add behavior
	button.addActionListener(new ActionListener(){
		@Override 
		public void actionPerformed(ActionEvent e){
		textArea.append("\n Hello");
		}
	});
	
	}
}
