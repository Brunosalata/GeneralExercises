package application;

public class Program {

	public static void main(String[] args) {

		/*
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
*/
		
		int x = 20;
		
		Integer obj = x;									//	se a vari�vel fosse da wrapper class de int (Integer), o casting (int) na linha 25
															// n�o seria mais necess�ria
		System.out.println(obj);							
		
		//int y = obj;										
		int y = obj * 2;
		
		System.out.println(y);

	}

}
