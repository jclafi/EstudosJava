package packagetst;

import java.io.File;
import java.io.IOException;

public class CriaArquivo {
	
	//Cria um método sem retorno, que caso tenha uma exceção propaga a mesma para quem chamou o método.	
	public boolean criarArquivoTexto(String varName) throws IOException {
		File varFile = new File(varName);
		return varFile.createNewFile();		
	}	
}