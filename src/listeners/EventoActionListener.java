package listeners;

import java.awt.event.*;

public class EventoActionListener implements ActionListener {
	String strOrigem;
	
	//Bloco de Inicialização
	{
		strOrigem = "Instância";	
	}	
	
	public EventoActionListener(String varOrigem) {
		strOrigem = varOrigem;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Action Event: "+ arg0.getID());		
		
		//Verifica o ID do Evento
		switch (arg0.getID()) {
		case 1001 : System.out.println("Classe Action Listener: " + arg0.getActionCommand() + "Origem: " + strOrigem); break; 
		}
	}
}
