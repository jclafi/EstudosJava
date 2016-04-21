package interfaceabstract;

public class implementaInterface implements InterfaceTeste {
	//Variável do tipo Enumerador
	TipoEnum varEnumerador;
	
	//Construtor
	public implementaInterface() {
		System.out.println("Construtor");		
	}
	
	//Get do Atributo
	@Override
	public TipoEnum getEnumerador() {
		return varEnumerador;
	}
	@Override
	public void setEnumerador(TipoEnum varEnum) {
		varEnumerador = varEnum;
	}
	
	@Override
	public void testeDeMetodo() {
		System.out.println("Método");
	}
	
	@Override
	public long testeInteiro() {
		return 15;
	}
	
	@Override
	public void finalize() {
		System.out.println("Finalize");
	}		
}
