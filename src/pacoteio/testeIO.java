package pacoteio;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class testeIO {

	public static void main(String[] args) {
		//Cria o objeto que mainpula o arquivo
		File arquivo = new File("Java.txt");
		try {
			
			//Somente cria o arquivo se ele não existe
			if (! arquivo.exists()) {
				if (! arquivo.createNewFile()) { 
					System.out.println("Falha ao criar o arquivo");					
				}
			}
			else
			{
				if (arquivo.delete()) 
					if (! arquivo.createNewFile()) 
						System.out.println("Falha ao criar o arquivo");
			}

			//Se o arquivo existe ou foi criado abre e grava os dados
			if ((arquivo.isFile()) && (arquivo.canWrite())) {
				FileWriter dados = new FileWriter(arquivo);
				BufferedWriter escreve = new BufferedWriter(dados); 
				try {
					for (int index = 0; index < 200; index++) {
						escreve.write("Teste Gravação de ArquivoTXT: INDEX: " + index);
						escreve.write(System.getProperty( "line.separator" ));
						escreve.append("Teste Gravação de ArquivoTXT: INDEX: " + index);
						escreve.write(System.getProperty( "line.separator" ));
					}
					escreve.close();
				}
				finally {
					escreve = null;
					dados = null;
				}
			}
			
			if ((arquivo.isFile()) && (arquivo.canRead())) {

				FileReader dados = new FileReader(arquivo);
				BufferedReader leitura = new BufferedReader(dados);
				try {
					String line;
					while ((line = leitura.readLine()) != null) {
						line = leitura.readLine();
						System.out.println("Leitura de Arquivo: "+ line);
					}
					leitura.close();
				}
				finally {
					leitura = null;
					dados = null;					
				}
			}
		}
		catch (IOException ex) {
			System.out.println("Exceção I/O: " + ex.getMessage());
		}
		finally {
			if (arquivo != null)
				arquivo = null;
		}
		
		System.gc();
		System.exit(0);
	}
}
