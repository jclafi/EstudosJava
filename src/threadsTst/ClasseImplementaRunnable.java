package threadsTst;

//import java.lang.StringBuilder;

public class ClasseImplementaRunnable implements Runnable {
	int numero;
	char c;
	
	public ClasseImplementaRunnable(int varNumero, char varC) {
		numero = varNumero;
		c = varC;
		System.out.printf("Runnable vai imprimir %d vezes o caracatere %c %n", varNumero, varC);
	}
	
	public void run() {
		//StringBuilder strVar = new StringBuilder();
		for (int index = 0; index < numero; index++) {
			//strVar.append(c);
			System.out.println(c);
		}		
		//System.out.println(strVar);
	}
	
}
