package classesbasicas;

public class ListaInteiros {
	public int ID;
	public int [] inteiros;
	
	public ListaInteiros(int varID, int intNumero) {
		this.ID = varID;
		this.inteiros = new int[intNumero];
	}
	
	public void finalize() {
		inteiros = null;
		System.out.println("Removendo objeto: " + ID + " da Memória");	
	}	
}
