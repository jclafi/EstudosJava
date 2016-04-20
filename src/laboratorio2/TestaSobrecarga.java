package laboratorio2;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Execute esta classe para testar a sobrecarga do metodo inicializaConta da classe
 * Conta 
 *
 */

import laboratorio2.Conta;

class TestaSobrecarga {

    public static void main(String[] args) {
        // 1. Instanciar uma Conta c1
        // 2. Chame o metodo inicializaConta informando o saldo
        // 3. Imprima os dados da Conta, usando o metodo imprimeDados
        // 4. Instanciar uma Conta c2
        // 5. Chame o metodo inicializaConta informando sem informar o saldo
        // 6. Imprima os dados da Conta c2, usando o metodo imprimeDados
    	
    	Conta objConta = new Conta();
    	try {
    		
    		objConta.inicializaConta(5000, "555", "Julio Ledo", 5, 55);
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
    	

    	Conta objConta2 = new Conta();
    	try {
    		
    	}
    	catch (Exception ex) {
    		System.out.println("Erro: " + ex.getMessage());
    		ex.printStackTrace();
    	}
    	finally {
    		if (objConta2 != null)
    			objConta2 = null;
    	}    	
    }
}
