package laboratorio1;

/**
 * Classe com o objetivo de praticar a utiliza��o de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoForOpcional {
  /**
   * M�todo para que esta classe possa ser executada com o utilit�rio java.
   * 
   * @param args
   *          - argumentos para o m�todo main
   */
  public static void main(String[] args) {
	  
	  for (int index = 100; index <= 200; index ++) {
		  
		  //Divis�vel por 2 e 3
		  if ( ((index %2) == 0) && ((index %3) ==0) ) {
			  System.out.print(index + " � divis�vel por 2 e 3 \n ");
			  continue;  
		  }
		  
		  //Divisivel por 3
		  if ((index %3) == 0) {
			  System.out.print(index + " � divis�vel por 3 \n ");
			  continue;
		  }
		  
		  //Divis�vel por 2
		  if ((index %2) == 0) {
			  System.out.print(index + " � divis�vel por 2 \n ");
			  continue;
		  }
		  
		  System.out.println(index + " n�o � divis�vel por 2 e 3 \n ");	  
		  
	  }	  
  }
}
