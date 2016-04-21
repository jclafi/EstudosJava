package hibernatecfgxml;

import javax.swing.JOptionPane;

import hibernatecfgxml.TestaHibernate;

public class ExecutaHibernate {

	public static void main(String[] args) {
		
		TestaHibernate objHibernate = new TestaHibernate();
		try {
			
			if (! objHibernate.salvaEndereco(1)) {
				JOptionPane.showMessageDialog(null, "Erro ao Salvar o Endereço !");
			}

			if (! objHibernate.salvaPessoa(21)) {
					JOptionPane.showMessageDialog(null, "Erro ao Salvar o Pessoa !");				
			}

			if (! objHibernate.removeEndereco(1)) {
				JOptionPane.showMessageDialog(null, "Erro ao Remover o Endereço !");				
			}

			if(! objHibernate.removePessoa(21)) {
				JOptionPane.showMessageDialog(null, "Erro ao Remover a Pessoa !");				
			}

			if (! objHibernate.listaEnderecos()) {
				JOptionPane.showMessageDialog(null, "Erro ao Listar os Endereços !");								
			}

			if (! objHibernate.listaPessoas()) {
				JOptionPane.showMessageDialog(null, "Erro ao Listar as Pessoas !");									
			}
			
			if (! objHibernate.updateEndereco(8)) {
				JOptionPane.showMessageDialog(null, "Erro ao Atualizar o Endereço !");
			}
			
			if (! objHibernate.updatePessoa(1)) {
				JOptionPane.showMessageDialog(null, "Erro ao Atualizar a Pessoa !");
			}
			
			if (! objHibernate.listaSQLCustomizado()) {
				JOptionPane.showMessageDialog(null, "Erro ao Listar SQL Customizado !");				
			}
		}
		finally {
			objHibernate = null;
		}
		
		System.gc();
		System.exit(0);

	}

}
