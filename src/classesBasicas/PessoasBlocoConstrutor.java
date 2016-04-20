package classesBasicas;

public class PessoasBlocoConstrutor {
	
	private String rg;
	private String nome;
	private String sobreNome;
	private String dataNasc;
	private String[] telefones;
	private boolean temCarro;
	public static int EXPECTATIVA_VIDA = 72; 
	
	{
		//Primeiro executa o BLoco de Inicialização
		System.out.print("Teste Bloco Construtor e Garbage Colector \n");			
	}
	
	public PessoasBlocoConstrutor() {
		
		//Depois executa o Construtor, após o bloco de inicialização		
		System.out.print("Teste Construtor sem Parâmetros \n");		
	}
	
	public String getRg() {
	return rg;
	}
	public void setRg(String varRg) {
		rg = varRg;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String varNome) {
		nome = varNome;
	}
	
	//Exemplo de uso de THIS
	public String getSobreNome() {
		return this.sobreNome;		
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String varDataNasc) {
		dataNasc = varDataNasc;
	}
	
	public String[] getTelefone() {
		return telefones;
	}
	public void setTelefones(String[] varTelefones) {
		telefones = varTelefones;
	}
	
	public boolean isCarroDisponivel() {
		return temCarro;
	}
	public void setCarroDispopnivel(boolean varTemCarro) {
		temCarro = varTemCarro;
	}
	
	public void imprimeDadosPesssoa(int varNumero) {
		System.out.println(	"Nome: " + nome + "\n" +
							"Sobre Nome: " + sobreNome + "\n" +
							"Data Nasc: " + dataNasc + "\n" +
							"Tem Carro: " + temCarro + "\n" +
							"Telefones: " + telefones[0] + " - " + telefones[1] + "\n" +
							"Número: " + varNumero + "\n" +
							"Expectativa de Vida: " + EXPECTATIVA_VIDA + "\n"); 
	}
	
	public void imprimeDadosPesssoa() {
		System.out.println(	"Nome: " + nome + "\n" +
							"Sobre Nome: " + sobreNome + "\n" +
							"Data Nasc: " + dataNasc + "\n" +
							"Tem Carro: " + temCarro + "\n" +
							"Telefones: " + telefones[0] + " - " + telefones[1]);
	}
	
	public void finalize() {
		System.out.println("Limpando Objetos");
		telefones = null;
	}
}


