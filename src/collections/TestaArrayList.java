package collections;

public class TestaArrayList {
	
	public static void testaArrayList() {
		
		ArrayListVector objArrayList = new ArrayListVector();
		try {
			objArrayList.testeArrayList();
		}
		finally {
			if (objArrayList != null)
				objArrayList = null;
		}
		
	}

	public static void main(String[] args) {
		
		testaArrayList();
		
		System.exit(0);
	}

}
