package threadstst;

import threadstst.ClasseImplementaRunnableStrBuilder;

public class ExecutaClasseStrBuilderRunnable {

	public static void main(String[] args) {

		boolean ThreadsAtivas = true;

		ClasseImplementaRunnableStrBuilder objBuilder = new ClasseImplementaRunnableStrBuilder("A");
		ClasseImplementaRunnableStrBuilder objBuilder1 = new ClasseImplementaRunnableStrBuilder("B");
		ClasseImplementaRunnableStrBuilder objBuilder2 = new ClasseImplementaRunnableStrBuilder("C");
		ClasseImplementaRunnableStrBuilder objBuilder3 = new ClasseImplementaRunnableStrBuilder("D");
		ClasseImplementaRunnableStrBuilder objBuilder4 = new ClasseImplementaRunnableStrBuilder("E");
		ClasseImplementaRunnableStrBuilder objBuilder5 = new ClasseImplementaRunnableStrBuilder("F");
		ClasseImplementaRunnableStrBuilder objBuilder6 = new ClasseImplementaRunnableStrBuilder("G");
		ClasseImplementaRunnableStrBuilder objBuilder7 = new ClasseImplementaRunnableStrBuilder("H");		

		Thread a1 = new Thread(objBuilder);
		Thread b1 = new Thread(objBuilder1);
		Thread c1 = new Thread(objBuilder2);
		Thread d1 = new Thread(objBuilder3);		
		Thread a2 = new Thread(objBuilder4);
		Thread b2 = new Thread(objBuilder5);
		Thread c2 = new Thread(objBuilder6);
		Thread d2 = new Thread(objBuilder7);
		
		try {

			// Não utilizar o método Run();
			// Usar Start e deixar a JVM gerenciar a requisição ao S.O para executar a Thread
			a1.start();
			b1.start();
			c1.start();
			d1.start();
			a2.start();
			b2.start();
			c2.start();
			d2.start();			
			
			while (ThreadsAtivas) { 
				ThreadsAtivas = ( a1.isAlive() || b1.isAlive() || c1.isAlive() || d1.isAlive() || a2.isAlive() || b2.isAlive() || c2.isAlive() || d2.isAlive() );				
			}

		} catch (Exception ex) {
			System.out.println("Exceção ao executar a Thread " + ex.getMessage());
			ex.printStackTrace();
		}
		finally {
			if (a1 != null)
				a1 = null;
			if (b1 != null)
				b1 = null;
			if (c1 != null)
				c1 = null;
			if (d1 != null)
				d1 = null;						
		}

	}

}