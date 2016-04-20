package listeners;

import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventoTextListener implements TextListener {

	@Override
	public void textValueChanged(TextEvent e) {
		System.out.println("Text Value: " + e.getID() );
	}

}