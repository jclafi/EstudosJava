package classesbasicas;

public class TesteListaInteiros {

	public static void main(String[] args) {
		ListaInteiros lista = new ListaInteiros(1, 100);
		ListaInteiros lista1 = new ListaInteiros(2, 100);
		
		for (int i = 0; i < lista.inteiros.length; i++ ) {
			System.out.println("Lista ID: " + lista.ID + " - Posição: " + i);			
		}
		
		for (int i = 0; i < lista1.inteiros.length; i++ ) {
			System.out.println("Lista ID: " + lista1.ID + " - Posição: " + i);			
		}
		lista = null;
		lista1 = null;
		
		System.gc();	
		System.exit(0);			
	}
}
