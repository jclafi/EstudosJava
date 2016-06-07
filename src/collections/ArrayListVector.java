package collections;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;

import classesbasicas.Pessoa;
import javax.swing.JOptionPane;

public class ArrayListVector {
	
	/*
	 *	List - Interface que define uma coleção indexada permitindo Objetos repetidos
	 *	Iterator - Interface utilizada para navegar entre os elementos da Lista
	 *	Array List - Implementação de List baseada em Array não sincronizada, não usar em multi-tarefa
	 *  Vector - Implementação de List legada baseada em Array sincronizada, utilizada em multi-tarefa
	 *    vem sendo substituído desde Java 5 por CopyOnWriteArrayList
	 */
	
	/*
	 * Collection Array List com generics Objeto Pessoa com 3 posições
	 */	
	private List<Pessoa> collectionList = new ArrayList<Pessoa>();
	private Vector<Pessoa> vectorList = new Vector<Pessoa>();
	private Pessoa objPessoa1;		
	private Pessoa objPessoa2;
	private Pessoa objPessoa3;	
	
	public void testeArrayList() {
			
		/* 
		 * Cria os Objetos das Pessoas e os insere na Lista
		 * Percorre a Lista usando For Each Loop
		 */
		Pessoa objPessoa1 = new Pessoa("123456", "Julio Cesar");		
		Pessoa objPessoa2 = new Pessoa("654321", "Julio Ledo");
		Pessoa objPessoa3 = new Pessoa("321654", "Julio Amaral");		
		for (int index = 0; index < 3; index++) {
			
			switch (index) {
			
				case 0 : collectionList.add(index, objPessoa1); break;
				case 1 : collectionList.add(index, objPessoa2); break;
				case 2 : collectionList.add(index, objPessoa3);
				default : System.out.println("Índice: " + index +  " - Total Posições: " + collectionList.size());

			}
			
		}
		
		/*
		 * Percorre e lista as pessoas
		 */
		for (Pessoa index : collectionList) {
			
			if (index != null)
				System.out.println("Objeto não Nulo - For Each Loop - " + index.toString() );
			else
				System.out.println("Objeto Nulo - For Each Loop");
		}

		/*
		 * Percorre o Array list for normal
		 */
		for (int index = 0; index < collectionList.size(); index++) {
			
			if (collectionList.get(index) != null) 
				System.out.println("Objeto não Nulo - For Normal - " + collectionList.get(index).toString());
			else
				System.out.println("Objeto Nulo - For Normal"); 			
		}
		
		/*
		 * Utiliza um Iterator para percorrer a lista
		 */
		Iterator<Pessoa> objIterator = collectionList.iterator();		
		while (objIterator.hasNext()) {
			
			System.out.print("Iterator" + objIterator.next().toString() + "\n");
			
		}
		
		/*
		 *  Remove um Item especificado pelo usuário da Lista 
		 */
		String indicePessoa = JOptionPane.showInputDialog("Digite o índice a ser removido!");
		boolean dadosOk = false;
		for (int index = 0; index < indicePessoa.length(); index++)
			dadosOk = Character.isDigit(indicePessoa.charAt(index));
		
		if (dadosOk) {
			
			if (collectionList.get(Integer.parseInt(indicePessoa)) != null) {
				
				Pessoa objTemp = (Pessoa) collectionList.remove(Integer.parseInt(indicePessoa));				
				JOptionPane.showMessageDialog(null,"Pessoa Removida:" + objTemp.toString());
				
			}
			else
				JOptionPane.showMessageDialog(null, "Atenção objeto não localizado");
			
		}		
		else
			JOptionPane.showMessageDialog(null, "Atenção o código deve possuir somente valores numéricos !");
		
		/*
		 * Utiliza uma Vector sincronizado para inserir e percorrer os Objetos
		 */
		for (int index = 0; index < 3; index++) {
			
			switch (index) {
			
				case 0 : vectorList.add(index, objPessoa1); break;
				case 1 : vectorList.add(index, objPessoa2); break;
				case 2 : vectorList.add(index, objPessoa3);
				default : System.out.println("Índice: " + index +  " - Total Posições: " + collectionList.size());;

			}
			
		}
		
		/*
		 * Lista o vector com Iterator
		 */
		Iterator<Pessoa> objIt = vectorList.iterator();
		while (objIt.hasNext()) {
			
			Pessoa objTemp = (Pessoa) objIt.next();			
			System.out.println("Pessoa: " + objTemp.toString());
			
		}
		
	}
	
	public void finalize() {
		
		if (collectionList != null) {
			collectionList.clear();
			collectionList = null;
		}
		
		if (objPessoa1 != null)
			objPessoa1 = null;
		if (objPessoa2 != null)
			objPessoa2 = null;
		if (objPessoa3 != null)
			objPessoa3 = null;		
	}
	
}