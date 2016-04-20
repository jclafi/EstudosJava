package packageTst;

public class HerdaPackage extends ClassePackage {
		
	public HerdaPackage(String varTexto) {
		System.out.println(varTexto + super.getDateTime());		
	}
	
	public Exception excessaoTeste() {
		Exception e = new Exception();
		return e;
	}
}
