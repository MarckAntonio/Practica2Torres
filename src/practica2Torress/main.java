package practica2Torress;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame implements ActionListener{
	
	tuto50PanelOperando tuto50paneloperando;
	tuto50PaneldeOperaciones tuto50paneldeoperaciones;
	tuto50PaneldeResultado tuto50panelderesultado;
	
	
	
	main(){
		super("Torres de Hanoi");
		setBounds (200,200,500,350);
		setVisible(true);
		setResizable(false);
		
		Container contentpane = getContentPane();
		contentpane.setLayout(new GridLayout(3,1));
		
		//inicializamos paneles
		tuto50paneloperando = new tuto50PanelOperando();
		tuto50paneldeoperaciones = new tuto50PaneldeOperaciones(this);
		tuto50panelderesultado = new tuto50PaneldeResultado();
				
		contentpane.add(tuto50paneloperando);
		contentpane.add(tuto50paneldeoperaciones);
		contentpane.add(tuto50panelderesultado);
		
		paintComponents (getGraphics());//para que se dibujen todos los objetos
	}

	public static void main (String [] args){
		main ventana = new main();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Se registro un evento");
		float operando1 = tuto50paneloperando.getOperando1();
		float operando2 = tuto50paneloperando.getOperando2();
		float resultado;
		
		if (e.getSource()== tuto50paneldeoperaciones.botonsuma){
		resultado = 55;
		System.out.println("Carnal");
		tuto50panelderesultado.setLabelResultado(resultado);
		}
		
		if (e.getSource()== tuto50paneldeoperaciones.botonresta){
		resultado = operando1-operando2;
		tuto50panelderesultado.setLabelResultado(resultado);
		}
		
		if (e.getSource()== tuto50paneldeoperaciones.botonmulti){
		resultado = operando1*operando2;
		tuto50panelderesultado.setLabelResultado(resultado);
		}
		
		if (e.getSource()== tuto50paneldeoperaciones.botondividir){
		resultado = operando1/operando2;
		tuto50panelderesultado.setLabelResultado(resultado);
		}		
	
	
	}
	
}
