package classesbasicas;

public class ControleArray {

	public static void main(String[] args) {
		//Pode-se criar o array como - int array[] ou int[] array;
				
		//Op��es de cria��o array
		//int arrayVar[] = new int[2];
		//int[] arrayVar = new int[2];
		//O uso da palavra reservada new em um array for�a a inicializa��o de valores nas posi��es de acordo com o tipo de dados usado.		
		
		//Array de inteiro de duas posi��es 
		int arrayVar[] = new int[2];
		arrayVar[0] = 1; 
		arrayVar[1] = 2;
		System.out.println("Posi��o 1 = " + arrayVar[0] + "\nPosi��o 2 = " + arrayVar[1]);
		arrayVar = null;
		
		//Declarar e inicializar o Array em uma �nica instru��o. Array de duas posi��es com valores j� iniciados no create 
		int arrayVar2[] = {4, 8};
		System.out.println("Posi��o 1 = " + arrayVar2[0] + "\nPosi��o 2 = " + arrayVar2[1]);
		
		//Percorrer array usando a propriedade length
		for (int intIndex = 0; intIndex < arrayVar2.length; intIndex++)
		{
			System.out.println("Posi��o Valor = " + arrayVar2[intIndex]);			
		}
		
		//Testes de Array
		float arrayFloat[] = {1F, 1.5F};
		for (int index = 0; index < arrayFloat.length; index++)
		{
			System.out.println(arrayFloat[index]);
		}
		
		//Testes Array 2
		
		//N�mero caracteres alfabeto
		int numeroCaracteres = 26;
		//Letra A ASCII
		int ascCaractereA = 65;
		//Array de Char com 26 posi��es
		char arrayChar[] = new char[numeroCaracteres];
		//Inicializar o array de Char com valores do alfabeto
		for (int index = 0; index < numeroCaracteres; index++)
		{		
			arrayChar[index] = (char) (ascCaractereA + index);  
		}		
		//Mostrar o alfabeto ne tela
		System.out.println(arrayChar);
		
		//Op��es de cria��o Arrays Bidimensionais
		//O uso da palavra reservada new em um array for�a a inicializa��o de valores nas posi��es de acordo com o tipo de dados usado.
		// int[] arrayBi[] = new int[2] [3];
		// int[][] arrayBi = new int[2] [3];
		// int arrayBi[][] = new int[2] [3];
		
		//Cria��o de arrays bidimensionais com posi��es definidas e j� inicializadas
		// int[] array[] = { {1, 2}, {3, 4}, {5, 6} };		
		
		//Duas colunas com tr�s posi��es cada
		int[][] arrayBi = new int[2][3];
		arrayBi[0][0] = (int) 1;
		arrayBi[0][1] = (int) 2;
		arrayBi[0][2] = (int) 3;		
		arrayBi[1][0] = (int) 4;
		arrayBi[1][1] = (int) 5;		
		arrayBi[1][2] = (int) 6;		
		
		//Acessa as posi��es do array Bidimensional
		for (int index = 0; index < arrayBi.length; index++)
		{
			for (int index2 = 0; index2 < arrayBi[index].length; index2++)
			{
				System.out.println("Array Bi = " + arrayBi[index][index2]);
			}			
		}
		
		//Defini��o din�mica de Array Bidimensional
		int[] arrayBi2[] = new int[2][];
		
		//Agora define as posi��es din�micamente do array
		arrayBi2[0] = new int[3];
		arrayBi2[1] = new int[] {1, 2, 3};
		
		//Percorre as posi��es definidas din�micamente
		for (int index = 0; index < arrayBi2.length; index++)
		{
			for (int index2 = 0; index2 < arrayBi2[index].length; index2++)
			{
				if (arrayBi2[index][index2] > 0)
					System.out.println("Array Bidimensional = " + arrayBi2[index][index2]);
			}
		}
		
		//Arrays multi dimensionais - Carga		
		int [][][] charArray = new int [2][2][2];
		for (int index1 = 0; index1 < charArray.length; index1++)
		{
			for (int index2 = 0; index2 < charArray[index1].length; index2++)
			{
				for (int index3 = 0; index3 < charArray[index1][index2].length; index3++)
					charArray[index1][index2][index3] = (index1+index2+index3);
			}
		}
			
		for (int index1 = 0; index1 < charArray.length; index1++)
		{
			for (int index2 = 0; index2 < charArray[index1].length; index2++)
			{
				for (int index3 = 0; index3 < charArray[index1][index2].length; index3++)
					System.out.println("Multidimensional = " + charArray[index1][index2][index3]);
			}
		}			
		
		//Enhanced For - For Each Loop - A partir da vers�o 1.5 da JavaSE
		//Maneira simplificada para percorrer loop�s
		int arrayFEL[] = {91, 92 ,93 ,94};
		for (int valor : arrayFEL)
		{
			System.out.println("ForEachLoop => " + valor);
		}
		
		//Array bidimensional com 3 posi��es iniciais e as restantes diferentes
		int[][] intTeste = { {1, 2, 3}, {1, 2}, {1} };
		int count;
		for (int index = 0; index < intTeste.length; index++) {
			count = 0;
			for (int index2 = 0; index2 < intTeste[index].length; index2++) {
				++count;
				System.out.println("Posi��o Nr: " + index + " - SubPosi��o Nr: " + index2 + " - Valor:" + intTeste[index][index2]);
			}
			System.out.println(" Total Sub Posi��es: " + count);
		}		
	
		System.gc();
		System.exit(0);	
		
	}				
}
