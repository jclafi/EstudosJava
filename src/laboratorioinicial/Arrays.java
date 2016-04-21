package laboratorioinicial;

/**
 * Classe com o objetivo de praticar arrays de tipos primitivos e reference.
 * 
 * @author Melissa
 */
class Arrays {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String args[]) {
	String array[] = new String[5];
	
	//Popula o Array
	for (int index = 0; index < array.length; index++)
		array[index] = "Cliente " + (index +1) + " email: cliente" + (index +1) + "@cliente.com.br" ;
	
	//Percorre o Array
	for (String index : array)
		System.out.println(index);
	
	System.exit(0);
  }
}
