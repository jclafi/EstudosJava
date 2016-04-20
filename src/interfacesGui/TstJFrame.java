package interfacesGui;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TstJFrame extends JFrame {

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
					TstJFrame frame = new TstJFrame();
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
	public TstJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		criaMenuTela();
		setContentPane(criaComponentesTela());
		//pack();		
	}
	
	private void criaMenuTela() {		
		//Cria a Barra de Menu e Item
		//===========================================			
		JMenuBar barra = new JMenuBar();			
		JMenu itemExemplo = new JMenu("Exemplos");
		JMenu itemExit = new JMenu("Sistema");		
		//Adiciona o Item a Barra
		barra.add(itemExemplo);
		barra.add(itemExit);			
		//Cria o primeiro SubItem
		JMenuItem itemSub_Item = new JMenuItem("Cadastro de Pessoas");
		itemExemplo.add(itemSub_Item);
		//Cria o Segundo SubItem			
		itemSub_Item = new JMenuItem("Cadastro de Funcionários");
		itemExemplo.add(itemSub_Item);
		
		//Separador
		itemExemplo.addSeparator();
		//Cria um Radio Button
		JRadioButtonMenuItem itemRadio = new JRadioButtonMenuItem("Radio Button Selecionado");			
		itemRadio.setSelected(true);			
		itemExemplo.add(itemRadio);
		//Cria um segundo Radio Button não selecionado
		itemRadio = new JRadioButtonMenuItem("Radio Button");			
		itemRadio.setSelected(false);
		itemExemplo.add(itemRadio);			
		
		//Separador
		itemExemplo.addSeparator();
		
		//Cria um Check Box
		JCheckBoxMenuItem itemCheckBox = new JCheckBoxMenuItem("Check Box Selecionado");
		itemCheckBox.setSelected(true);
		itemExemplo.add(itemCheckBox);			
		//Cria um Chack Bos não selecionado
		itemCheckBox = new JCheckBoxMenuItem("Check Box Selecionado");
		itemCheckBox.setSelected(false);
		itemExemplo.add(itemCheckBox);
		
		//Separador
		itemExemplo.addSeparator();
		
		//Um SubMenu
		JMenu subMenu = new JMenu("Sub Menu");
		itemExemplo.add(subMenu);
		JMenuItem itemSub_Menu = new JMenuItem("Item Sub Menu");
		subMenu.add(itemSub_Menu);
		
		//Separador
		subMenu.addSeparator();
		itemSub_Menu = new JMenuItem("Item Sub Menu 2");
		subMenu.add(itemSub_Menu);
		
		itemSub_Menu = new JMenuItem("Item Sub Menu 3");
		subMenu.add(itemSub_Menu);			
		itemSub_Menu = new JMenuItem("Exit");
		itemExit.add(itemSub_Menu);
			
		//add(barra);
		setJMenuBar(barra);
	}
	
	private JPanel criaComponentesTela() {
		//Cria um painel base e adiciona componentes a ele 
		contentPane = new JPanel();
		//??????????
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));			
				
		//Remove o Gerenciador de Interface
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 2, 0, 0));
		//===========================================
		//Cria o Label já com o texto no construtor
		JLabel textoNome = new JLabel("Nome:");
		panel_1.add(textoNome);
		//===========================================			
		//Cria um Edit de Texto
		JTextField editTXT = new JTextField("", 10);
		panel_1.add(editTXT);
		//===========================================			
		//Cria o Label já com o texto no construtor
		JLabel textoRg = new JLabel("RG:");
		panel_1.add(textoRg);
		//===========================================			
		//Cria um Edit de Texto
		JTextField editRg = new JTextField("", 10);
		panel_1.add(editRg);
		//===========================================	
		//Cria o Label já com o texto no construtor
		JLabel textoTelefone = new JLabel("Telefone1:");
		panel_1.add(textoTelefone);
		//===========================================			
		//Cria um Edit de Texto
		JTextField editTelefone = new JTextField("", 10);
		panel_1.add(editTelefone);
		//===========================================			
		//Cria o Label já com o texto no construtor
		JLabel textoTelefone1 = new JLabel("Telefone2:");
		panel_1.add(textoTelefone1);
		//===========================================			
		//Cria um Edit de Texto
		JTextField editTelefone1 = new JTextField("", 10);
		panel_1.add(editTelefone1);
		//===========================================			
		//Cria o Label já com o texto no construtor
		JLabel textoOBS = new JLabel("Observação:");
		panel_1.add(textoOBS);
		//===========================================
		//Cria um Edit de Texto múltiplas linhas
		JTextArea editOBS = new JTextArea("", 0, 5);
		panel_1.add(editOBS);
		//===========================================
		//Cria o Label já com o texto no construtor
		JLabel label = new JLabel("Bancos:");
		panel_1.add(label);
		//===========================================			
		//Cria um JComboBox - Usando Generics
		JComboBox<String> combo = new JComboBox<String>();
		panel_1.add(combo);
		combo.addItem("Itaú");
		combo.addItem("Bradesco");			
		combo.addItem("Banco do Brasil");			
		combo.addItem("Santander");
		combo.addItem("BNDES");
		label.setVisible(true);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 1, 0, 0));
		//===========================================			
		//Cria o Botão já com o texto no Contrutor
		JButton buttonSalvar = new JButton("Salvar");			
		buttonSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Botão Salvar Action");
				System.out.println("Botão Salvar Action");
				
			}
		});
		panel.add(buttonSalvar);
		//Botão Salvar
		buttonSalvar.setName("Botão Salvar");
		//Atalho para "ALT + A"
		buttonSalvar.setMnemonic(KeyEvent.VK_A);
		//===========================================
		//Cria o Botão já com o texto no Contrutor
		JButton buttonExcluir = new JButton("Excluir");
		buttonExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Botão Excluir Action");
				System.out.println("Botão Excluir Action");
			}
		});
		panel.add(buttonExcluir);
		//Botão Excluir
		buttonExcluir.setName("Botão Excluir");
		//Atalho para "ALT + A"
		buttonExcluir.setMnemonic(KeyEvent.VK_E);
		//===========================================
		
		return contentPane;		
	}
	
	//Inner Class - Nested Class
	public class EventMouse extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			System.out.println("Mouse Listener Botão: " + e.getComponent().getName());
		}
	}
}
