package packagetst;

public class UsaArquivo {

	public static void main(String[] args) {
		//Cria o arquivo TEXTO
		CriaArquivo objArquivo = new CriaArquivo();
		try {
			//Bloco de tratamento de exceções
			try
			{
				//Teste assert
				boolean varTeste = true; 
				assert (varTeste != true) : "Teste assert";
				
				if (objArquivo.criarArquivoTexto("Java.txt"))
					System.out.println("Arquivo texto criado!");
				else
					System.out.println("Arquivo texto não criado!");
				
				//if (objArquivo.criarArquivoTexto("C:/Java.txt"))
				//	System.out.println("Arquivo texto criado!");
				//else
				//	System.out.println("Arquivo texto não criado!");				
			}
			
			//Captura qualquer exceção via super classe
			catch (Exception e) {
				//Mensagem normal 		
				System.out.println("Erro ao Criar Arquivo: " + e.getMessage()); 
				//Mensagem detalhada
				e.printStackTrace();		
			}
			
			//Captura exceções específicas de IO
			//catch (IOException e) {
			//	//Mensagem normal 		
			//	System.out.println("Erro ao Criar Arquivo: " + e.getMessage()); 
			//	//Mensagem detalhada
			//	e.printStackTrace();		
			//}
		}
		finally {
			objArquivo = null;
		}		
		System.gc();
		System.exit(0);		
	}
}
