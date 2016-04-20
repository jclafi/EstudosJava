package dataBase;

import classesBasicas.Pessoa;
import dataBase.PessoaDb;

import java.sql.SQLException;
import java.util.List;
import java.util.Date;


public class TestaPessoaDb {
	
	public static void main(String[] args) {		
		
		TestaPessoaDb objInterface = new TestaPessoaDb();
		try {
			//Persiste pessoa no banco de dados
			objInterface.cadastraPessoa(0, true);
			
			//Atualiza pessoa no banco de dados
			objInterface.cadastraPessoa(0, false);			
			
			//Apaga a pessoa recêm cadastrada
			objInterface.apagaPessoaZero(); 
			
			//Cria a nova pessoa da sequência
			objInterface.cadastraPessoa(-1, true);
		
			//Lista na tela uma pessoa consultada
			objInterface.listaTelaPessoa();
			
			//Lista na tela todas as pessoas - Com Collection e Generics
			//Parâmetro true: for comum para listar os dados
			objInterface.listaTodasPessoas(true);
			
			//Parâmetro true: EnhencedFor para listar os dados
			objInterface.listaTodasPessoas(false);			
			
			//Cadastra as pessoas que serão excluídas
			objInterface.cadastraPessoa(10, true);
			objInterface.cadastraPessoa(11, true);

			//Apaga duas pessoas usando PreparedStatement
			objInterface.apagaPreparedStatement(10, 11);			
		}
		finally {
			if (objInterface != null)
				objInterface = null;				
		}
		
		System.gc();
		System.exit(0);
	}
	
	public void apagaPreparedStatement(long varPessoaA, long varPessoaB) {
		PessoaDb objPersistente = new PessoaDb();
		try {
			try {
				int intTotalPessoas = objPersistente.excluiPreparedStatement(varPessoaA, varPessoaB);
				System.out.println("Total de Pessoas Removidas: " + intTotalPessoas);
			}
			catch (SQLException ex) {
				System.out.println("Exceção no PreparedStatemet: " + ex.getMessage());
				ex.printStackTrace();
			}
		}
		finally {
			if (objPersistente != null)
				objPersistente = null;
		}		
	}
	
	public void cadastraPessoa(long varNumPessoa, boolean varNovoCadastro) {
		//Valida a data para o cadastro da pessoa
		Date data = new Date();		
		
		//Persiste a pessoa no banco de dados
		PessoaDb objPersistente = new PessoaDb();
		try {
			try {
				Pessoa objPessoa = new Pessoa((varNumPessoa > -1) ? varNumPessoa : objPersistente.getPessoaPk(), "123789", "Toledo Amaral", "Teste", data, Pessoa.TipoPessoa.PESSOA_FISICA);				
				objPersistente.salvaPessoa(objPessoa, varNovoCadastro);
			}
			catch (SQLException ex) {
				System.out.println("Exceção ao Salvar os Dados! \n" + ex.getMessage());
				ex.printStackTrace();
			}			
		}
		finally {
			if (objPersistente != null)
				objPersistente = null;
			if (data != null)
				data = null;
		}		
	}
	
	public void apagaPessoaZero() {
		//Apaga a pessoa de código 0 da Base de Dados
		PessoaDb objPersistente = new PessoaDb();
		try {
			try {
				objPersistente.excluiPessoa(0);
			}
			catch (SQLException ex) {
				System.out.println("Exceção ao Excluir o Produto! \n " + ex.getMessage());
			}
		}
		finally {
			if (objPersistente != null)
				objPersistente = null;
		}		
	}
	
	public void listaTelaPessoa() {
		//Mostra na tela uma Pessoa consultada da base de dados
		//Cria objeto que irá consultar a pessoa
		PessoaDb objPersistente = new PessoaDb();
		try {
			try {
				//Cria o objeto que irá carregar a consulta de pessoa
				Pessoa objPessoa3 = objPersistente.getPessoa(1);
				try {
					if (objPessoa3 != null)
						System.out.println("Dados de Pessoas de ResultSet: \n" + objPessoa3.getNome() + "\n" + objPessoa3.getRg() + "\n" + objPessoa3.getDataNasc("") );
				}
				finally {
					if (objPessoa3 != null)
						objPessoa3 = null;
				}
			}				
			catch (SQLException ex) {
				System.out.println("Exceção ao consultar Pessoa: " + ex.getMessage());
			}			
		}
		finally {
			if (objPersistente != null)
				objPersistente = null;			
		}	
	}	
	
	public void listaTodasPessoas(boolean varEnhancedFor) {
		//Monstra na tela todas as pessoas cadastradas na base de dados
		//Cria objeto que irá consultar a pessoa
		PessoaDb objPersistente = new PessoaDb();
		try {
			try {
				//Cria o objeto que irá carregar a consulta de pessoa			
				List<Pessoa> pessoas = objPersistente.getTodasPessoas();				
				if (! varEnhancedFor) {
					System.out.println("==============================================");
					//For comum
					for (int index = 0; index < pessoas.size(); index++) {
						Pessoa posicaoPessoa = pessoas.get(index);				
						System.out.println("For Comum Lista de Pessoas: " + posicaoPessoa.getNome() + "-RG: " + posicaoPessoa.getRg() + " - INDEX" + index);
					}
					System.out.println("==============================================");					
				}
				else {
					System.out.println("==============================================");					
					//Enhenced For
					for (Pessoa index : pessoas) {
						System.out.println("Enhanced For Lista de Pessoas: " + index.getNome() + "-RG: " + index.getRg());
					}
					System.out.println("==============================================");					
				}
				if ((pessoas != null) && (pessoas.size() > 0))
					pessoas = null;				

				objPersistente.listaTodasPessoas("nome");			
			}
			catch (SQLException ex) {
				System.out.println("Erro ao consultar as pessoas! " + ex.getMessage());
			}
		}
		finally {		
			if (objPersistente != null)
				objPersistente = null;
		}	
	}
}
