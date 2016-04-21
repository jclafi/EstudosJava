package interfacesgui;

import java.awt.GridLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import listeners.EventoActionListener;
import listeners.EventoMouseListener;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GridLayoutTeste extends JFrame {

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
					GridLayoutTeste frame = new GridLayoutTeste();
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
	public GridLayoutTeste() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Define a posição e tamanho da interface 
		setBounds(100, 100, 450, 200);	
		
		//Define posição da tela
		//setSize(400, 200);
		
		//Adiciona os componentes na tela e gerenciador de layout
		adicionaComponentes();		
	}
	
	private void adicionaComponentes() {
		contentPane = new JPanel();
		try {		
			//Divide em linhas e colunas
			int intLinhas = 6;
			int intColunas = 2;
			contentPane.setLayout(new GridLayout(intLinhas, intColunas));
			
			//Componentes EDIT
			JTextField nome = new JTextField("", 10);			
			JTextField rg = new JTextField("", 10);
			JTextField telefone1 = new JTextField("", 10);			
			JTextField telefone2 = new JTextField("", 10);
			
			//Adiciona Labels e Edit´s
			contentPane.add(new JLabel("Nome:"));
			nome.addActionListener(new ActionListener() {
				//Evento ENTER
				public void actionPerformed(ActionEvent e) {
					if (nome.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Nome Inválido");
					}
					else
						rg.grabFocus();
				}
			});
			contentPane.add(nome);		
			
			contentPane.add(new JLabel("RG:"));
			rg.addActionListener(new EventoActionListener(""));
			contentPane.add(rg);
			
    		contentPane.add(new JLabel("Telefone1:"));			
			contentPane.add(telefone1);
			
			contentPane.add(new JLabel("Telefone2:"));
			
			//Teste Mouse Listener
			telefone2.setName("TELEFONE 2");
			telefone2.addMouseListener(new EventoMouseListener(telefone2.getName()));			
			contentPane.add(telefone2);
			
			contentPane.add(new JLabel("Banco:"));
			JComboBox<String> combo = new JComboBox<String>();
			combo.addActionListener(new EventoActionListener(""));
			combo.addItem("Itaú");
			combo.addItem("Bradesco");			
			combo.addItem("Banco do Brasil");			
			combo.addItem("Santander");
			combo.addItem("BNDES");			
			contentPane.add(combo);

			//Cria botão e segundo modo de definir listener
			JButton botaoSalvar = new JButton("Salvar");			
			
			//Listener implementado com Classe Anônima
			botaoSalvar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { 
					System.out.println("Botão Salvar Listener F12: " + e.getActionCommand());
					System.out.println("Combobox Item: " + combo.getSelectedIndex() + " - Texto: " + combo.getSelectedItem().toString());
				}
			});
			//botaoSalvar.addMouseListener(new EventoMouseListener(botaoSalvar.getText()));			
			contentPane.add(botaoSalvar);
			
			//Cria botão de primiero modo de definir listener
			JButton botaoExcluir = new JButton("Excluir");
			botaoExcluir.setEnabled(false);
			try {
				//Listener implementado com Classe Anônima
				botaoExcluir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) { 
						System.out.println("Botão Excluir Listener F12: " + arg0.getActionCommand());
						System.out.println("Combobox Item: " + combo.getSelectedIndex() + " - Texto: " + combo.getSelectedItem().toString());						
				}
			});
			}
			finally {
				botaoExcluir.setEnabled(true);				
			}
			//EventoMouseListener mouseBotao1 = new EventoMouseListener(botaoExcluir.getText());
			//botaoExcluir.addMouseListener(mouseBotao1);
			contentPane.add(botaoExcluir);			
		}
		finally {
			setContentPane(contentPane);
		}
	}
}
