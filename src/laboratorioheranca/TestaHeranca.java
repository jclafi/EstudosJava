package laboratorioheranca;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Esta classe e responsavel pelo teste das Herancas desenvolvidas nas classes 
 *  Conta e ContaEspecial
 * 
 * Altere o metodo main fazendo com que sejam criadas 02 contas especiais e 01 conta poupanca. 
 * Realize 1 saque na 1a. conta especial cujo valor exceda o saldo mas nao ultrapasse o limite.
 * Realize 1 saque na 2a. conta especial cujo valor ultrapasse o saldo e o limite.
 * Realize 1 saque na conta poupanca que exceda o saldo.
 * Imprima os dados das contas para conferir se estao corretas.
 * 
 * Dica: Para obter a data do sistema e transformar em String: 
 *  String strData = new java.util.Date().toString();
 * 
 */

import java.util.Date;

public class TestaHeranca {

    public static void main(String args[]) {

    	//Dados iniciais Banco e Agencia
    	Banco banco = new Banco("Globalcode Bank", 1000);
        Agencia ag1 = new Agencia("001", banco);
        
        //Cliente das Contas
        Cliente cliente1 = new Cliente("Cliente 1", "1232323");
        
        // Conta comum
        Conta conta = new Conta(500, "741852", cliente1, ag1); 
        conta.saque(560);
        conta.imprimeDados();
        System.out.println();
                    
        // 1a. conta especial - saque na 1a. conta especial cujo valor exceda o saldo mas nao ultrapasse o limite.
        ContaEspecial contaEsp1 = new ContaEspecial(10000, 7500, "5555", cliente1, ag1);
        contaEsp1.saque(9000);
        
        // 2a. conta especial - saque na 2a. conta especial cujo valor ultrapasse o saldo e o limite.
        ContaEspecial contaEsp2 = new ContaEspecial(10000, 7500, "5555", cliente1, ag1);
        contaEsp2.saque(11000);        
        
        // Conta poupanca
        Date data = new Date();
        ContaPoupanca contaPoup = new ContaPoupanca(data.toString(), 10000, "555", cliente1, ag1);
        contaPoup.saque(110000);
        
        contaEsp1.imprimeDados();
        contaEsp2.imprimeDados();        
        contaPoup.imprimeDados();
    }
}

