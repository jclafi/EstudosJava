package hibernateCfgClass;

import org.hibernate.*;

import hibernateCfgClass.HbmSessionFactory;

class TesteHB {

      public static void main(String[] args) {

          //Cria objeto Endere�o
    	  Endereco endereco = new Endereco();
          endereco.setCodigo(555);
          endereco.setRua("Av. Get�lio Vargas");
          endereco.setCidade("Feira de Santana");
          endereco.setEstado("BA");
          endereco.setCep("4419999");
          endereco.setLatitude(1.5f);
          endereco.setLongitude(2.5f);
          
          //Cria o objeto Pessoa
          Pessoa pessoa = new Pessoa();
          pessoa.setIdGeral(555);
          pessoa.setRg("5.532.555-99");
          pessoa.setNome("Julio Cesar");
          pessoa.setSobreNome("Ledo Amaral");
          pessoa.setMail("jclafi@gmail.com");          
          
          //Array de Objetos
          Object[] arrayObject = {endereco, pessoa}; 

          //Cria Objeto Factory - Deve-se fazer essa cria��o somente uma vez !
          SessionFactory factory = HbmSessionFactory.factory(arrayObject);
          
          //Cria sess�o do Hibernate e Transaction
          Session session = null;
          Transaction tx = null;

          //Insere o Objeto Pessoa e Endere�o no PosgtreSQL
          try {

        	  session = factory.openSession();

        	  tx = session.beginTransaction();

        	  //Persiste objetos Pessoa e Endere�o
        	  session.persist(endereco);        	  
        	  session.persist(pessoa);        	  

        	  tx.commit();

          } catch (Exception ex) {

        	  if (tx != null) tx.rollback();
        	  System.out.println("Transa��o falhou: " + ex.getMessage());
        	  ex.printStackTrace();

          } finally {

        	  //Fecha a Sess�o
        	  session.close();
        	  //Destroi Objetos
        	  session = null;
        	  tx = null;
        	  
        	  pessoa = null;
        	  endereco = null;        	  
          }
          
          //Remove o Objeto Pessoa a Endere�o no PostgreSQL
          try {
        	  session = factory.openSession();
        	  
        	  tx = session.beginTransaction();
        	  
        	  //Remove a Pessoa Cadastrada
        	  pessoa = (Pessoa) session.get(Pessoa.class, 555l);        	  
        	  if (pessoa != null)
        		  session.delete(pessoa);
        	  
        	  //Remove o endere�o cadastrado
        	  endereco = session.get(Endereco.class, 555);
        	  if (endereco != null)
        		  session.delete(endereco);
        	  
        	  tx.commit();
          }
          catch (Exception ex) {
        	  if (tx != null) tx.rollback();
        	  System.out.println("Transa��o falhou: " + ex.getMessage());
        	  ex.printStackTrace();
          }
          finally {
        	  //Fecha a Sess�o
        	  session.close();
        	  //Destroi Objetos
        	  session = null;
        	  tx = null;        	  
          }

    	  factory.close();
    	  
    	  System.gc();
    	  System.exit(0);
      }     
}

