package threadsTst;

public class ExecutaClasseImplementaRunnable {

	public static void main(String[] args) {
		ClasseImplementaRunnable a = new ClasseImplementaRunnable(1000, '-');
		ClasseImplementaRunnable b = new ClasseImplementaRunnable(1000, '+');		
		ClasseImplementaRunnable c = new ClasseImplementaRunnable(1000, '*');		
		ClasseImplementaRunnable d = new ClasseImplementaRunnable(1000, '/');
		
		Thread a1 = new Thread(a);
		Thread b1 = new Thread(b);		
		Thread c1 = new Thread(c);
		Thread d1 = new Thread(d);		
		
		//Não utilizar o método Run();
		//Usar Start e deixar a JVM gerenciar a requisição ao S.O  para executar a Thread 
		a1.start();
		b1.start();		
		c1.start();
		d1.start();

	}

}

