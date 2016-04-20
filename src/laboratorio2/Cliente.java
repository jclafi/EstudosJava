package laboratorio2;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Encapsule os atributos da classe Cliente
 * 
 */
class Cliente {

    private String nome;
    private String cpf;
    
	void setNome(String nome) {
		this.nome = nome;
	}

	String getCpf() {
		return cpf;
	}

	void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
     * @param nomeCliente
     *            nome do cliente
     * @param cpfCliente
     *            cpf do cliente
     */
    public void inicializaCliente(String nomeCliente, String cpfCliente) {
        this.setCpf(cpfCliente);
        this.setNome(nomeCliente);
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome do cliente :" + this.getNome());
        System.out.println("CPF:" + this.getCpf());
        System.out.println("----------------------");
    }

	String getNome() {
		return nome;
	}

}
