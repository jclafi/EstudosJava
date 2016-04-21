package pacoteio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TesteFileChooser extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton botaoOk = new JButton("Escolher");
	private JLabel lEscolhaArquivo = new JLabel("Escolha o Arquivo desejado!");
	private JLabel lNomeArquivo = new JLabel();
	private JLabel lDiretorioArquivo = new JLabel();	
	private JFrame local = this;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteFileChooser frame = new TesteFileChooser();
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
	public TesteFileChooser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(5, 1));
		contentPane.add(lEscolhaArquivo);
		contentPane.add(botaoOk);
		contentPane.add(lNomeArquivo);
		contentPane.add(lDiretorioArquivo);		
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Deseja Sair?") == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		contentPane.add(btnSair);		
		setContentPane(contentPane);
		
		botaoOk.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				final JFileChooser file = new JFileChooser();
				int opcao = file.showOpenDialog(local); 
				
				if (opcao == JFileChooser.APPROVE_OPTION) { 
					lNomeArquivo.setText(file.getSelectedFile().getName());
					lDiretorioArquivo.setText(file.getSelectedFile().getPath());
				}
				else
					if (opcao == JFileChooser.CANCEL_OPTION) {
						lNomeArquivo.setText("Arquivo não selecionado");
						lDiretorioArquivo.setText("Diretório não selecionado");						
					}				
			}	
		});
		
	}

}

