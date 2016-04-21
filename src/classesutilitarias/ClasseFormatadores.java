package classesutilitarias;

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
			//Define o número de casa decimais no Currency
			varMonetario.setMaximumFractionDigits(4);
			varMonetario.setMinimumIntegerDigits(2);			
			System.out.println("Formatador Currency: " + varMonetario.format(1556.552));
			//Percentual 60%
			System.out.println("Formatador Percentual: " + varPercentual.format(0.6));
			//Numérico
			System.out.println("Formatador Percentual: " + varNumerico.format(600));
			
			//Lendo Valores
			Number varNumber = varNumerico.parse("1000");
			Date varData = new Date();
			System.out.println("Número Lido Parse String: " + varNumber);
			
			System.out.printf("%s recebeu salário de %s, reajuste de %s no dia %td/%<tm/%<tY", "Julio Cesar", 
																			 varMonetario.format(1556.55),
																			 varPercentual.format(0.6),
																			 varData);
			/*
			 * Tabela de caracteres para conversão de printf
			 * 
			 * b : boolean
			 * c : char
			 * d : inteiro
			 * f : ponto flutuante
			 * s : string
			 * t : Data e Hora
			 * % : Literal %
			 * n : quebra de Linha
			 * 
			 */
			
			/*
			 *  Formatação de Hora
			 *  
			 *  H : Hora do dia com base em 24 Horas e zero à esquerda se necessário: 00 a 23
			 *  I : Hora do dia com base em 12 horas e zero à esquerda se encessário: 01 a 12 
			 *  k : Hora do dia com base em 24 horas: 0 a 23
			 *  l : Hora do dia com base em 12 horas: 1 a 12
			 *  M : Minuto de uma hora formatados com 2 dígitos e zero à esquerda se necessário: 00 a 59 
			 *  S : Segundo de um minuto formatados com 2 dígitos e zero à esquerda se encessário: 00 a 60
			 *  L : Milisegundo
			 *  p Marcador de manhã ou tarde AM PM
			 */
			
			/*
			 * B : Nome completo do mês Janeiro
			 * b ou h : Nome abreviado do mês Jan
			 * A : Nome completo do dia da semana Domingo
			 * a : Nome abreviado do dia da semana Dom
			 * Y : Ano com 4 dígitos e zeros à esquerda
			 * y : Ano com 2 dpigitos e zero à esquerda
			 * m : Mês com 2 dígitos e zero à esquerda: 01 a 12 
			 * d : Dia do mês com 2 dígitos e zero à esquerda: 0 a 31
			 * e : Dia do mês com 2 dígitos: 1 aa 31 
			 *  
			 */
			
			
			
		}
		catch (ParseException ex) {
			ex.printStackTrace();
		}
		
		System.gc();
	}
	
}
