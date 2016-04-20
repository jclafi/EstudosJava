package classesBasicas;

import packageTst.ClassePackage;

public class ClasseOperadores {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ClassePackage objPackage = new ClassePackage();
		
		System.out.println("Data e Hora: " + objPackage.getDateTime());
		
		//Operadores de Nega��o
		boolean booVar = true;		
		System.out.println(booVar);

		//Teste de Nega��o
		boolean booVar2 = !booVar;		
		System.out.println(booVar2);
		
		//Operador incremento/decremento pr� e p�s fixado
		int varInt = 0;
		System.out.println("Result 1 => " + ++varInt);
		varInt = 0;
		System.out.println("Result 0 => " + varInt++);		
		System.out.println("Result 1 => " + varInt);
		
		System.out.println("============== \n ");		
		
		//Operador incremento/decremento pr� e p�s fixado
		int varInt2 = 1;
		int varInt3 = 2;
		
		varInt3 = varInt3 + varInt2--;
		System.out.println("Result 3 => " + varInt3--);
		System.out.println("Result 2 => " + varInt3);		
		System.out.println("Result 0 => " + varInt2);
		
		//Operador de Invers�o: Soma 1 e inverte o sinal

		//L�gica: Um positivo mais 1 = 2, troca de sinal pela invers�o		
		int intInversao = ~1;
		System.out.println("Result -2 => " + intInversao);		
		
		//L�gica: Dois negativo mais 1 = -1, troca de sinal pela invers�o
		intInversao = ~intInversao;
		System.out.println("Result 1 => " + intInversao);
		
		//L�gica: Tr�s mais 1 = 4, troca de sinal pela invers�o
		intInversao = ~3;
		System.out.println("Result -4 => " + intInversao);		
		
		//L�gica: Tr�s negativo mais 1 = -2, troca sinal pela invers�o
		intInversao = ~-3;
		System.out.println("Result 2 => " + intInversao);
		
		//Resto da divis�o, retorna 1 se tiver sobra na divis�o
		int intRestoDivisao = 0;
		
		intRestoDivisao = 14 % 2;
		System.out.println("Resto Divis�o = 0 => " + intRestoDivisao);
		
		intRestoDivisao = 15 % 2;
		System.out.println("Resto Divis�o = 1 => " + intRestoDivisao);
		
		intRestoDivisao = 137 % 2;
		System.out.println("Resto Divis�o = 1 => " + intRestoDivisao);
		
		if (15 % 3 <= 0)
			System.out.println("Resto Divis�o ZERO");
		else
			System.out.println("Resto Divis�o 1");			
		
		objPackage = null;
		
		System.gc();
		System.exit(0);

	}
}