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
		System.out.println("Data Atual No Calendário: " + calendario.getTime());
		System.out.println("Data Customizada No Calendário: " + calendario.getTime());		
		System.out.println("Calendar Ano: " + calendario.get(Calendar.YEAR));		
		System.out.println("Calendar mês: " + calendario.get(Calendar.MONTH));		
		System.out.println("Calendar Semana do Ano: " + calendario.get(Calendar.WEEK_OF_YEAR));		
		System.out.println("Calendar Semana do Mês: " + calendario.get(Calendar.WEEK_OF_MONTH));		
		System.out.println("Calendar Dia da Semana: " + calendario.get(Calendar.DAY_OF_WEEK));		
		System.out.println("Calendar Dia no Ano: " + calendario.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("===============================");		
		/*
		 * Data customizada no Calendário
		 */
		Date data = new Date();
		data = new Date(116, 4, 26, 11, 34, 50);
		calendario.setTime(data);
		System.out.println("Data Customizada No Calendário: " + calendario.getTime());		
		System.out.println("Calendar Ano: " + calendario.get(Calendar.YEAR));		
		System.out.println("Calendar mês: " + calendario.get(Calendar.MONTH));		
		System.out.println("Calendar Semana do Ano: " + calendario.get(Calendar.WEEK_OF_YEAR));		
		System.out.println("Calendar Semana do Mês: " + calendario.get(Calendar.WEEK_OF_MONTH));		
		System.out.println("Calendar Dia da Semana: " + calendario.get(Calendar.DAY_OF_WEEK)); // 1 = Domingo		
		System.out.println("Calendar Dia no Ano: " + calendario.get(Calendar.DAY_OF_YEAR));		

		/*
		 * Métodos principais:
		 * get : Captura um campo específico
		 * set : Modifica um campo específico
		 * add : Acrescenta determinadas quantidades de tempo à data contida no objeto Canlendar. Realiza ajustes implícitos em todos os campos. 
		 * roll : Acrescenta determinadas quantidades de tempo à data contida no objeto Canlendar. Não realiza ajustes implícitos em todos os campos.
		 */
		
		/*
		 * Manupula Datas no Calendar
		 */
		calendario = Calendar.getInstance();
		calendario.set(Calendar.YEAR, calendario.get(Calendar.YEAR) -3);
		System.out.println("Data Atual a 3 anos atrás: " + calendario.getTime());
		System.out.println("===============================");
		
		/*
		 * Formantando Datas
		 * 
		 * Caracteres de Formatação de Data
		 * 
		 * y : Ano
		 * M : Mês -- Duas repetições: numérico (1 a 12) -- Três Repetições: represantação abreviada (Jan.. Dez) - Quatro repetições: por extenso (Janeiro, Dezembro)
		 * d : Dia do Mês
		 * E : Dia da Semana -- Até três repetições: Abreviado (Dom, Seg) -- Quatro repetições: Por extenso
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
		System.out.println("Data Sem formatação " + dataFormatada);
		System.out.println("Data Com formatação " + "dd/MM/yyyy " + format.format(dataFormatada));
		format = new SimpleDateFormat("dd/MM/yyyy a");
		System.out.println("Data Com formatação " + format.format(dataFormatada));		
		
		/*
		 * Aspas simples, texto inserido na formatação
		 */
		format = new SimpleDateFormat(" 'São Paulo'. EEEE, dd, 'de' MMMM 'de' yyyy '. Período: ' a ");
		System.out.println("Data Com formatação " + format.format(dataFormatada));
		System.out.println("===============================");		
		
		/*
		 * Definição objeto locale para alterar padrão de data por país 
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
