package classesutilitarias;

import java.util.Date;
import javax.swing.JOptionPane;

public class ManipulacaoDatas {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date dataTst = new Date();
		
		/*
		 * Elementos da classe Java.ultil.Date 		
		 */
		JOptionPane.showMessageDialog(null, "Data: " + dataTst);
		JOptionPane.showMessageDialog(null, "Ano: " + dataTst.getYear());
		JOptionPane.showMessageDialog(null, "Mês: " + dataTst.getMonth());		
		JOptionPane.showMessageDialog(null, "Dia do Mês: " + dataTst.getDate());		
		JOptionPane.showMessageDialog(null, "Dia da Semana: " + dataTst.getDay());		
		JOptionPane.showMessageDialog(null, "Horas: " + dataTst.getHours());
		JOptionPane.showMessageDialog(null, "Minutos: " + dataTst.getMinutes());
		JOptionPane.showMessageDialog(null, "Segundos: " + dataTst.getSeconds());
		
		/*
		 * Outra Data definida manualmente
		 * 
		 * Parâmetros Constructor ( ano, mes, dia, hora, min, seg )
		 */
		Date outraData = new Date(116, 4, 26, 11, 34, 50);
		System.out.println("Data: " + outraData);
		System.out.println("Ano: " + outraData.getYear());
		System.out.println("Mês: " + outraData.getMonth());		
		System.out.println("Dia do Mês: " + outraData.getDate());		
		System.out.println("Dia da Semana: " + outraData.getDay());		
		System.out.println("Horas: " + outraData.getHours());		
		System.out.println("Minutos: " + outraData.getMinutes());		
		System.out.println("Segundos: " + outraData.getSeconds());		
	}

}
