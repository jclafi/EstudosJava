package classesUtilitarias;

//Datas
import java.util.Date;

//Formatação
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClasseDatas {

	public static void main(String[] args) {
		//Objeto manipula data atual
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date varData = new Date();
		
		System.out.println("Data Atual: " + varData);
		System.out.println("Data Formatada: " + dateFormat.format(varData));
		
		//Definindo uma data
		@SuppressWarnings("deprecation")
		Date varData2 = new Date(80, 11, 30, 06, 30, 10);
		System.out.println("Data Atual: " + dateFormat.format(varData2));
		
		//Capturando os valores da data definida
		@SuppressWarnings("deprecation")
		int ano = varData2.getYear();
		System.out.println("Ano: " + ano);
		@SuppressWarnings("deprecation")
		int mes = varData2.getMonth();
		System.out.println("Mês: " + mes);
		@SuppressWarnings("deprecation")
		int dia = varData2.getDate();
		System.out.println("Dia: " + dia);
		@SuppressWarnings("deprecation")
		int diaSemana = varData2.getDay();
		System.out.println("Dia Semana: " + diaSemana);
		@SuppressWarnings("deprecation")
		int hora = varData2.getHours();
		System.out.println("Hora: " + hora);		
		@SuppressWarnings("deprecation")
		int minuto = varData2.getMinutes();
		System.out.println("Minutos: " + minuto);		
		@SuppressWarnings("deprecation")
		int seguntos = varData2.getSeconds();
		System.out.println("Segundos: " + seguntos);
		
		//Objeto manipula Calendário
		Calendar varCalendario = Calendar.getInstance();
		//Retorna a data 
		System.out.println("Calendar: " + varCalendario.getTime());
		
		//Data formatada normal
		try	{
			System.out.println("Data Formatada Calendar" + dateFormat.format(varCalendario.getTime()));
		}
		catch (Exception ex) {
			ex.getMessage();
		}				
		
		//Data formatada por extenso - Três modelos
		//São Paulo, Domingo, 28, de Fevereiro de 2016
		DateFormat dateFormat2 = new SimpleDateFormat(" 'São Paulo', EEEE, dd, 'de' MMMM 'de' yyyy ");
		System.out.println("Data Extenso Calendar: " + dateFormat2.format(varCalendario.getTime()));		
		
		//São Paulo, Dom, 28, de 02 de 2016
		DateFormat dateFormat3 = new SimpleDateFormat(" 'São Paulo', EEE, dd, 'de' MM 'de' yyyy ");
		System.out.println("Data Extenso Calendar: " + dateFormat3.format(varCalendario.getTime()));
		
		//São Paulo, Domingo, 28, de fev  de 2016
		DateFormat dateFormat4 = new SimpleDateFormat(" 'São Paulo', EEEE, dd, 'de' MMM ' de' yyyy ");
		System.out.println("Data Extenso Calendar: " + dateFormat4.format(varCalendario.getTime()));		
		
		//Acesso a daods da data via constantes
		System.out.println("Ano: " + varCalendario.get(Calendar.YEAR));
		System.out.println("Mês: " + varCalendario.get(Calendar.MONTH));
		System.out.println("Dia: " + varCalendario.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia Semana: " + varCalendario.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia Ano: " + varCalendario.get(Calendar.DAY_OF_YEAR));		
		System.out.println("Hora: " + varCalendario.get(Calendar.HOUR));		
		System.out.println("Minutos: " + varCalendario.get(Calendar.MINUTE));		
		System.out.println("Segundos: " + varCalendario.get(Calendar.SECOND));		
	}

}
