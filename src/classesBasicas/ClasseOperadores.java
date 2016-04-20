package classesBasicas;

import packageTst.ClassePackage;

public class ClasseOperadores {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ClassePackage objPackage = new ClassePackage();
		
		System.out.println("Data e Hora: " + objPackage.getDateTime());
		
		//Operadores de Negação
		boolean booVar = true;		
		System.out.println(booVar);

		//Teste de Negação
		boolean booVar2 = !booVar;		
		System.out.println(booVar2);
		
		//Operador incremento/decremento pré e pós fixado
		int varInt = 0;
		System.out.println("Result 1 => " + ++varInt);
		varInt = 0;
		System.out.println("Result 0 => " + varInt++);		
		System.out.println("Result 1 => " + varInt);
		
		System.out.println("============== \n ");		
		
		//Operador incremento/decremento pré e pós fixado
		int varInt2 = 1;
		int varInt3 = 2;
		
		varInt3 = varInt3 + varInt2--;
		System.out.println("Result 3 => " + varInt3--);
		System.out.println("Result 2 => " + varInt3);		
		System.out.println("Result 0 => " + varInt2);
		
		//Operador de Inversão: Soma 1 e inverte o sinal

		//Lógica: Um positivo mais 1 = 2, troca de sinal pela inversão		
		int intInversao = ~1;
		System.out.println("Result -2 => " + intInversao);		
		
		//Lógica: Dois negativo mais 1 = -1, troca de sinal pela inversão
		intInversao = ~intInversao;
		System.out.println("Result 1 => " + intInversao);
		
		//Lógica: Três mais 1 = 4, troca de sinal pela inversão
		intInversao = ~3;
		System.out.println("Result -4 => " + intInversao);		
		
		//Lógica: Três negativo mais 1 = -2, troca sinal pela inversão
		intInversao = ~-3;
		System.out.println("Result 2 => " + intInversao);
		
		//Resto da divisão, retorna 1 se tiver sobra na divisão
		int intRestoDivisao = 0;
		
		intRestoDivisao = 14 % 2;
		System.out.println("Resto Divisão = 0 => " + intRestoDivisao);
		
		intRestoDivisao = 15 % 2;
		System.out.println("Resto Divisão = 1 => " + intRestoDivisao);
		
		intRestoDivisao = 137 % 2;
		System.out.println("Resto Divisão = 1 => " + intRestoDivisao);
		
		if (15 % 3 <= 0)
			System.out.println("Resto Divisão ZERO");
		else
			System.out.println("Resto Divisão 1");			
		
		objPackage = null;
		
		System.gc();
		System.exit(0);

	}
}