package classesBasicas;
public class SuperClasse {	
	private int valorTeste;
	
	//Bloco de Inicialização
	{
		valorTeste++;
		System.out.println("Super Classe Bloco Inicialização: " + valorTeste);
	}
	//Polimorfismo Overload	
	public SuperClasse (int varTeste) {
		System.out.println("Construtor Super Classe - Valor: " + varTeste);
	}	
	
	//Polimorfismo Overload
	public SuperClasse (String varTeste) {
		System.out.println("Construtor Super Classe - Valor: " + varTeste);
	}
	public void setValorTeste(int varTeste) { valorTeste = varTeste; }
	public int getValorTeste() { return valorTeste; }	
	
	public double somaValores(double varNum1, double varNum2) {
		return (varNum1 + varNum2);
	}
	
	protected void metodoTesteProtected() {
		System.out.println("Uso SuperClasse");
	}
	
	public void finalize() {
		System.out.println("Finalize");		
	}
}
