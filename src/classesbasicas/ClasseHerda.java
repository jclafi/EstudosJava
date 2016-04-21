package classesbasicas;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ClasseHerda extends SuperClasse{
	
	public ClasseHerda() {
		super("0");
		System.out.println("Construtor Herda Classe");
	}
	
	//Multiplica o valor
	public double multiplicaValor(double varNum1, double varNum2) {
		return (varNum1 * varNum2);
	}
	
	public double somaMultiplicaValor(double varNum1, double varNum2) {
		metodoTesteProtected();
		double resultadoSoma = somaValores(varNum1, varNum2);		
		return (resultadoSoma * (varNum1 + varNum2));
	}
	
	protected void metodoTesteProtected() {
		System.out.println("Uso ClasseHerda");
		super.metodoTesteProtected();
		System.out.println("Fim Polimorfismo-Override");
	}
	
	public String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}		
	
}
