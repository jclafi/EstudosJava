package classesUtilitarias;

public class TesteWrapper {

	public static void main(String[] args) {
		//Exemplo Boolean
		System.out.println("Exemplo Boolean");
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		Boolean b3 = new Boolean("XXXX");		
		System.out.println("b1 = true = " + b1.booleanValue());
		System.out.println("b2 = true = " + b2.booleanValue());
		System.out.println("b3 = false = " + b3.booleanValue());
		System.out.println("==================");		
		
		//Exemplo de Integer
		System.out.println("Exemplo Integer");
		Integer i1 = new Integer(1);
		Integer i2 = new Integer("12");
		System.out.println("i1 = 1 = " + i1.intValue());
		System.out.println("i2 = 12 = " + i2.intValue());		
		System.out.println("==================");
		
		//Exemplo de Double
		System.out.println("Exemplo Double");
		Double d1 = new Double(15.5);
		Double d2 = new Double("15.9");
		System.out.println("d1 = 15.5 = " + d1.doubleValue());
		System.out.println("d2 = 15.9 = " + d2.doubleValue());				
		System.out.println("cast Integer d2 = 15.9 = " + d2.intValue());		
		System.out.println("cast String d2 = 15.9 = " + d2.toString());		
		System.out.println("==================");
		
		//Exemplo Character
		System.out.println("Exemplo Character");
		Character c1 = new Character('1');
		System.out.println("char c1 = 1 = " + c1.charValue());		
		System.out.println("char c1 = é digito ? = " + Character.isDigit(c1.charValue()));		
		System.out.println("==================");
		
		//Exemplo String
		System.out.println("Exemplo Character");
		String varSTR1 = "1";
		String varSTR2 = "1";
		String varSTR3 = new String("1");
		//Será igual ! Comparação de duas String normais
		boolean varBOO = (varSTR1 == varSTR2 ? true : false);
		System.out.println("varSTR1 == varSTR2? = " + varBOO);
		
		//Será diferente ! Comparação e String normal com Wrapper
		varBOO = (varSTR1 == varSTR3 ? true : false);		
		System.out.println("varSTR1 == varSTR3? = " + varBOO);		
		
		//Comparação correta de String com Wrapper
		varBOO = (varSTR3.equals(varSTR1) ? true : false);		
		System.out.println("varSTR1 == varSTR3? = " + varBOO);		
		System.out.println("==================");
		
		//Métodos String
		String varTESTE = new String("TESTE");
		//Retorna o caractere na posição - 0
		System.out.println("Caractere na primeira posição: " + varTESTE.charAt(0));
		//Concatea na string com outra, mas não altera a original
		System.out.println("Concatena: " + varTESTE.concat(" + TESTE"));
		//Compara a String original com a passada em parâmetro com equals, retorna booleano
		System.out.println("Equals: "+ varTESTE.equals("TESTE"));
		//String com equals
		String strString = "STRING";
		if (strString.equals("STRING")) 
			System.out.println("Igual");
		else
			System.out.println("Diferente");
			
		//Compara a String original com a passada em parâmetro, retorna booleano ignoe case
		System.out.println("Equals ignore case: " + varTESTE.equalsIgnoreCase("TESTE"));		
		//Retorna a primeira posição de um Char na String
		System.out.println("Primeira Posição na String: " + varTESTE.indexOf('T'));
		//Retorna a última posição de um Char na String
		System.out.println("Última Posição na String: " + varTESTE.lastIndexOf('T'));		
		//Retorna o total de caracteres da String
		System.out.println("Total de Posições: " + varTESTE.length());
		//Troca determinado caracetere por outro mas não altera a string original
		System.out.println("Troca caractere = T por S: " + varTESTE.replace('T', 'S'));
		//Retorna um booleano se a String começa com a string do parâmetro
		System.out.println("String começa com TES: " + varTESTE.startsWith("TES"));
		//Retorna um booleano se a String termina com a string do parâmetro
		System.out.println("Terminar com a String TE: " + varTESTE.endsWith("TE"));		
		//Retorna a string em minúsculo sem alterar a original
		System.out.println("Minúsculo: " + varTESTE.toLowerCase());		
		//Retorna a string em minúsculo sem alterar a original
		System.out.println("Maiúsculo: " + varTESTE.toUpperCase());
		//Usando método compareto, retorna 0 para igual
		System.out.println("Comparando TESTE a TESTE: " + varTESTE.compareTo("TESTE"));
		
		//Percorrendo a String e joga na tela seus caracteres
		for (int index = 0; index < varTESTE.length(); index++) {
			System.out.println(varTESTE.charAt(index));		
		}
		
		System.gc();
		System.exit(0);
	}

}
