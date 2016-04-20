package laboratorio1;

/**
 * Classe com o objetivo de praticar a utiliza��o de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoCondicional {
  /**
   * M�todo para que esta classe possa ser executada com o utilit�rio java.
   * 
   * @param args
   *          - argumentos para o m�todo main
   */
  public static void main(String[] args) {
	String nome = "Carolina Pereira";
	int idade = 20;
	String rg = "34.654.789-9";
	char sexo = 'F';
	double salario = 1500.0;
	int anoAtual = 2009;
	double aliquota = 0.20;
	int anoNascimento = anoAtual - idade;
	
	String sexoPorExtenso = (sexo == 'M') ? "masculino" : "feminino";
	
	if (sexo == 'M') 
		sexoPorExtenso = "Masculino";
	else
		sexoPorExtenso = "Feminino";
	
	switch (sexo) {
		case 'M' : System.out.println("O Senhor " + nome + ", nascido no ano de " + anoAtual); break;
		case 'F' : System.out.println("A Senhora " + nome + ", nascida no ano de " + anoAtual); break;
		default : System.out.println("O(a) Senhor(a) " + nome + ", nascido (a) no ano de " + anoAtual);
	}
	
	double impostoDevido = salario * aliquota;
	String textNome = "O(a) Senhor(a) " + nome;
	String textNasc = ", nascido(a) no ano de " + anoNascimento;
	String textRg = " portador(a)do rg de numero " + rg + ", \n";
	String textSexo = " do sexo " + sexoPorExtenso;
	String textTrabalho = ", est� registrado(a) com o sal�rio de R$ " + salario;
	String textImposto = " e pagar� R$ " + impostoDevido + " de imposto.";
	System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho
	    + textImposto);
  }
}
