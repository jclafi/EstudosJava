package interfacesgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.border.EmptyBorder;

import listeners.EventoActionListener;
import listeners.EventoMouseListener;

import javax.swing.JOptionPane;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TstTabbedPane extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TstTabbedPane frame = new TstTabbedPane();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TstTabbedPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 260);
		
		defineComponentesVisuais();
	}
	
	private void defineComponentesVisuais() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout());
		
		//Cria o painel de abas
		JTabbedPane tabbedPane = new JTabbedPane();
		//Cria os JPanel das abas
		JPanel panel1 = new JPanel();
		panel1.add(defineComponentesTab1());
		JPanel panel2 = new JPanel();
		panel2.add(new JLabel("Painel 2"));
		JPanel panel3 = new JPanel();
		panel3.add(new JLabel("Panel 3"));
		
		//Cria as abas adicionando os Panel
		tabbedPane.add("Dados do Banco", panel1);
		tabbedPane.add("Tab 2", panel2);
		tabbedPane.add("Tab 3", panel3);	
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel painelBotoes = new JPanel();
		painelBotoes.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton button = new JButton("Excluir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Excluir");
			}
		});
		painelBotoes.add(button);
		JButton button_1 = new JButton("Salvar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Salvar");				
			}
		});
		painelBotoes.add(button_1);
		contentPane.add(painelBotoes, BorderLayout.SOUTH);
		
		setContentPane(contentPane);
	}
	
	private JPanel defineComponentesTab1() {
		JPanel panelGridLay = new JPanel();
		
		//Divide em linhas e colunas
		int intLinhas = 6;
		int intColunas = 2;
		panelGridLay.setLayout(new GridLayout(intLinhas, intColunas));
			
		//Adiciona Labels e Edit´s
		panelGridLay.add(new JLabel("Nome:"));
		JTextField nome = new JTextField("", 10);
		panelGridLay.add(nome);		
		
		panelGridLay.add(new JLabel("RG:"));
		JTextField rg = new JTextField("", 10);
		rg.addActionListener(new EventoActionListener(""));
		panelGridLay.add(rg);
			
		panelGridLay.add(new JLabel("Telefone1:"));			
		JTextField telefone1 = new JTextField("", 10);			
		panelGridLay.add(telefone1);
			
		panelGridLay.add(new JLabel("Telefone2:"));			
		JTextField telefone2 = new JTextField("", 10);
		//Teste Mouse Listener
		telefone2.setName("TELEFONE 2");
		telefone2.addMouseListener(new EventoMouseListener(telefone2.getName()));			
		panelGridLay.add(telefone2);
		
		panelGridLay.add(new JLabel("Banco:"));
		JComboBox<String> combo = new JComboBox<String>();
		combo.addActionListener(new EventoActionListener(""));
		combo.addItem("Itaú");
		combo.addItem("Bradesco");			
		combo.addItem("Banco do Brasil");			
		combo.addItem("Santander");
		combo.addItem("BNDES");			
		panelGridLay.add(combo);
		
		return panelGridLay;
	}
}
