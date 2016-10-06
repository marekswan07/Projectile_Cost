package projectile_cost_calculator;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

//Variables and others for the GUI
public class Interface extends JFrame implements ActionListener {
	JButton calculate,exit;
	JFrame frame;
	JLabel projectile_cost, powder_cost, brass_cost, primer_cost, used_powder;
	JTextField insert_projectile, insert_powder,insert_brass,insert_primer, insert_upowder;
	JTextArea output_cost;
	
//Starts listener 	
public JPanel createContentPanel(){
// creates panel to place UI on
	JPanel main_panel = new JPanel();
	main_panel.setLayout(null);
	main_panel.setSize(500, 450);
	
//Adding labels to the panel
//Label properties
	projectile_cost = new JLabel("Projectile Cost");
	projectile_cost.setLocation(30,20);
	projectile_cost.setSize(110,20);
// adds label to panel
	main_panel.add(projectile_cost);
	
	powder_cost = new JLabel("Powder Cost");
	powder_cost.setLocation(150,20);
	powder_cost.setSize(110,20);
	main_panel.add(powder_cost);
	
	brass_cost = new JLabel("Brass Cost");
	brass_cost.setLocation(260,20);
	brass_cost.setSize(110,20);
	main_panel.add(brass_cost);
	
	primer_cost = new JLabel("Primer Cost");
	primer_cost.setLocation(360,20);
	primer_cost.setSize(110,20);
	main_panel.add(primer_cost);
	
// Adding text fields
	insert_projectile = new JTextField();
	insert_projectile.setLocation(30,50);
	insert_projectile.setSize(90,30);
	main_panel.add(insert_projectile);
	
	insert_powder = new JTextField();
	insert_powder.setLocation(150,50);
	insert_powder.setSize(90,30);
	main_panel.add(insert_powder);
	
	insert_brass = new JTextField();
	insert_brass.setLocation(255,50);
	insert_brass.setSize(90,30);
	main_panel.add(insert_brass);
	
	insert_primer = new JTextField();
	insert_primer.setLocation(355,50);
	insert_primer.setSize(90,30);
	main_panel.add(insert_primer);
	
// lower text field and label
	used_powder = new JLabel("Used Powder Per Round");
	used_powder.setLocation(120,90);
	used_powder.setSize(200,20);
	main_panel.add(used_powder);
	
	insert_upowder = new JTextField();
	insert_upowder.setLocation(150,130);
	insert_upowder.setSize(90,30);
	main_panel.add(insert_upowder);
	
	
	return main_panel;

}
private static void createAndRunGUI(){
	JFrame.setDefaultLookAndFeelDecorated(false);
	JFrame frame = new JFrame("Reloading Calculator");
	Interface demo = new Interface();
	frame.setContentPane(demo.createContentPanel());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500, 450);
	frame.setVisible(true);
	}

public static void main(String[]args){
//Starts and runs GUI interface and program
	SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			createAndRunGUI();
			}
	});
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}