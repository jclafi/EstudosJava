package laboratorioclasses;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Encapsule os atributos da classe Agencia = tornar os atributos privados e criar getters e setters
 * 
 */
class Agencia {

    private String numero;
    private int banco;

	String getNumero() {
		return numero;
	}

	void setNumero(String numero) {
		this.numero = numero;
	}

	int getBanco() {
		return banco;
	}

	void setBanco(int banco) {
		this.banco = banco;
	}
	
    /**
     * @param num
     *            Numero da agencia
     * @param bc
     *            banco ao qual a agencia pertence
     */
    public void inicializaAgencia(String num, int bc) {
        setNumero(num);
        setBanco(bc);
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    public void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Agencia no. " + getNumero());
        System.out.println("Banco no." + getBanco());
        System.out.println("----------------------");
    }
}
