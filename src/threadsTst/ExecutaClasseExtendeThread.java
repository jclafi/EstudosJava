package threadsTst;

public class ExecutaClasseExtendeThread {

	public static void main(String[] args) {
		ClasseExtendeThread a = new ClasseExtendeThread(99999, '-');
		ClasseExtendeThread b = new ClasseExtendeThread(99999, '+');		
		ClasseExtendeThread c = new ClasseExtendeThread(99999, '*');		
		ClasseExtendeThread d = new ClasseExtendeThread(99999, '/');
		ClasseExtendeThread e = new ClasseExtendeThread(99999, '=');
		ClasseExtendeThread f = new ClasseExtendeThread(99999, '.');		
		ClasseExtendeThread g = new ClasseExtendeThread(99999, '#');		
		ClasseExtendeThread h = new ClasseExtendeThread(99999, '%');		
		
		//Não utilizar o método Run();
		//Usar Start e deixar a JVM gerenciar a requisição ao S.O  para executar a Thread 
		a.start();
		b.start();		
		c.start();
		d.start();
		e.start();
		f.start();		
		g.start();
		h.start();		
		
	}

}

