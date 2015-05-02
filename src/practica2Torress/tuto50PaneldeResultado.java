package practica2Torress;

import java.awt.*;

import javax.swing.*;

public class tuto50PaneldeResultado extends JPanel {

	JLabel labelresultado;
	
	
	tuto50PaneldeResultado(){
		

		//this.setBackground(Color.blue);
		
		FlowLayout layout = new FlowLayout();
		layout.setVgap(20);
		
		setLayout(layout);
		
		labelresultado = new JLabel("00");
		
		add(new JLabel("Resultado: "));
		add(labelresultado);
		
	}
	
	
	void setLabelResultado(float numero){
		String texto = Float.toHexString(numero);
		labelresultado.setText(texto);
		
	}
	
	
	
	
	
	
	
	
	
}
