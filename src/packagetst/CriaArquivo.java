package packagetst;

import java.io.File;
import java.io.IOException;

public class CriaArquivo {
	
	//Cria um m�todo sem retorno, que caso tenha uma exce��o propaga a mesma para quem chamou o m�todo.	
	public boolean criarArquivoTexto(String varName) throws IOException {
		File varFile = new File(varName);
		return varFile.createNewFile();		
	}	
}