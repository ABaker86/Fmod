package com.File.Mod.Adam;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	public MainFrame (String title){
		super (title);
		
//Set layout manager
	setLayout(new BorderLayout());
//Declare swing components
		JMenuBar menuBar;
		JMenu menu;
		JMenuItem menuItem;
		
		
		//a group of JMenuItems
				//////////////////////////
				final JTextArea textArea = new JTextArea();
				final JTextField filePath = new JTextField();
				JButton button = new JButton("Append!");
		//add components to content pane
			
			Container c = getContentPane();
			c.add(textArea, BorderLayout.WEST);
			c.add(button, BorderLayout.SOUTH);
			c.add(filePath, BorderLayout.NORTH);
	
//create swing components
		/*create menu bar*/
		menuBar  = new JMenuBar();
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription(
		        "Shows menu items under File tab");
		menuBar.add(menu);
///menu items must be placed under their specific menu section
			menuItem = new JMenuItem("Get TStamp",KeyEvent.VK_T);
				menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));
				menuItem.getAccessibleContext().setAccessibleDescription("Find file to mod.");
				menuItem.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
					String x = filePath.getText();
					
					
						
						File file = new File(x);
						if (file.exists())
						{
							try {
						SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
						textArea.append("This is the stamp before " + file.lastModified()+"\n");
						textArea.append("This is the stamp now readable " + sdf.format(file.lastModified())+"\n");}
					 catch (Exception exception) {
						textArea.append("There was an error reading getting the file.");
					}	
				}else{textArea.append("The file path is incorrect or does not exist!");}
						
				}});
				menu.add(menuItem);
				
			menuItem = new JMenuItem("Exit",KeyEvent.VK_T);
				menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
				menuItem.getAccessibleContext().setAccessibleDescription("Exit program");
				menuItem.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){System.exit(0);}});
				menu.add(menuItem);
		///set second menue item
		menu = new JMenu("Help");
		menu.setMnemonic(KeyEvent.VK_N);
		menu.getAccessibleContext().setAccessibleDescription(
		        "Shows Help menu");
		menuBar.add(menu);
		
		setJMenuBar(menuBar);
		
		//Build menu in the menu bar.
		final JFrame frame = new JFrame();
		menuItem = new JMenuItem("About",KeyEvent.VK_T);
		menuItem.getAccessibleContext().setAccessibleDescription("This option displays the About dialog.");
		menuItem.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog( frame, "File Mod\n\n File Mod is a simple Java Swing Program\n dedicated to altering the timestamp of specified files.\n \u00A9 2013 ABaker", "About File Mod",  JOptionPane.PLAIN_MESSAGE);};
			});
		menu.add(menuItem);
		
		
	
///add behavior
	button.addActionListener(new ActionListener(){
		@Override 
		public void actionPerformed(ActionEvent e){
		textArea.append("\n Hello");
		}
	});
	
	}
	
	
}
