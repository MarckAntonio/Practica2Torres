package practica2Torress;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;


public class tuto50PanelOperando extends JPanel {

	JTextField operando1, operando2;
	
	
	
	
	
	tuto50PanelOperando(){
		//this.setBackground(Color.white);
		
		FlowLayout layout = new FlowLayout();
		layout.setVgap(20);
		
		setLayout(layout);
		
		
		operando1= new JTextField(12);
		operando2= new JTextField(12);
		
		add(new JLabel ("Operando 1: ") );
		add(operando1);
		add(new JLabel ("Operando 2: ") );
		add(operando2);
		
	}
	
	float getOperando1(){
	return Float.parseFloat(operando1.getText());
	}
	
	float getOperando2(){
	return Float.parseFloat(operando2.getText());
	}
	
}
