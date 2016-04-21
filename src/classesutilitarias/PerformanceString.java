package classesutilitarias;

public class PerformanceString {

	public static void main(String[] args) {
		//Teste String
		long time_start = System.currentTimeMillis();
		System.out.println("Início String:");		
		concatenaString(5000000);
		long time_end = System.currentTimeMillis();
		System.out.println("Fim String: " + (time_end - time_start) + "ms");		
		
		//Teste Buffer
		time_start = System.currentTimeMillis();
		System.out.println("Início Buffer");		
		concatenaBuffer(5000000);
		time_end = System.currentTimeMillis();
		System.out.println("Fim Buffer: " + (time_end - time_start) + "ms");		

		//Teste Builder	
		time_start = System.currentTimeMillis();
		System.out.println("Início Builder");
		concatenaBuilder(5000000);
		time_end = System.currentTimeMillis();
		System.out.println("Fim Buffer: " + (time_end - time_start) + "ms");
		
		System.gc();
		System.exit(0);
	}
	
	private static void concatenaString(int quantidade) {
		String s = "";
		
		for (int index = 0; index < quantidade; index++) 
			s = s + index + "\n";
		
		System.out.println("String: " + s);
	}
	
	private static void concatenaBuffer(int quantidade) {
		StringBuffer s = new StringBuffer("");
		
		for (int index =0; index < quantidade; index++)
			s = s.append(index);
		
		System.out.println("Buffer: " + s);		
	}	

	private static void concatenaBuilder(int quantidade) {
		StringBuilder s = new StringBuilder("");
		for (int index = 0; index < quantidade; index++)
			s = s.append(index);
		
		System.out.println("Buffer: " + s);
	}
}
