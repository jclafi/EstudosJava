package laboratorioinicial;

/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoWhile {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
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
