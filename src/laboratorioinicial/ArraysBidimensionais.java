package laboratorioinicial;

/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ArraysBidimensionais {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String args[]) {
	int array[][] = new int[][] { { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4, 5 } };
	
	//Enhanced for com array bi dimensional	
	for (int[] index : array) {
		
		//For normal
		for (int index2 = 0; index2 < index.length; index2++) {
			System.out.println("Valor SubArray: " + index[index2]);
		}
		
		//Enhanced for dentro de Enhanced for
		for (int index3 : index) {
			System.out.println("Valor SubArray: " + index3);			
		}
	}
  }
}
