package laboratorio2;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */

import laboratorio2.Cliente;

class TestaCliente {

    public static void main(String[] args) {
        
    	// Criacao do cliente
    	Cliente objCliente = new Cliente();
    	try {
    		// Inicializacao do cliente usando o metodo inicializaCliente
            objCliente.inicializaCliente("Julio Cesar", "006.877.359-55");
            
            // Impressao dos dados do cliente
            objCliente.imprimeDados();    		
    	}
    	catch (Exception ex) {
    		System.out.println("Erro: " + ex.getMessage());
    		ex.printStackTrace();
    	}
    	finally {
    		if (objCliente != null)
    			objCliente = null;
    	}
    	
    	System.exit(0);
    	
    }
}
