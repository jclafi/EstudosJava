package classesBasicas;
public class ControleFLuxo {

	public static void main(String[] args) {
		int intTeste1 = 5;
		int intTeste2 = 6;
		
		//A expressão avalida no IF deve sempre estar entre parênteses
		if (intTeste1 >= intTeste2)
		{
			System.out.println("Teste1 Maior Igual");
		}
		else
			System.out.println("Teste1 Menor");
		
	    if (intTeste1 == intTeste2)
	    	System.out.println("IntTeste1 = Inteteste2");
	    else
	    	System.out.println("IntTeste1 != Inteteste2");
	    
    	System.out.println("\n");	    
		
	    //switch / case - Se aplica para char - byte - short - int - enum. Sempre dentro de parênteses como no IF
	    //Se encontra uma opção verdadeira continua a executar. Utilizar break para finalizar
	    int IntSwitch = 3;	    
	    switch (IntSwitch) { 
	    	case 1 : {  System.out.println("Switch 1"); break;  }
	    	case 2 : System.out.println("Switch 2"); break;	    	
	    	case 3 : System.out.println("Switch 3"); break;
	    	case 4 : System.out.println("Switch 4"); //break; Se entrar sem o break, continua e passa pelo default
	    	default : System.out.println("Switch  Default");
	    }
	    
	    //while utilizando pós incremento, cuidado para não colocar ; no final da condição do while, o loop será infinito, não entra no { -- }. Ex.: while (intWhile < 10);
	    //Primeiro testa a condição, depois executa o comando no laço
	    int intWhile = 0;
	    while (intWhile <= 10) 
	    {
	    	System.out.println("While = " + intWhile++);
	    }
	    
	    System.out.println("\n");
	    //do while
	    //Primeiro executa o laço (sempre executa pelo menos uma vez), depois testa a condição
	    intWhile = 0;
	    do 
	    {
	    	System.out.println("Do While = " + intWhile++);	    	
	    }
	    while (intWhile <= 10);
	    
	    //Lógica do FOR
	    // DECLARA O ÍNDICE QUE PERCORRE O ARRAY
	    // DEFINE A CONDIÇÃO DE USO DO ARRAY
	    // DEFINE O TIPO DE INCREMENTO DO ARRAY
	    
	    //Comando FOR, pode-se criar a variável dentro do FOR
	    //Comando FOR com uma condição
	    int intLimit = 10;
	    for (int intFor = 0; intFor < intLimit; intFor++) 
	    {
	    	System.out.println("For = " + intFor);	
	    }
	    
	    //Comando For com duas condições
	    for (int intFor2 = 0, intFor3 = 10; intFor2 < intFor3; intFor2++, intFor3--)
	    {
	    	System.out.println("For Dupla condição " + intFor2 + " - " + intFor3);
	    }
	    
	    //EXERCÍCIOS APOSTILA 
	    //String sexoPorExtenso = sexo == 'M' ? "masculino" : "feminino"; - Operador Ternário
	    String sexoPorExtenso = ("F");
	    if ((sexoPorExtenso == ("M")) && (sexoPorExtenso instanceof String))
	    	System.out.println("IF => Masculino");
	    else
	    {
	    	if ((sexoPorExtenso == ("F")) && (sexoPorExtenso instanceof String))
	    		System.out.println("IF => Feminino");
	    }
	    
	    //Equals String
	    if (sexoPorExtenso.equals("F")) 
	    	System.out.println("IF => Feminino");
	    else
	    	System.out.println("IF => Masculino");
	    
	    //Equals object
	    if (sexoPorExtenso.equals(sexoPorExtenso)) 
	    	System.out.println("IF => Feminino");
	    else
	    	System.out.println("IF => Masculino");	    
	    
	    int intTeste = 4;
	    if ((intTeste == 1) || (intTeste %2 == 0)) {
	    	System.out.println("Verdadeiro");	    	
	    }
	    else
	    {
	    	System.out.println("False");	    	
	    }
	    
	    String strSexo = "F";
	    strSexo = ((sexoPorExtenso == "M") ? "Masculino" : "Feminino"); 
	    System.out.println("Ternário => " + strSexo);
	    
	    strSexo = "M";
	    strSexo = ((sexoPorExtenso.equals(strSexo)) ? "Igual" : "Diferente"); 
	    System.out.println("Ternário => " + strSexo);	    
	    
	    System.gc();
	    System.exit(0);
	}

}
