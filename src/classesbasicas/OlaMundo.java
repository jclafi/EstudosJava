package classesbasicas;

import java.util.concurrent.TimeUnit;

public class OlaMundo {

	public static void main(String[] args) {
		/* Bloco de Coment�rio
		 * Coforme especificado
		 * Pela Apostila
		 * Java */
		
		//Coment�rio Java
		
		/** Coment�rio Java */
		
		System.out.println("Ol� Mundo");
		
		// If the connection failed wait a minute and try again
		try {
			 TimeUnit.MINUTES.sleep(1);
		 }
		 catch (InterruptedException ex) {
			 System.out.println("Exce��o ao rodar sleep: " + ex.getMessage());
		 }
	}

}
