package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import classesbasicas.Cliente;

public class TesteList {

	public static void main(String args[]) {
		
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
		Cliente c4 = new Cliente("Cliente4", "4444", "cpf4");
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);

		Iterator<Cliente> objLista = clientes.iterator();
		
		while (objLista.hasNext()) {
			
			Cliente objCliente = objLista.next();
			
			if (objCliente != null)
				System.out.println("Descrição: " + objCliente.getNome());
			
		}
		
		if (clientes != null)
			clientes = null;
	
		System.exit(0);
	}
}