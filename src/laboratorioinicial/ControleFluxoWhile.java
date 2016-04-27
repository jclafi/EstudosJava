package laboratorioinicial;

/**
 * Classe com o objetivo de praticar a utiliza��o de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoWhile {
  /**
   * M�todo para que esta classe possa ser executada com o utilit�rio java.
   * 
   * @param args
   *          - argumentos para o m�todo main
   */
  public static void main(String[] args) {
	  
	  char varChar = 'E';
	  
	  do {
		  //Incrementa o char de E a Z
		  ++varChar;
		  
		  //Imprime
		  System.out.println(varChar);
		  
	  } while (varChar != 'Z'); 
	  
  }
}
