package laboratorioinicial;

/**
 * Classe com o objetivo de praticar arrays de tipos primitivos e reference.
 * 
 * @author Melissa
 */
class ParametrosMain {
  /**
   * M�todo para que esta classe possa ser executada com o utilit�rio java.
   * 
   * @param args
   *          - argumentos para o m�todo main
   */
  public static void main(String[] args) {
	String nome = "";
	String dataNascimento = "";
	String rg = "";
	String salario = "";
	String sexo = "";
	String textNome = "O(a) Senhor(a) " + nome;
	String textNasc = ", nascido(a) em " + dataNascimento;
	String textRg = " portador(a)do rg de numero " + rg + ", \n";
	String textSexo = " do sexo " + sexo;
	String textTrabalho = ", est� registrado(a) com o sal�rio de R$ " + salario
	    + ".";
	System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho);
  }
}
