package application;

public class Program {

	public static void main(String[] args) {

		String [] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println("-------------");
														// Leitura desse for:
		for (String obj : vect) {						// "para cada objeto 'obj' contido em vect, faça:"
			System.out.println(obj);						// Chamar obj nesse for tem o mesmo resultado que
		}													// chamar vect[i] no for acima
	}

}
