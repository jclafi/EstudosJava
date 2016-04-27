package laboratorioinicial;

/**
 * Classe com o objetivo de praticar a utiliza��o de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoWhileOpcional {
  /**
   * M�todo para que esta classe possa ser executada com o utilit�rio java.
   * 
   * @param args
   *          - argumentos para o m�todo main
   */
  public static void main(String[] args) {
    int limiteInferior = 14;
	int limiteSuperior = 1578;
	int numerosDiv6 = 0;
	int index = limiteInferior;
	String texto = "Quantidade de numeros divisiveis por 6 entre ";
	
	while (index <= limiteSuperior) {
		
		//M�ltiplos de 6
		if ((index %6) == 0)
			++numerosDiv6;
		
		index++;
	}
	
	System.out.println(texto + limiteInferior + " e " + limiteSuperior	+ " � : " + numerosDiv6);
	
	
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
