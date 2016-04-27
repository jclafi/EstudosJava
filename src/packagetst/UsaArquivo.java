package packagetst;

public class UsaArquivo {

	public static void main(String[] args) {
		//Cria o arquivo TEXTO
		CriaArquivo objArquivo = new CriaArquivo();
		try {
			//Bloco de tratamento de exce��es
			try
			{
				//Teste assert
				boolean varTeste = true; 
				assert (varTeste != true) : "Teste assert";
				
				if (objArquivo.criarArquivoTexto("Java.txt"))
					System.out.println("Arquivo texto criado!");
				else
					System.out.println("Arquivo texto n�o criado!");
				
				//if (objArquivo.criarArquivoTexto("C:/Java.txt"))
				//	System.out.println("Arquivo texto criado!");
				//else
				//	System.out.println("Arquivo texto n�o criado!");				
			}
			
			//Captura qualquer exce��o via super classe
			catch (Exception e) {
				//Mensagem normal 		
				System.out.println("Erro ao Criar Arquivo: " + e.getMessage()); 
				//Mensagem detalhada
				e.printStackTrace();		
			}
			
			//Captura exce��es espec�ficas de IO
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
