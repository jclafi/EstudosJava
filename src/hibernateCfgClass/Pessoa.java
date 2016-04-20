package hibernateCfgClass;

class Pessoa {
	
	private long idGeral;	
	private String rg;
	private String nome;	
	private String mail;
	private String sobreNome;
	
	public String getMail() { return mail; }
	public void setMail(String varEmail) { mail = varEmail; }	
	
	public void setIdGeral (long varIDGeral) { idGeral = varIDGeral; }
	public long getIdGeral() { return idGeral; }
	
	public String getRg() { return rg; }
	public void setRg(String varRg) { rg = varRg; }	
	
	public String getNome() { return nome; }
	public void setNome(String varNome) { nome = varNome; }	
	
	public void setSobreNome(String sobreNome) { this.sobreNome = sobreNome; }
	public String getSobreNome() { return sobreNome; }
	
	public Pessoa() {
		
	}	
}
