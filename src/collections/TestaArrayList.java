package collections;

public class TestaArrayList {
	
	public static void testaArrayList() {
		
		ClasseArrayList objArrayList = new ClasseArrayList();
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
