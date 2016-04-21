package threadstst;

public class StringBuilderRunnable {
	
	private long totalLoop;
	private StringBuilder objTeste = new StringBuilder("");
	
	public long getTotalLoop() {
		return this.totalLoop;
	}
	private void setTotalLoop(long totalLoop) {
		this.totalLoop = totalLoop;
	}
	
	public StringBuilderRunnable(long totalLoop) {
		
		setTotalLoop(totalLoop);
		
	}
	
	public void executaStringBuilder(String varId) {
		
		for (long index = 0; index < getTotalLoop(); index++) {
			
			objTeste.append(index);
			System.out.println(index + " - " + varId);			
			
		}
		
		System.out.println("Término Processo. Total Posições:" + objTeste.length());
		
	}
	
	public void finalize() {
		if (objTeste != null)
			objTeste = null;
	}

}
