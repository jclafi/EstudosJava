package dataBase;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import classesBasicas.Pessoa;

public class PessoaDb {
	
	public long getPessoaPk() throws SQLException {
		//Comando SQL
		String sql = null;
		
		//Statement
		Statement stmt = null;
		
		//ResultSet
		ResultSet rs = null;
		
		//Pega a conex�o
		Connection connect = ConnectDatabse.getConnection();		
		
		//Verifica conex�o v�lida
		if (connect == null) {
			throw new SQLException("N�o foi poss�vel conectar na Base!");
		}
			
		try {			
			//Prepara o comando SQL
			sql = "select max(id_geral) +1 as id_geral from pessoa";
			try {
				
				//Executa o comando sql
				stmt = connect.createStatement();
				rs = stmt.executeQuery(sql);
				
				if (rs.next()) {
					if (rs.getLong("ID_GERAL") <= 0)
						return 1;
					else					
						return rs.getLong("ID_GERAL");
				}
				else
					throw new SQLException("N�o foi poss�vel identificar a PK!");					
			}
			catch (SQLException ex) {
				connect.rollback();
				throw new SQLException("Exce��o ao buscar a PK:" + ex.getMessage());
			}
		}
		finally {
			ConnectDatabse.closeConnection(connect, stmt);
			if (connect != null)
				connect = null;
			if (stmt != null)
				stmt =null;
			if (rs != null)
			{
				if (! rs.isClosed())
					rs.close();
				rs = null;
			}
		}		
	}
	
	//Consulta todas as Pessoas e retorna um ResultSet - Overlod
	public void listaTodasPessoas(String ordem) throws SQLException {
		//Comando SQL
		String sql = null;		
		//Statement
		Statement stmt = null;
		//ResultSQL
		ResultSet rs = null;
		
		//Connection
		Connection connect = ConnectDatabse.getConnection();
		
		if (connect == null) {
			throw new  SQLException("Conex�o nula!");
		}
		
		/*Define o comando SQL*/
		sql = " select * from pessoa " + ((ordem != "") ? "order by " + ordem : "");
		stmt = connect.createStatement();
		rs = stmt.executeQuery(sql);	
		
		while (rs.next()) {
			System.out.println("Pessoa: " + rs.getString("nome"));
		}	
	}
	
	//Consulta todas as Pessoas - Usando Collections e Generics
	public List<Pessoa> getTodasPessoas() throws SQLException  {
		//Comando SQL
		String sql = null;
		
		//Statement
		Statement stmt = null;
		
		//Result Set
		ResultSet rs = null;
		
		//Lista de retorno
		//List e ArrayList s�o Collections
		// List<Pessoa> e ArrayList<Pessoa>() s�o defini��es de Generics
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		//Pega uma conex�o da classe
		Connection connect = ConnectDatabse.getConnection();
		
		if (connect == null) {
			throw new SQLException("Falha ao conectar na base!");
		}
		try {
			//Define o SQL da Consulta
			sql = "select * from pessoa";
			
			try {
				//Executa o comando sql
				stmt = connect.createStatement();
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					if (! pessoas.add(new Pessoa(	rs.getString("rg"), 
													rs.getString("nome"), 
													rs.getString("nome"), 
													rs.getDate("data_nasc")) ) ){
						System.out.println("Falha ao adicionar as pessoas � Cole��o");
						pessoas.clear();
						break;
					}
					
				}
			}
			catch (SQLException ex) {
				throw new SQLException("Erro ao Consultar as Pessoas! \n " + ex.getMessage());			
			}
		}
		finally {
			ConnectDatabse.closeConnection(connect, stmt);
			if (connect != null)
				connect = null;
			if (stmt != null)
				stmt = null;
			if (rs != null)
			{
				if (! rs.isClosed())
					rs.close();
				rs = null;
			}
		}
		
