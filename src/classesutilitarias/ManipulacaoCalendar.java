package classesutilitarias;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ManipulacaoCalendar {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.out.println("===============================");
		Calendar calendario = Calendar.getInstance();
		System.out.println("Data Atual No Calend�rio: " + calendario.getTime());
		System.out.println("Data Customizada No Calend�rio: " + calendario.getTime());		
		System.out.println("Calendar Ano: " + calendario.get(Calendar.YEAR));		
		System.out.println("Calendar m�s: " + calendario.get(Calendar.MONTH));		
		System.out.println("Calendar Semana do Ano: " + calendario.get(Calendar.WEEK_OF_YEAR));		
		System.out.println("Calendar Semana do M�s: " + calendario.get(Calendar.WEEK_OF_MONTH));		
		System.out.println("Calendar Dia da Semana: " + calendario.get(Calendar.DAY_OF_WEEK));		
		System.out.println("Calendar Dia no Ano: " + calendario.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("===============================");		
		/*
		 * Data customizada no Calend�rio
		 */
		Date data = new Date();
		data = new Date(116, 4, 26, 11, 34, 50);
		calendario.setTime(data);
		System.out.println("Data Customizada No Calend�rio: " + calendario.getTime());		
		System.out.println("Calendar Ano: " + calendario.get(Calendar.YEAR));		
		System.out.println("Calendar m�s: " + calendario.get(Calendar.MONTH));		
		System.out.println("Calendar Semana do Ano: " + calendario.get(Calendar.WEEK_OF_YEAR));		
		System.out.println("Calendar Semana do M�s: " + calendario.get(Calendar.WEEK_OF_MONTH));		
		System.out.println("Calendar Dia da Semana: " + calendario.get(Calendar.DAY_OF_WEEK)); // 1 = Domingo		
		System.out.println("Calendar Dia no Ano: " + calendario.get(Calendar.DAY_OF_YEAR));		

		/*
		 * M�todos principais:
		 * get : Captura um campo espec�fico
		 * set : Modifica um campo espec�fico
		 * add : Acrescenta determinadas quantidades de tempo � data contida no objeto Canlendar. Realiza ajustes impl�citos em todos os campos. 
		 * roll : Acrescenta determinadas quantidades de tempo � data contida no objeto Canlendar. N�o realiza ajustes impl�citos em todos os campos.
		 */
		
		/*
		 * Manupula Datas no Calendar
		 */
		calendario = Calendar.getInstance();
		calendario.set(Calendar.YEAR, calendario.get(Calendar.YEAR) -3);
		System.out.println("Data Atual a 3 anos atr�s: " + calendario.getTime());
		System.out.println("===============================");
		
		/*
		 * Formantando Datas
		 * 
		 * Caracteres de Formata��o de Data
		 * 
		 * y : Ano
		 * M : M�s -- Duas repeti��es: num�rico (1 a 12) -- Tr�s Repeti��es: represanta��o abreviada (Jan.. Dez) - Quatro repeti��es: por extenso (Janeiro, Dezembro)
		 * d : Dia do M�s
		 * E : Dia da Semana -- At� tr�s repeti��es: Abreviado (Dom, Seg) -- Quatro repeti��es: Por extenso
		 * a : Marcador am/pm
		 * H : Hora de 0 a 23
		 * h : Hora de 1 a 12 
		 * m : Minutos
		 * s : Segundos
		 * S : Milissegundos
		 * 
		 */
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = new Date();
		System.out.println("Data Sem formata��o " + dataFormatada);
		System.out.println("Data Com formata��o " + "dd/MM/yyyy " + format.format(dataFormatada));
		format = new SimpleDateFormat("dd/MM/yyyy a");
		System.out.println("Data Com formata��o " + format.format(dataFormatada));		
		
		/*
		 * Aspas simples, texto inserido na formata��o
		 */
		format = new SimpleDateFormat(" 'S�o Paulo'. EEEE, dd, 'de' MMMM 'de' yyyy '. Per�odo: ' a ");
		System.out.println("Data Com formata��o " + format.format(dataFormatada));
		System.out.println("===============================");		
		
		/*
		 * Defini��o objeto locale para alterar padr�o de data por pa�s 
		 */
		Locale franca = Locale.FRANCE;
		Locale alemanha = Locale.GERMANY;
		Locale eua = Locale.US;
		Locale italiano = Locale.ITALY;		
		Locale brasil = new Locale("pt", "BR");
		Locale[] arrayLocale = {franca, alemanha, eua, brasil, italiano};
		
		for (Locale index : arrayLocale) {
			DateFormat formatador = DateFormat.getDateInstance(DateFormat.LONG, index);
			System.out.println(formatador.format(dataFormatada)); 
		}
		
	}

}
