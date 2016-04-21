package classesbasicas;
public class ClasseVariaveis {
	public static void main(String[] args) {

		
		//BYTE LIMIT 127 + -
		byte varByte = 127;
		System.out.println(" byte varByte =>" + varByte);
		
		//SHORT
		short varShort = (short) 32767;
		System.out.println(" short varByte =>" + varShort);
		
		//INTEGER COM LINE BREAK AND CAST
		int varInt = (int) 999999;
		System.out.println(" \n int varInt =>" + varInt);
		
		long varLong = 666555888;
		System.out.println(" long varLong =>" + varLong);
		
		float varFlot = 1.5f;
		System.out.println(" long varFloat =>" + varFlot);		
		
		double varDouble = (double) 1.99d;
		System.out.println(" long varDouble =>" + varDouble);
		
		char varChar = 'E';
		System.out.println(" char varChar =>" + varChar);
		
		/**Modelos de char
		 * 
		 * \n : Nova Linha
		 * \f : Nova Página
		 * \r : Retorno
		 * \´ : Aspas Simples
		 * \t : Tabulação
		 * \" : Aspas Duplas
		 * \b : Backspace
		 * \- : Barra Invertida 
		 * 
		 */	

		varChar = '\u0001';
		System.out.println("\n char varChar =>" + varChar);
		
		boolean varBol = false;
		System.out.println("\n boolean varBol =>" + varBol);
		
		boolean varBol2 = !varBol;
		System.out.println("\n boolean varBol =>" + varBol2);
		
		String strTeste = (String) "STR";
		System.out.println(" strTeste =>" + strTeste);
		
		/**
		 Prefixo 0x ou 0X
		 De 0-9 equivalem aos mesmos em Decimal
		 Letras de A-F equiparam aos decimais 10-15.
		 Hexadecimal - Base é 16		 
		*/
		int hexValue0 = 0x1;  	// De 0 - 9 é Decimal		
		int hexValue1 = 0X10; 	// 1 HexaDecimal (16)
		int hexValue11 = 0x11; 	// 1 HexaDecimal (16) + (1)		 
	    int hexValue2 = 0x20; 	// 2 HexaDecimal (32)
	    int hexValue3 = 0x30; 	// 3 HexaDecimal (48)
	    int hexValue4 = 0x40; 	    
	    int hexValue5 = 0xA; 	// A que é (10)
	    int hexValue6 = 0x1A; 	// 1 HexaDecimal (16) + A que é (10) 	    
	    int hexValue7 = 0x2A; 	// 2 HexaDecimal (32) + A que é (10)	    
	    int hexValue8 = 0x8A; 	// 8 HexaDecimal (128) + A que é (10)	    
	    int hexValue9 = 0x8B; 	// 8 HexaDecimal (128) + B que é (11)	    
	    int hexValue10 = 0x1F; 	// 1 HexaDecimal (16) + F que é (15)
	    int hexValue12 = 0x24; 	// 2 HexaDecimal (32) + Decimal 4	    

	    System.out.println(" 0x1 = 1 => " + hexValue0);	    
	    System.out.println(" 0x10 = 16 => " + hexValue1);
	    System.out.println(" 0x11 = 17 => " + hexValue11);	    
	    System.out.println(" 0x20 = 32 => " + hexValue2);
	    System.out.println(" 0x30 = 48 => " + hexValue3);
	    System.out.println(" 0x40 = 64 => " + hexValue4);
	    System.out.println(" 0xA = 10 => " + hexValue5);	    
	    System.out.println(" 0x1A = 26 => " + hexValue6);	    
	    System.out.println(" 0x2A = 42 => " + hexValue7);	    
	    System.out.println(" 0x8A = 138 => " + hexValue8);	    
	    System.out.println(" 0x8B = 139 => " + hexValue9);	    
	    System.out.println(" 0x1F = 31 => " + hexValue10);	    
	    System.out.println(" 0x24 = 36 => " + hexValue12);	    
	    
		System.gc();
		System.exit(0);
	}
	//System.out.println("\n boolean varBol =>" + varBol2); variable not visible outside {} 
}

