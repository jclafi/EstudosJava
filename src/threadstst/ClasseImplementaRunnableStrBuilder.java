package threadstst;

import threadstst.StringBuilderRunnable;

public class ClasseImplementaRunnableStrBuilder implements Runnable {
	
	private String iD;
	
	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}
	
	public ClasseImplementaRunnableStrBuilder(String varId) {
		
		setiD(varId);
		
	}	

	@Override
	public void run() {
		
		StringBuilderRunnable objBuilder = new StringBuilderRunnable(10000000);
		try {
			
			objBuilder.executaStringBuilder(getiD());
			
		}
		catch (Exception ex) {
			System.out.println("Erro ao Criar a Thread: " + ex.getMessage());
			ex.printStackTrace();
		}
		finally {
			if (objBuilder != null)
				objBuilder = null;
		}
		
	}


	

}
