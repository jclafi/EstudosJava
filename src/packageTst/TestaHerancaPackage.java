package packageTst;
public class TestaHerancaPackage {
	public static void main(String[] args) {
		
		//Captura exceções
		try
		{
			HerdaPackage objPackage = new HerdaPackage("Data e Hora : ");
			System.out.println(objPackage.getDate());

			//Gera uma exceção - divisão por Zero
			int varInt = 4 / 0;
			System.out.println("Erro " + varInt);
					
			System.gc();
			System.exit(0);			
		}
		
		//Captura a exceção e mostra mensagem de erro
		catch (Exception ex) {
			System.out.println("Erro " + ex.getMessage());			
		}			
	}
}
