package classesbasicas;

public class TestePessoaBlocoConstrutor {

	public static void main(String[] args) {		
		PessoasBlocoConstrutor objPessoa = new PessoasBlocoConstrutor();
		PessoasBlocoConstrutor objPessoa2 = new PessoasBlocoConstrutor();		
		
		objPessoa.setNome("Julio Cesar");
		objPessoa.setSobreNome("Ledo Amaral Filho");
		objPessoa.setDataNasc("30/11/1980");
		objPessoa.setRg("12345678");
		String[] arrayTelefone = {"9610 7070", "3206 3937"};
		objPessoa.setTelefones(arrayTelefone);
		objPessoa.imprimeDadosPesssoa(5);
		
		PessoasBlocoConstrutor.EXPECTATIVA_VIDA = 76;
		
		objPessoa2.setNome("Julio Cesar");
		objPessoa2.setSobreNome("Ledo Amaral Filho");
		objPessoa2.setDataNasc("30/11/1980");
		objPessoa2.setRg("12345678");
		objPessoa2.setTelefones(arrayTelefone);
		objPessoa2.imprimeDadosPesssoa(5);
		
		objPessoa.setNome("Julio Cesar");
		objPessoa.setSobreNome("Ledo Amaral Filho");
		objPessoa.setDataNasc("30/11/1980");
		objPessoa.setRg("12345678");
		objPessoa.setTelefones(arrayTelefone);
		objPessoa.imprimeDadosPesssoa(5);
		
		
		objPessoa = null;
		objPessoa2 = null;		
		
		System.gc();
		
		System.exit(0);
	}

}
