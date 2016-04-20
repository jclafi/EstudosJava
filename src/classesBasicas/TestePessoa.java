package classesBasicas;

import java.util.Date;

public class TestePessoa {

	public static void main(String[] args) {
		//Criar uma instência da Classe Pessoa
		//Pode-se passar os parâmetros pelo contrutor ou set´s
		String [] telefones = { "96107070", "32063937"};
		Date varData = new Date();
		Pessoa objPessoa = new Pessoa("123456", "Julio Cesar", "Ledo", varData, telefones, Pessoa.TipoPessoa.PESSOA_FISICA);
		Pessoa objPessoa2 = new Pessoa("123456", "Julio", "Ledo", varData, telefones, Pessoa.TipoPessoa.PESSOA_FISICA);		
		
		if ((objPessoa != null) && (objPessoa2 != null))
			System.out.print("objPessoa 1 e 2 diferente de null \n\n");
		
		//Via Collections testa o equals e hashCode
		if (objPessoa.equals(objPessoa2) && (objPessoa.hashCode() == objPessoa2.hashCode()))
			System.out.println("Objetos iguais");
		else
			System.out.println("Objetos diferentes");		
		
		//objPessoa.setNome("Julio Cesar");
		//objPessoa.setSobreNome("Ledo Amaral Filho");
		//objPessoa.setDataNasc("30/11/1980");
		//objPessoa.setRg("12345678");		
		//objPessoa.setTelefones(telefones);
		
		System.out.println("Nome: " + objPessoa.getNome() + objPessoa.getSobreNome());
		System.out.println("Data Nasc: " + objPessoa.getDataNasc());
		System.out.println("Registro Geral: " + objPessoa.getRg());
		System.out.print("\n");
		//Teste  de Polimorfismo
		objPessoa.imprimeDadosPesssoa();
		System.out.print("=============\n");
		//Teste  de Polimorfismo		
		objPessoa.imprimeDadosPesssoa(22);

		objPessoa = null;
		System.gc();
		System.exit(0);
	}

}