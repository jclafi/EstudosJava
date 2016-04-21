package laboratorioinicial;

/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoWhileOpcional {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
    int limiteInferior = 14;
	int limiteSuperior = 1578;
	int numerosDiv6 = 0;
	int index = limiteInferior;
	String texto = "Quantidade de numeros divisiveis por 6 entre ";
	
	while (index <= limiteSuperior) {
		
		//Múltiplos de 6
		if ((index %6) == 0)
			++numerosDiv6;
		
		index++;
	}
	
	System.out.println(texto + limiteInferior + " e " + limiteSuperior	+ " é : " + numerosDiv6);
	
	
	int intTeste = 2;
	switch (intTeste) {
		case 0 : System.out.println("ZERO"); break;
		case 1 : System.out.println("1"); break;
		case 2 : System.out.println("DOIS"); break;
		default : System.out.println("DEFAULT");	
	}
	
	System.exit(0);
  }  
}
