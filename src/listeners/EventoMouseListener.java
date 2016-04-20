package listeners;

import java.awt.event.*;

public class EventoMouseListener implements MouseListener{
	String origemMouse;
	
	public EventoMouseListener(String varOrigemMouse) {
		origemMouse = varOrigemMouse;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse CLick: " + origemMouse);		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered: " + origemMouse);		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exit: "  + origemMouse);		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed: " + origemMouse);		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Release: " + origemMouse);		
	}
}
