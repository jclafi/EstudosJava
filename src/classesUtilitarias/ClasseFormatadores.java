package classesUtilitarias;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Date;

public class ClasseFormatadores {

	public static void main(String[] args) {
		//Configurando a localidade
		String varPais = "BR"; //FR US
		String varIdioma = "pt"; // fr en		
		Locale localidade = new Locale(varIdioma, varPais);
		
		//Criando os Formatadores
		//Numérico
		NumberFormat varNumerico = NumberFormat.getNumberInstance(localidade);				
		//Percentual
		NumberFormat varPercentual = NumberFormat.getPercentInstance(localidade);		
		//Monetário
		NumberFormat varMonetario = NumberFormat.getCurrencyInstance(localidade);
		
		try {
			//Monetário
			System.out.println("Formatador Currency: " + varMonetario.format(1556.55));
			//Percentual 60%
			System.out.println("Formatador Percentual: " + varPercentual.format(0.6));
			//Numérico
			System.out.println("Formatador Percentual: " + varNumerico.format(600));
			
			//Lendo Valores
			Number varNumber = varNumerico.parse("1000");
			Date varData = new Date();
			System.out.println("Número Lido Parse String: " + varNumber);
			
			System.out.printf("%s recebeu salário de %s, reajuste de %s ! \n" + " No dia %td%<tm%<tY", "Julio Cesar", 
																			 varMonetario.format(1556.55),
																			 varPercentual.format(0.6),
																			 varData);
		}
		catch (ParseException ex) {
			ex.printStackTrace();
		}
		
		System.gc();
	}
	
}
