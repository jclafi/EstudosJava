package classesBasicas;

public class DeclaracaoVariaveis {

	public static void main(String[] args) {
		//Person Name
		String personName = "Julio Cesar";
		//Person age
		int personAge = 35;
		//Person Register
		String personRg = "5.589.555-7";
		//Person Sex
		char personSex = 'M';
		//Person Salary
		double personSalary = 4600;
		
		System.out.println("Senhor: " + personName + 
						   ", de idade: " + personAge + 
						   " anos, portador RG n�mero: " + personRg + 
						   " de Sexo: " + personSex + 
						   "De Sal�rio: " + personSalary + "\n \n \n");
		
		String nome = "Carolina Pereira";
		int idade = 36;
		String rg = "34.654.789-9";		
		double salario = 1500.0;		
		double aliquota = 0.20;
		int anoNascimento = 1980;
		String sexoPorExtenso = "Masculino";
		double impostoDevido = (aliquota * salario);
		System.out.print("O(a) Senhor(a) " + nome + ", nascido(a) no ano de ");
		System.out.println(anoNascimento + ", portador(a) do RG de n�mero " + rg);
		System.out.print(", do sexo " + sexoPorExtenso + ", Idade = " + idade);
		System.out.print(", est� registrado(a) com o sal�rio de R$ " + salario);
		System.out.println(" e pagar� R$ " + impostoDevido + " de imposto.");
		
		System.exit(0);
	}

}