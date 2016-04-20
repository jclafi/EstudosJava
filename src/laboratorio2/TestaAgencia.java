package laboratorio2;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */

import laboratorio2.Agencia;

class TestaAgencia {

    public static void main(String[] args) {
    	
    	// Inicializar um objeto do tipo Agencia
    	Agencia objAgencia = new Agencia();
    	try {

            // Usar o metodo inicializaAgencia (ver quais sao os parametros na classe Agencia)
            objAgencia.inicializaAgencia("555", 5);
    		
    		// Imprimir os dados da agencia
            objAgencia.imprimeDados();
    		
    	}
    	catch (Exception ex) {
    		System.out.println("Erro: " + ex.getMessage());
    		ex.printStackTrace();
    	}
    	finally {
    		if (objAgencia != null)
    			objAgencia = null;
    	}    	
    }
}
