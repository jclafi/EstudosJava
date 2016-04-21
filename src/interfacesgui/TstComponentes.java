package interfacesgui;

import java.awt.FlowLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.border.EmptyBorder;

import classesbasicas.Pessoa;

import java.awt.event.*;
//import java.util.Vector;

public class TstComponentes extends JFrame {

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
					TstComponentes frame = new TstComponentes();
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
	public TstComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		
		setComponent();
		//pack();
	}
	
	@SuppressWarnings("rawtypes")
	private void setComponent() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//JCheckBox
		//Listener Inner/Nested Class via objeto
		JCheckBox checkBox = new JCheckBox("CheckBox", false);
		EventoActionListener objActionListener = new EventoActionListener(); 
		checkBox.addActionListener(objActionListener);
		contentPane.add(checkBox);		
		//Listener Inner/Nested Class sem Objeto
		JCheckBox checkBox1 = new JCheckBox("CheckBox 1", true);
		checkBox1.addActionListener(new EventoActionListener());		
		contentPane.add(checkBox1);		
		//Listener Classe Anônima
		JCheckBox checkBox2 = new JCheckBox("CheckBox 2", true);
		checkBox2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Classe Anônima. Action Listener: " + arg0.getActionCommand()); 
				System.out.println("Checked: " + checkBox2.isSelected());
			} } );		
		contentPane.add(checkBox2);
		
		//JList - Lista de Objetos
		Pessoa objPessoa = new Pessoa("5.532.325-7", "Julio Cesar Ledo");
		Pessoa objPessoa1 = new Pessoa("5.324.435-3", "Tatiana Slva");
		Pessoa objPessoa2 = new Pessoa("4.532.678-5", "Luana Amaral");		
		Pessoa objPessoa3 = new Pessoa("3.545.235-4", "Clóvis Andrade");
		Pessoa objPessoa4 = new Pessoa("3.344.421-1", "Iara Tambozetti");
		
		Pessoa[] dadosPessoa1 = { objPessoa, objPessoa1, objPessoa2, objPessoa3, objPessoa4 };
		
		//Cria um Vector para inserir os componentes
		//Vector<Pessoa> objVector = new Vector<Pessoa>();
		//objVector.add(objPessoa);
		//objVector.add(objPessoa1);		
		//objVector.add(objPessoa2);		
		//objVector.add(objPessoa3);		
		//objVector.add(objPessoa4);		
		
		//Teste JLista com Vector
		@SuppressWarnings("unchecked")
		JList<?> listaPessoa = new JList(dadosPessoa1);
		contentPane.add(listaPessoa);		
		//JButton para disponibilizar os objetos único selcionado na lista
		JButton botaoLista = new JButton("Lista 1 Pessoa");
		botaoLista.addActionListener(new ActionListener() { 		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Teste de seleção de um único item
				if (! listaPessoa.isSelectionEmpty()) {
					if (listaPessoa.getSelectedValuesList().size() > 1) {
						System.out.println("Selecione somente uma Pessoa !");
						listaPessoa.clearSelection();	
					}
					else
					{					
						Pessoa objRetorno = (Pessoa) listaPessoa.getSelectedValue();
						if (objRetorno != null)
							System.out.println("Pessoa Selecionada: " + objRetorno.getNome());
						else
							System.out.println("Nenhuma Pessoa Retornada");
						objRetorno = null;
					}
				}
				else				
					System.out.println("Nenhuma Pessoa Selecionada");			
		} } );
		contentPane.add(botaoLista);
		
		//Teste JList com array de Objeto Pessoa
		Pessoa[] dadosPessoa = { objPessoa, objPessoa1, objPessoa2, objPessoa3, objPessoa4 };
		@SuppressWarnings("unchecked")
		JList<?> arrayListaPessoa = new JList(dadosPessoa);
		
		//Erro Window Builder
		//JList<Pessoa> arrayListaPessoa = new JList<Pessoa>(dadosPessoa);		
		
		contentPane.add(arrayListaPessoa);
		JButton botaoLista2 = new JButton("Lista Pessoas");
		botaoLista2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Teste seleção vários itens
				if (! arrayListaPessoa.isSelectionEmpty()) {					
					Object[] objRetorno = arrayListaPessoa.getSelectedValues();
					for (int index = 0; index < objRetorno.length; index++ ) {
						//Veriica se o objeto retorno é Pessoa
						if (! (objRetorno[index] instanceof Pessoa)) { 
							System.out.println("Objeto da lista não é Pessoa!");
							break;					
						}
						Pessoa PessoaRetorno = (Pessoa) objRetorno[index];						
						
						//Teste de tela de diálogo
						JDialog dialogo = new JDialog();
						JPanel painelDialogo = new JPanel();						
						try {
							dialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							dialogo.setTitle("Seleção Pessoa"); 
							painelDialogo.add(new JLabel("Pessoa Selecionada: " + PessoaRetorno.getNome()));
							dialogo.setContentPane(painelDialogo);						
							dialogo.setBounds(100, 100, 300, 75);
							dialogo.setAlwaysOnTop(true);
							dialogo.setModal(true);							
							dialogo.setVisible(true);			
						}
						finally {
							dialogo = null;
						}
						
						//Saída normal
						System.out.println("Pessoa Selecionada: " + PessoaRetorno.getNome());						
					}
				}
				else				
					System.out.println("Nenhuma Pessoa Selecionada");			
		} } );
		
		contentPane.add(botaoLista2);		
		
		setContentPane(contentPane);
	}
	
	//Inner Nested Class
	public class EventoActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Inner Class. Action Listener: " + arg0.getActionCommand());
			
		}
	}
}

