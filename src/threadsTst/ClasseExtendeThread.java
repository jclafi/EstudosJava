package threadsTst;

//import java.lang.StringBuilder;

public class ClasseExtendeThread extends Thread {
	long numero;
	char c;	
	
	//Construtor
	public ClasseExtendeThread(long varNumero, char varC) {
		numero = varNumero;
		c = varC;
		
		System.out.printf("Extende Thread imprime %d vezes o caractere %c %n", varNumero, varC);				
	}
	
	//Sobrescreve o método run
	public void run() {
		//StringBuilder strVar = new StringBuilder();
		for (long index = 0; index < numero; index++) {
			//strVar.append(c);			
			System.out.println(c);
		}
		//System.out.println(strVar);		
	}
}
