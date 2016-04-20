package packageTst;
public class TestaHerancaPackage {
	public static void main(String[] args) {
		
		//Captura exce��es
		try
		{
			HerdaPackage objPackage = new HerdaPackage("Data e Hora : ");
			System.out.println(objPackage.getDate());

			//Gera uma exce��o - divis�o por Zero
			int varInt = 4 / 0;
			System.out.println("Erro " + varInt);
					
			System.gc();
			System.exit(0);			
		}
		
		//Captura a exce��o e mostra mensagem de erro
		catch (Exception ex) {
			System.out.println("Erro " + ex.getMessage());			
		}			
	}
}