		return pessoas;
	}
	
	//Consulta Pessoa por ID
	public Pessoa getPessoa(long varIdGeral) throws SQLException {
		//Comando SQL
		String sql = null;
		
		//Statement
		Statement stmt = null;
		
		//ResultSet
		ResultSet rs = null;
		
		//Objeto que ir� retornar os dados
		Pessoa pessoa = new Pessoa();
		
		//Pega uma conex�o da classe
		Connection connect = ConnectDatabse.getConnection();

		if (connect == null) {
			throw new SQLException("Falha ao conectar na base");
		}		
		try {			
			try {
				//Valida o Comando SQL
				sql = "select * from pessoa where id_geral = " + varIdGeral;
				
				//Executa o Comando SQL 
				stmt = connect.createStatement();
				rs = stmt.executeQuery(sql);
				
				//Colocar o ResultSet na primeira posi��o
				if (rs.next()) {
					pessoa.setIdGeral(rs.getLong("id_geral"));
					pessoa.setNome(rs.getString("nome"));
					pessoa.setRg(rs.getString("rg"));
					pessoa.setDataNasc(rs.getDate("data_nasc"));					
				}				
			}
			finally {
				ConnectDatabse.closeConnection(connect, stmt);
				if (connect != null)
					connect = null;
				if (stmt != null)
					stmt = null;
				if (rs != null)
				{
					if (! rs.isClosed())
						rs.close();
					rs = null;
				}			
			}
		}
		catch (SQLException ex) {
			throw new SQLException("Erro ao Consultar Pessoa! \n " + ex.getMessage()); 
		}
		
		return pessoa;
	}
	
	//Consulta todos as Pessoas
	public int excluiPreparedStatement (long varIdGeralA, long varIdGeralB) throws SQLException {
		//Retorna a quantidade removida
		int QtdRemovida = 0;
		
		//Comando SQL
		String sql = null;
		
		//Prepared Statement 
		PreparedStatement stmt = null;	
		
		//Pega uma conex�o da classe
		Connection connect = ConnectDatabse.getConnection();
		
		if (connect == null) {
			throw new SQLException("Falha ao conectar na base");
		}
		try {		
			try {
				//Valida o comando SQL com um Script separado pelo delimitador ;
				sql = 	"delete from pessoa where id_geral = ?; " + 
						"delete from pessoa where id_geral = ?; ";

				//Prepara a execu��o Prepared Statement
				stmt = connect.prepareStatement(sql);
				//Valida os Par�metros do Prepared Statement
				stmt.setLong(1, varIdGeralA);
				stmt.setLong(2, varIdGeralB);				
	     		QtdRemovida = stmt.executeUpdate();
	     		stmt.getConnection().commit();
			}
			catch (SQLException ex) {
				stmt.getConnection().rollback();
				throw new SQLException("Erro ao rodar o Prepared Statement" + ex.getMessage());
			}			
		}
		finally {
			ConnectDatabse.closeConnection(connect, stmt);
			if (connect != null)
				connect = null;
			if (stmt != null)
				stmt = null;				
		}
		
		return QtdRemovida;
	}
	
	//Exclui uma pessoa da base de dados
	public void excluiPessoa (long varIdGeral) throws SQLException {
		//Comando SQL
		String sql = null;
		
		//Statement
		Statement stmt = null;
		
		//Pega uma conex�o da classe
		Connection connect = ConnectDatabse.getConnection();
		
		if (connect == null) {
			throw new SQLException("Falha ao conectar na base");
		}
		try {		
			try {
				//Valida o comando SQL
				sql = "delete from pessoa where id_geral = " + varIdGeral;
				
				//Executa o comando SQL
				stmt = connect.createStatement();
				int result = stmt.executeUpdate(sql);
				stmt.getConnection().commit();
				System.out.println("Delete: " + result);				
			}
			catch (SQLException ex) {
				stmt.getConnection().rollback();
				throw new SQLException("Erro ao Excluir o produto! \n" + ex.getMessage());
			}						
		}
		finally {
			ConnectDatabse.closeConnection(connect, stmt);
			if (connect != null)
				connect = null;
			if (stmt != null)
				stmt = null;	
		}
	}
	
	//Salva uma pessoa no banco de dados
	public void salvaPessoa(Pessoa varPessoa, boolean varNovoCadastro) throws SQLException {
		//Armazena o comando sql
		String sql = null;
		
		//Cria o Statement
		Statement stmt = null;

		//Cria o comando SQL
		//Verifica se o produto j� est� cadastrado na base
		if (varNovoCadastro) {				
			sql = "insert into pessoa values (" +	varPessoa.getIdGeral() + ", '" + 
													varPessoa.getNome() + " " + varPessoa.getSobreNome() + "', '" + 
													varPessoa.getRg() + "', '" +
													varPessoa.getDataNasc().toString() + "');";
		}
		else
		{
			sql = 	"update pessoa set nome = '" +	varPessoa.getNome() + " " + varPessoa.getSobreNome() + "', " + 
					"rg = '" +						varPessoa.getRg() + "', " +
					"data_nasc = '" +				varPessoa.getDataNasc().toString() + "' where id_geral = " + varPessoa.getIdGeral();			
		}	
		
		//Pega uma conex�o da classe
		Connection connect = ConnectDatabse.getConnection();
		try {
			try {
				stmt = connect.createStatement();
				int result = stmt.executeUpdate(sql);
				stmt.getConnection().commit();
				System.out.println("Insert/Update: " + result);
			}
			catch (SQLException ex) {
				stmt.getConnection().rollback();
				throw new SQLException("Erro ao Salvar a Pessoa! \n" + ex.getMessage());			
			}			
		}
		finally {
			ConnectDatabse.closeConnection(connect, stmt);
			if (connect != null)
				connect = null;
			if (stmt != null)
				stmt = null;	
		}		
	}
}
