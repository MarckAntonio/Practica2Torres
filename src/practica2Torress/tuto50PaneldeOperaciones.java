package practica2Torress;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class tuto50PaneldeOperaciones extends JPanel {

	JButton botonsuma, botonresta, botonmulti, botondividir;
	
	
	tuto50PaneldeOperaciones(main oyente){
		//this.setBackground(Color.red);
		
		FlowLayout layout = new FlowLayout();
		layout.setHgap(20);
		layout.setVgap(30);
		layout.setAlignment(FlowLayout.CENTER);
		setLayout(layout);
		
		//inicializando botones
		botonsuma = new JButton("Mover ");
		botonresta= new JButton("Torre 1");
		botonmulti = new JButton("Torre 2");
		botondividir= new JButton("Torre 3");
		
		botonsuma.addActionListener(oyente);
		botonresta.addActionListener(oyente);
		botonmulti.addActionListener(oyente);
		botondividir.addActionListener(oyente);
		
		add(botonsuma);
		add(botonresta);
		add(botonmulti);
		add(botondividir);
		
	}

	
	
	
	
}
