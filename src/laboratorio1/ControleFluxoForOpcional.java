package laboratorio1;

/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoForOpcional {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
	  
	  for (int index = 100; index <= 200; index ++) {
		  
		  //Divisível por 2 e 3
		  if ( ((index %2) == 0) && ((index %3) ==0) ) {
			  System.out.print(index + " é divisível por 2 e 3 \n ");
			  continue;  
		  }
		  
		  //Divisivel por 3
		  if ((index %3) == 0) {
			  System.out.print(index + " é divisível por 3 \n ");
			  continue;
		  }
		  
		  //Divisível por 2
		  if ((index %2) == 0) {
			  System.out.print(index + " é divisível por 2 \n ");
			  continue;
		  }
		  
		  System.out.println(index + " não é divisível por 2 e 3 \n ");	  
		  
	  }	  
  }
}
