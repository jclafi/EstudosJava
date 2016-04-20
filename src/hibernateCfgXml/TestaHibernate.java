package hibernateCfgXml;

import hibernateCfgXml.Pessoa;
import hibernateCfgXml.Endereco;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestaHibernate {
	
	private SessionFactory factory;	
	
	public TestaHibernate() {
		
		try {
			
			this.factory = new Configuration().configure().buildSessionFactory();
			
		}
		catch (HibernateException ex) {
			System.out.println("Exce��o ao criar a Sessionfactory: " + ex.getMessage());
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, "Exce��o na cria��o da SessionFactory: " + ex.getMessage());
		}
		
	}
	
	public boolean salvaPessoa(long varIdPessoa) {

		//Cria a Session
		Session session = this.factory.openSession();
		
		//Cria a Transacation
		Transaction tx = null;		
		
		//Cria Objeto regra de neg�cio
		Pessoa objPessoa = new Pessoa();		
		try {
			
			//Popula Objeto Pessoa
			objPessoa.setIdGeral(varIdPessoa);
			objPessoa.setNome("Testa Hibernate CFG");
			objPessoa.setRg("5.5558.556.55");
			objPessoa.setSobreNome("Aquele Teste");
			objPessoa.setMail("teste@gamil.com");
	
			tx = session.beginTransaction();
						
			session.save(objPessoa);
			
			tx.commit();						
		}
		catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			System.out.println("Exce��o ao Salvar Pessoa:" + ex.getMessage());
			ex.printStackTrace();
			return false;
		}
		finally {
			if (session != null) {
				session.close();
				session = null;
			}			
			if (tx != null)
				tx = null;
			if (objPessoa != null)
				objPessoa = null;
		}
		
		return true;
	}
	
	public boolean salvaEndereco(int varCodigo) {
		
		//Cria a Session
		Session session = this.factory.openSession();
		
		//Cria a Transacation
		Transaction tx = null;
		
		//Cria objeto Endere�o
		Endereco objEndereco = new Endereco();		
		try {

			//Popula objEndereco
			objEndereco.setCodigo(varCodigo);
			objEndereco.setCidade("Curitiba");
			objEndereco.setCep("88320-440");
			objEndereco.setEstado("PR");
			objEndereco.setRua("Av. Get�lio Vargas");
			objEndereco.setLatitude(1.5f);
			objEndereco.setLongitude(9.5f);
			
			tx = session.beginTransaction();
			
			session.persist(objEndereco);
			
			tx.commit();			
			
		}
		catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			System.out.println("Exce��o ao Salvar Endere�o: " + ex.getMessage());
			ex.printStackTrace();
			return false;
		}
		finally {
			if (session != null) {
				session.close();
				session = null;
			}
			if (tx != null) {
				tx = null;
			}
			if (objEndereco != null)
				objEndereco = null;
		}
		
		return true;
	}
	
	public boolean removePessoa(long varIdPessoa) {		
		
		//Objeto Pessoa
		Pessoa objPessoa = null;
		
		//Objeto Session
		Session session = factory.openSession();
		
		//Objeto Transa��o
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			objPessoa = (Pessoa) session.get(Pessoa.class, varIdPessoa);
			
			if (objPessoa != null) {
				session.delete(objPessoa);			
				tx.commit();
			}
			else
				tx.rollback();
		}
		catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
			return false;
		}
		finally {
			if (session != null) {
				session.close();				
			}			
			if (tx != null) 
				tx = null;
			if (objPessoa != null)
				objPessoa = null;		
		}		
		
		return true;	
	}
	
	public boolean removeEndereco(int varCodigo) {
		
		//Objeto Endere�o
		Endereco endereco = null;
		
		//Objeto Sess�o
		Session session = factory.openSession();
		
		//Transa��o
		Transaction tx = null;
		
		try {
			
			tx = session.beginTransaction();
			
			endereco = (Endereco) session.get(Endereco.class, varCodigo);
			
			if (endereco != null) {
				session.delete(endereco);
				tx.commit();
			}
			else
				tx.rollback();
		}
		catch (HibernateException ex) {
			tx.rollback();
			System.out.println("Exce��o ao Remover o Endere�o:" + ex.getMessage());
			ex.printStackTrace();
			return false;
		}
		finally {
			if (session != null) {
				session.close();
				session = null;
			}
			if (tx != null)
				tx = null;
			if (endereco != null)
				endereco = null;
		}
		
		return true;
	}	
	
	public boolean listaPessoas() {
		
		//Contador
		int count = 0;
		
		//Objeto Regra de Neg�cio
		Pessoa objPessoa = null;
		
		//Cria a Session
		Session session = this.factory.openSession();	
		
		try {
			
			@SuppressWarnings("unchecked")
			List<Pessoa> QryPessoa = session.createQuery("FROM Pessoa").list();
			
			//Lista via iterator e While
			//Neste exemplo cada posi��o � acessada em um objeto Pessoa auxiliar definido antes da leitura			
			Iterator<Pessoa> iterator = QryPessoa.iterator();
			while (iterator.hasNext()) {

				//Incrementa contador
				count++;
				
				//Pega o objPessoa da lista
				objPessoa = (Pessoa) iterator.next();

				System.out.println("=======================================");				
				System.out.println("Lista Iterator/While: Posi��o Nr.: " + count);
				System.out.println("Id Geral: " + objPessoa.getIdGeral());
				System.out.println("Nome: " + objPessoa.getNome());
				System.out.println("Sobre Nome: " + objPessoa.getSobreNome());
				System.out.println("R.G: " + objPessoa.getRg());				
				System.out.println("eMail: " + objPessoa.getMail());		
				System.out.println("=======================================");			
			}
			
			//Lista via For Normal
			//Neste exemplo cada posi��o � acessada em um objeto Pessoa auxiliar definido antes da leitura
			for (int index = 0; index < QryPessoa.size(); index++) {

				//Pega o objPessoa da lista
				objPessoa = QryPessoa.get(index);				
				
				System.out.println("=======================================");				
				System.out.println("Lista For Normal: Posi��o Nr.: " + index);
				System.out.println("Id Geral: " + objPessoa.getIdGeral());
				System.out.println("Nome: " + objPessoa.getNome());
				System.out.println("Sobre Nome: " + objPessoa.getSobreNome());
				System.out.println("R.G: " + objPessoa.getRg());				
				System.out.println("eMail: " + objPessoa.getMail());		
				System.out.println("=======================================");
			}
			
			//Lista via enhanced for
			count = 0;
			for(Pessoa index2 : QryPessoa) {
				
				count++;
				
				System.out.println("=======================================");				
				System.out.println("Lista Enhanced For: Posi��o Nr.: " + count);
				System.out.println("Id Geral: " + index2.getIdGeral());
				System.out.println("Nome: " + index2.getNome());
				System.out.println("Sobre Nome: " + index2.getSobreNome());
				System.out.println("R.G: " + index2.getRg());				
				System.out.println("eMail: " + index2.getMail());		
				System.out.println("=======================================");				
			}
			
		}
		catch (HibernateException ex) {
			System.out.println("Exce��o ao Listar Pessoa: " + ex.getMessage());
			ex.printStackTrace();
			return false;
		}
		finally {
			if (session != null) {
				session.close();
				session = null;
			}
			if (objPessoa != null)
				objPessoa = null;
		}
		
		return true;		
	}
	
	public boolean listaEnderecos() {
		
		//Contador de Linhas
		int count = 0;
		
		//Objeto Regra de Neg�cio
		Endereco objEndereco = null;
		
		//Session
		Session session = factory.openSession();
		
		try {
			
			@SuppressWarnings("unchecked")
			List<Endereco> QryEndereco = session.createQuery("FROM Endereco").list();
			
			//Lista os Endere�os com Iterator
			//Neste exemplo cada posi��o � acessada em um objeto Endere�o auxiliar definido antes da leitura			
			Iterator<Endereco> iterator = QryEndereco.iterator();
			while (iterator.hasNext()) {
				//Incrementa Contador
				count++;
				
				//Resgata o Objeto Endere�o
				objEndereco = iterator.next();
				
				System.out.println("=======================================");				
				System.out.println("Lista Iterator/While: Posi��o Nr.: " + count);
				System.out.println("C�digo: " + objEndereco.getCodigo());
				System.out.println("Nome: " + objEndereco.getCep());
				System.out.println("Sobre Nome: " + objEndereco.getCidade());
				System.out.println("R.G: " + objEndereco.getEstado());				
				System.out.println("eMail: " + objEndereco.getRua());		
				System.out.println("=======================================");
			}
			
			//Lista via for Normal
			//Neste exemplo cada posi��o � acessada no momento da leitura, n�o necessitando de um Objeto auxiliar			
			for(int index = 0; index < QryEndereco.size(); index++) {
				
				System.out.println("=======================================");				
				System.out.println("Lista For Normal: Posi��o Nr.: " + index);
				System.out.println("C�digo: " + QryEndereco.get(index).getCodigo());
				System.out.println("Nome: " + QryEndereco.get(index).getCep());
				System.out.println("Sobre Nome: " + QryEndereco.get(index).getCidade());
				System.out.println("R.G: " + QryEndereco.get(index).getEstado());				
				System.out.println("eMail: " + QryEndereco.get(index).getRua());		
				System.out.println("=======================================");
			}
			
			//Lista via Enhanced For
			count = 0;
			for (Endereco index3 : QryEndereco) {
				
				count++;
				
				System.out.println("=======================================");				
				System.out.println("Lista For Normal: Posi��o Nr.: " + count);
				System.out.println("C�digo: " + index3.getCodigo());
				System.out.println("Nome: " + index3.getCep());
				System.out.println("Sobre Nome: " + index3.getCidade());
				System.out.println("R.G: " + index3.getEstado());				
				System.out.println("eMail: " + index3.getRua());		
				System.out.println("=======================================");				
			}
					
		}
		catch (HibernateException ex) {
			System.out.println("Exce��o ao Listar Endere�o: " + ex.getMessage());
			ex.printStackTrace();
			return false;
		}
		finally {
			if (session != null) {
				session.close();
				session = null;
			}
			if (objEndereco != null)
				objEndereco = null;
		}
				
		return true;		
	}
	
	public boolean updatePessoa(long varIdPessoa) {
		
		//Objeto Pessoa
		Pessoa objPessoa = null;
		
		//Objeto Session
		Session session = factory.openSession();
		
		//Objeto Transa��o
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			objPessoa = (Pessoa) session.get(Pessoa.class, varIdPessoa);
			
			if (objPessoa != null) {				
				objPessoa.setSobreNome("UPDATE " + varIdPessoa);
				
				session.update(objPessoa);			
				tx.commit();
			}
			else
				tx.rollback();
		}
		catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
			return false;
		}
		finally {
			if (session != null) {
				session.close();				
			}			
			if (tx != null) 
				tx = null;
			if (objPessoa != null)
				objPessoa = null;		
		}		
				
		return true;
	}
	
	public boolean updateEndereco(int varCodigo) {
		
		//Objeto Endere�o
		Endereco endereco = null;
		
		//Objeto Sess�o
		Session session = factory.openSession();
		
		//Transa��o
		Transaction tx = null;
		
		try {
			
			tx = session.beginTransaction();
			
			endereco = (Endereco) session.get(Endereco.class, varCodigo);
			
			if (endereco != null) {				
				endereco.setLatitude(endereco.getLatitude() + varCodigo);				
				endereco.setLongitude(endereco.getLongitude() + varCodigo);
				
				session.update(endereco);
				tx.commit();
			}
			else
				tx.rollback();
		}
		catch (HibernateException ex) {
			tx.rollback();
			System.out.println("Exce��o ao Remover o Endere�o:" + ex.getMessage());
			ex.printStackTrace();
			return false;
		}
		finally {
			if (session != null) {
				session.close();
				session = null;
			}
			if (tx != null)
				tx = null;
			if (endereco != null)
				endereco = null;
		}
		
		return true;
	}
	
	public boolean listaSQLCustomizado() {
		final String CUSTOM_SQL =	"   select p.nome, e.rua, e.cidade  	 "+
									"	from pessoa p						 "+	
									"	join endereco e on p.id_geral = e.id "+
									"   where p.nome <> '''' order by p.nome ";
		
		//Cria a sess�o
		Session session = factory.openSession();
	
		SQLQuery qryTeste = null;
		try {			
			
			qryTeste = session.createSQLQuery(CUSTOM_SQL);

			@SuppressWarnings("unchecked")
			List<Object[]> rows = qryTeste.list();
			 
			for (Object[] index : rows) {
				System.out.println("Nome: " + index[0] + " - Rua:  " + index[1] + " - Cidade: " + index[2]);
			}
			
		}
		catch (HibernateException ex) {
			System.out.println("Exce��o ao Executar SQL Customizado:" + ex.getMessage());
			ex.printStackTrace();
		}
		finally {
			if (!qryTeste.list().isEmpty()) {
				qryTeste.list().clear();
				qryTeste = null;
			}
			
			if (session != null) {
				session.close();
				session = null;				
			}
		}
				
		return true;
	}
	
	public void finalize() {
		System.out.println("M�todo Finalize!");
		if (factory != null) {
			if (! factory.isClosed())
				factory.close();
			factory = null;
		}
			
	}

}