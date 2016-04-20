package interfaceAbstract;

public interface InterfaceTeste {
	//Acessodo sem instância e não pode ser alterado - CONSTANTE - final por padrão
	public static int ATRIBUTO_ESTATICO = 99;	
	public enum TipoEnum {TESTE1, TESTE2};
	
	//Get do Atributo
	public TipoEnum getEnumerador();
	public void setEnumerador(TipoEnum varEnum);
	
	public void testeDeMetodo();
	public long testeInteiro();
	
	public void finalize();
}
