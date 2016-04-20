package classesBasicas;

public class ClasseOperador2 {
	public static void main(String[] args) {
		//Operadores de atribuição - x = x + 1 - | Igual = | Igual Incrementa += | Igual Decrementa -= | Igual Multiplica *= | Igual Divide /= | Resto da Divisão %= |
		
		//Igual
		int intTeste = 1;
		System.out.println("Result = 1 => " + intTeste);		
		
		//Igual Incrementa
		intTeste += 3;
		System.out.println("Result = 4 => " + intTeste);
		
		//Igual Decrementa
		intTeste -= 1;
		System.out.println("Result = 3 => " + intTeste);
		
		//Igual Multiplica
		intTeste *= 2;
		System.out.println("Result = 6 => " + intTeste);
		
		//Igual Divide
		intTeste /= 2;
		System.out.println("Result = 3 => " + intTeste);
		
		//Resto da Divisão de 3 por 2;
		intTeste %= 2;
		System.out.println("Result = 1 => " + intTeste);
		
		//Operador de Deslocamento somente para números Inteiros
		//A cada deslocamento >> número é dividido por 2
		intTeste = 128;
		intTeste = intTeste >> 1;
		System.out.println("Deslocamento Divisão 128 >> 1 = 64 => " + intTeste); // 128 / 2 = 64
		
		intTeste = intTeste >> 2;
		System.out.println("Deslocamento Divisão 64 >> 2 = 16 => " + intTeste); // 64 / 2 = 32, 32 / 2 = 16		

		intTeste = intTeste >> 1;
		System.out.println("Deslocamento Divisão 16 >> 1 = 8 => " + intTeste); //16 / 2 = 8
		
		//A cada deslocamento << número é multiplicado por 2
		intTeste = 8;
		intTeste = intTeste << 1;
		System.out.println("Deslocamento Multiplicação 8 << 1 = 16 => " + intTeste); // 8 x 2 = 16;
		
		intTeste = intTeste << 2;
		System.out.println("Deslocamento Multiplicação 16 << 2 = 64 => " + intTeste); // 16 x 2 = 32, 32 x 2 = 64		
		
		//Comparação Tipos Primitivos - | Menor que < | Maior Que > | Menor Igual <= | Maior Igual >= | Igual == | Diferente != |
		int intComparacao = 0;
		String strTeste = "TESTE"; //String não é um tipo primitivo, é uma Classe
		boolean bolComparacao = true;
		System.out.println(bolComparacao);
		bolComparacao = intComparacao >= 1;
		System.out.println(bolComparacao);		
		
		//Operador de Comparação de Tipos de Dados - instanceof - Tem que ser Classe, não pode ser tipo primitrivo(Numéricos, Caracteres, Booleanos)
		if (strTeste instanceof String)
		  System.out.println("String");
		else
          System.out.println("Não String");
		
	    //Operador AND && e OR ||
		intComparacao = 4;
		boolean bol_AND_OR = (intComparacao >= 5);
		if ((bol_AND_OR) && (intComparacao >=4))  
		{
          System.out.println("true");		  
		  System.out.println("true double check");
		}
		else
		{
	      System.out.println("false");
	      System.out.println("false double check");	      
		}
		
		if ((bol_AND_OR) || (intComparacao == 4)) 
		  System.out.println("true 2");			
		else
		  System.out.println("false 2");
		
	    //Operador Ternário - | ?
		int intTern1;
		int intTern2 = 3;
		int intTern3 = 4;
		
		intTern1 = (intTern2 > intTern3) ? intTern2 : intTern3;
		System.out.println("Result = 4 => " + intTern1);		
		
		intTern1 = ((intTern2 < intTern3) ? intTern2 : intTern3);
		System.out.println("Result = 3 => " + intTern1);
		
		String mensagem = "O valor mais alto é: ";
		mensagem += (intTern2 > intTern3 ? ("intTern2: " + intTern2) : ("intTern3: " + intTern3));
		System.out.println(mensagem);
		
		//Atribuição com Operador Ternário
		boolean c = false;
		String str = ( (c =!c) ? ((c = !c) ? "HELLO" : "hello") : ((c) ? "PRINT" : "print") );
		System.out.println("Valor: " + str);		
		
	}
}
