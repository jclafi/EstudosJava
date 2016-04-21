package classesbasicas;

class Calculadora {
	
	boolean booTesteAtributo;
	int[] arrayInt = {21, 22, 23};
	Pessoa[] objPessoas = new Pessoa[10];
	 
	//Método que soma dois valores int e retorna um int	
	int metodoSoma(int val1, int val2) {
		return (val1 + val2);		
	}
	
	double metodoMultiplica(double val1, double val2) {
		return (val1 * val2);
	}
	
	//Verifica se valor 1 é maior que valor 2
	boolean metodoVerificaValorMaior(int val1, int val2) {
		return ((val1 > val2) ? true : false);
	}
	
	//Imprime
	void imprimeValor(String[] texto)	{
		if (arrayInt != null) {
			for (int valor : arrayInt)
				System.out.print("Array Int:" + valor + "\n");
			arrayInt = null;
		}
		
		if ((objPessoas[0] != null) && (objPessoas[0] instanceof Pessoa))
			objPessoas = null;
		
		if (texto.length == 1)
			System.out.println(texto[0] + " - bolTESTE => " + booTesteAtributo);
		else {
		  	for (String valor : texto)
		  		System.out.println(valor);
		  	
		  	for (int index =0; index < texto.length; index++) {
		  		System.out.println("Teste 2 => " + texto[index]);
		  	}
		  	
		}
	}
	
	//Parâmetro Array usado VarArgs - (String... texto)
	void imprimeValor2(String... texto) {
		for (String valor : texto) {
			System.out.println("Teste Vargargs => " + valor);
		}
		
	}
	
	public void finalize () {		
		System.out.print("Destruindo Objetos");
	}
}
