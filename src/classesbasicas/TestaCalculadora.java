package classesbasicas;

public class TestaCalculadora {

	public static void main(String[] args) {
		Calculadora objCalculadora = new Calculadora();
		try {
			objCalculadora.booTesteAtributo = true;
			String[] strTeste = {"TESTE DE CALCULADORA ARRAY"};
			objCalculadora.imprimeValor(strTeste);
		
			String[] strTeste2 = new String[6];
			for (int index = 0; index < strTeste2.length; index++) {
				strTeste2[index] = "Teste Array Pos => " + index;			
			}
			objCalculadora.imprimeValor(strTeste2);		
		
			int intResultado = objCalculadora.metodoSoma(10, 20);
			System.out.println("Resultado: 10 + 20 => " + intResultado);
		
			double doubleResultado = objCalculadora.metodoMultiplica(10, 10);
			System.out.println("Resultado 10 * 10 => " + doubleResultado);
		
			System.out.println("Resultado 10 maior que 30 => " + objCalculadora.metodoVerificaValorMaior(10, 30));		
			System.out.println("Resultado 30 maior que 10 => " + objCalculadora.metodoVerificaValorMaior(30, 10));
		
			objCalculadora.imprimeValor2("TESTE 1", "TESTE2");
		
		}
		finally {
			//Define o objeto como nulo e o GC chama o finalize
			objCalculadora = null;
		}
		
		System.gc();
		System.exit(0);		
	}

	public void finalize () {		
		System.out.print("Destruindo Objetos");
	}
}
