package interfacesgui;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class BorderLayoutTeste extends JFrame {

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
					BorderLayoutTeste frame = new BorderLayoutTeste();					
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
	public BorderLayoutTeste() {
		//Título
		setTitle("Teste Border Layout");		
		//Define a Operação de Fechar a tela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Posição e dimensão da tela
		setBounds(100, 100, 400, 200);						
		//Monta os edits da tela		
		JPanel dadosConta = montaDadosConta();
		//Monta botoes da tela		
		JPanel dadosBotoes = montaBotoes();			
		
		//Define que o Gerenciador de Layout do Frame é BorderLayout
		getContentPane().setLayout(new BorderLayout());		
		getContentPane().add(new JPanel(), BorderLayout.NORTH);
		getContentPane().add(dadosConta, BorderLayout.CENTER);
		getContentPane().add(dadosBotoes, BorderLayout.SOUTH);
		
		//Auto ajusta a tela
		pack();
	}
	
	private JPanel montaBotoes() {
		//Monta o painel de botões e define o seu Layout
		contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//Adiciona os componentes no painel
		JButton button = new JButton("Salvar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Botão Salvar");
				JOptionPane.showMessageDialog(null, "Salvar");				
			}
		});
		contentPane.add(button);
		JButton button_1 = new JButton("Excluir");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botão Excluir");
				JOptionPane.showMessageDialog(null, "Excluir");				
			}
		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Sair");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Deseja Sair?") == JOptionPane.YES_OPTION)				
					System.exit(0);				
			}
		});
		contentPane.add(button_2);		
			
		return contentPane;	
	}
	
	private JPanel montaDadosConta() {
		
		contentPane = new JPanel();
		
		//Define o Layout do painel de Dados Conta, tipo Grid Layout com 5 linhas e 2 colunas
		contentPane.setLayout(new GridLayout(5, 2));
			
		//Cria os Edits para adicionar ao painel			
		//Adiciona os Edit´s ao painel criando os respectivos labels
		contentPane.add(new JLabel("Número Conta:"));
		JTextField editNrConta = new JTextField("", 15);		
		editNrConta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				System.out.println("Conta Perdeu Foco !");
				JOptionPane.showMessageDialog(null, "Conta Perdeu Foco!");				
			}
		});
		contentPane.add(editNrConta);
		
		contentPane.add(new JLabel("Agência:"));
		JTextField editAgencia = new JTextField("", 15);		
		contentPane.add(editAgencia);
		
		contentPane.add(new JLabel("Banco:"));
		JTextField editBanco = new JTextField("", 15);
		contentPane.add(editBanco);
		
		contentPane.add(new JLabel("Limite"));
		JTextField editLimite = new JTextField("", 15);
		contentPane.add(editLimite);
		
		contentPane.add(new JLabel("Correntista:"));
		JTextField editCorrentista = new JTextField("", 15);
		contentPane.add(editCorrentista);	
		
		return contentPane;
	}
}
