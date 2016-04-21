package laboratorioheranca;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta 
 * 2) Adicione o atributo limite do tipo double e o encapsule 
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) 
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.
 *    Faca tambem com que este metodo acumule o CPMF devido.
 */

public class ContaEspecial extends Conta {
	
	private double limitesaque;

    public ContaEspecial(double limitesaque, double saldoInicial, String num, Cliente tit, Agencia ag) {
        super(saldoInicial, num, tit, ag);
        
        setLimiteSaque(limitesaque);
    }

    public ContaEspecial(double limite, String num, Cliente tit, Agencia ag) {
        super(num, tit, ag);
        
        setLimiteSaque(limite);
    }

	public double getLimiteSaque() {
		return limitesaque;
	}

	public void setLimiteSaque(double limite) {
		this.limitesaque = limite;
	}
	
	public void imprimeDados() { 
        System.out.println("======================================");
        getAgencia().imprimeDados();
        System.out.println("Numero da conta: " + getNumero());
        getTitular().imprimeDados();
        System.out.println("Saldo  : R$" + getSaldo());
        System.out.println("IFN devido: R$" + getIFNAcumulado());
        System.out.println("Limite : R$" + getLimiteSaque());
        System.out.println("========================================");        
	}
	
    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + getNumero());        
    	if (valor > getLimiteSaque()) {
    		System.out.println("Atenção o limite do Saque é de: R$" + getLimiteSaque());
    		return;
    	}
    	
    	if (valor > getSaldo()) {
    		System.out.println("Saldo Insuficiente para o Saque. Saldo Atual: R$" + getSaldo());
    		return;    		
    	}    		
    	
    	super.saque(valor);
    }    
    
	
}
