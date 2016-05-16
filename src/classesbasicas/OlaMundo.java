package classesbasicas;

import java.util.concurrent.TimeUnit;

public class OlaMundo {

	public static void main(String[] args) {
		/* Bloco de Comentário
		 * Coforme especificado
		 * Pela Apostila
		 * Java */
		
		//Comentário Java
		
		/** Comentário Java */
		
		System.out.println("Olá Mundo");
		
		// If the connection failed wait a minute and try again
		try {
			 TimeUnit.MINUTES.sleep(1);
		 }
		 catch (InterruptedException ex) {
			 System.out.println("Exceção ao rodar sleep: " + ex.getMessage());
		 }
	}

}
