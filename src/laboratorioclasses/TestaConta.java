package laboratorioclasses;

import laboratorioclasses.Conta;

class TestaConta {

    public static void main(String[] args) {
        
    	// Criar um objeto do tipo Conta
    	Conta objConta = new Conta();
    	try {
    		// Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
    		objConta.inicializaConta(5000, "555", "Julio Cesar", 5, 5);
    		
    		// Executar um deposito
    		objConta.deposito(1000);
    		
    		// Imprimir o saldo apos o deposito
    		objConta.imprimeDados();
    		
    		// Executar um saque cujo valor seja menor que o saldo
    		objConta.saque(500);
    		
    		// Imprimir o saldo apos o saque
    		objConta.imprimeDados();
    		
    		// Executar uma retirada cujo valor seja maior que o saldo
    		objConta.saque(8000);

    		// Imprimir o saldo apos o saque
    		objConta.imprimeDados();
    	}
    	catch (Exception ex) {
    		System.out.println("Erro: " + ex.getMessage());
    		ex.printStackTrace();
    	}
    	finally {
    		if (objConta != null)
    			objConta = null;
    	}
    	
    	System.exit(0);
    }
}
