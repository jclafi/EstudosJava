package classesbasicas;
public class TesteHeranca {
	
	public static void main(String[] args) {
		ClasseHerda objHerda = new ClasseHerda();
		try {
			if (objHerda instanceof ClasseHerda) {
				objHerda.metodoTesteProtected();
				System.out.println("Soma 30.15 + 20.16: " + objHerda.somaValores(30.15, 20.16));
				System.out.println("Valor Louco: 30.15 + 20.16: " + objHerda.somaMultiplicaValor(30.15, 20.16));
				System.out.println("Multiplica Valor 30.15 + 20.16" + objHerda.multiplicaValor(30.15, 20.16));
			
				System.out.println(objHerda.getDateTime());
				int vllTeste = objHerda.getValorTeste();
				System.out.println(vllTeste);			
			}
		}
		finally { 
			objHerda= null;
		}
		
		System.gc();
		System.exit(0);
	}
}
