package interfacesgui;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.GridLayout;

public class FlowLayoutTeste extends JFrame {

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
					FlowLayoutTeste frame = new FlowLayoutTeste();
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
	public FlowLayoutTeste() {
		// Define opera��o para fechar o Form
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Define a posi��o e tamanho da interface
		setBounds(100, 100, 400, 260);

		// Adiciona os componentes na tela e gerenciador de layout
		adicionaComponentes();

		// pack();
	}

	private void adicionaComponentes() {
		// Adiciona os componentes ao JPanel
		contentPane = new JPanel();
		try {
			// Define o Gerenciador de Layout
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));

			JPanel panel = new JPanel();
			contentPane.add(panel);
			panel.setLayout(new GridLayout(6, 2, 0, 0));
			// ===========================================
			// Cria o Label j� com o texto no construtor
			JLabel textoNome = new JLabel("Nome:");
			panel.add(textoNome);
			// ===========================================
			// Cria um Edit de Texto
			JTextField editTXT = new JTextField("", 10);
			panel.add(editTXT);
			// ===========================================
			// Cria o Label j� com o texto no construtor
			JLabel textoRg = new JLabel("RG:");
			panel.add(textoRg);
			// ===========================================
			// Cria um Edit de Texto
			JTextField editRg = new JTextField("", 10);
			panel.add(editRg);
			// ===========================================
			// Cria o Label j� com o texto no construtor
			JLabel textoTelefone = new JLabel("Telefone1:");
			panel.add(textoTelefone);
			// ===========================================
			// Cria um Edit de Texto
			JTextField editTelefone = new JTextField("", 10);
			panel.add(editTelefone);
			// ===========================================
			// Cria o Label j� com o texto no construtor
			JLabel textoTelefone1 = new JLabel("Telefone2:");
			panel.add(textoTelefone1);
			// ===========================================
			// Cria um Edit de Texto
			JTextField editTelefone1 = new JTextField("", 10);
			panel.add(editTelefone1);
			// ===========================================
			// Cria o Label j� com o texto no construtor
			JLabel textoOBS = new JLabel("Observa��o:");
			panel.add(textoOBS);
			// ===========================================
			// Cria um Edit de Texto m�ltiplas linhas
			JTextArea editOBS = new JTextArea("", 0, 5);
			panel.add(editOBS);
			// ===========================================
			// Cria o Label j� com o texto no construtor
			JLabel label = new JLabel("Bancos:");
			panel.add(label);
			// ===========================================
			// Cria um JComboBox - Usando Generics
			JComboBox<String> combo = new JComboBox<String>();
			panel.add(combo);
			combo.addItem("Ita�");
			combo.addItem("Bradesco");
			combo.addItem("Banco do Brasil");
			combo.addItem("Santander");
			combo.addItem("BNDES");
			label.setVisible(true);
			editTelefone.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent arg0) {
					if (!editTelefone.getText().isEmpty())
						if (!validaDigitos(editTelefone.getText())) {
							JOptionPane.showMessageDialog(null, "Telefone Inv�lido!");
							System.out.println("Telefone Inv�lido!");
							editTelefone.setText("");
							editTelefone.grabFocus();
						}
				}
			});
			editRg.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent arg0) {
					if (!editRg.getText().isEmpty()) {
						if (!validaDigitos(editRg.getText())) {
							JOptionPane.showMessageDialog(null, "R.G Inv�lido!");
							System.out.println("R.G Inv�lido!");
							editRg.setText("");
							editRg.grabFocus();
						}
					} else if (!editTXT.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "R.G Inv�lido");
						editRg.grabFocus();
					}
				}
			});
			editTXT.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent arg0) {
					if (editTXT.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Nome inv�lido");
						editTXT.grabFocus();
					}
				}
			});

			JPanel panel_1 = new JPanel();
			contentPane.add(panel_1);
			// ===========================================

			// Adiciona os bot�es j� criando os mesmos
			// N�o tem as teclas de atalho
			JButton button_1 = new JButton("Salvar");
			panel_1.add(button_1);

			JButton button = new JButton("Excluir");
			panel_1.add(button);

			JButton button_2 = new JButton("Fechar");
			panel_1.add(button_2);

			JButton btnSair = new JButton("Sair");
			panel_1.add(btnSair);
			btnSair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (JOptionPane.showConfirmDialog(null, "Deseja Sair do Sistema ?") == JOptionPane.YES_OPTION)
						System.exit(0);
				}
			});
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (JOptionPane.showConfirmDialog(null, "Deseja Fechar a Tela?") == JOptionPane.YES_OPTION)
						dispose();
				}
			});
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Bot�o Excluir");
					System.out.println("Bot�o Excluir");
				}
			});
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Bot�o Salvar");
					System.out.print("Bot�o Salvar");
				}
			});
		} finally {
			setContentPane(contentPane);
		}
	}

	private boolean validaDigitos(String varTexto) {
		if (varTexto.isEmpty()) {
			return false;
		} else {
			for (int index = 0; index <= varTexto.length(); index++) {
				// Verifica se � n�mero
				if (!Character.isDigit(varTexto.charAt(index))) {
					return false;
				}
			}
		}
		return false;
	}
}
