package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Vector;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Vector[] vect = new Vector[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			int aux = i;
			i = room;
			vect[i] = new Vector(name, email, room);
			i = aux;
			
		//	int room = sc.nextInt();
		//	vect[room] = new Vector(name, email);
		}
						
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.printf("%d: %s, %s%n", vect[i].getRoom(), vect[i].getName(), vect[i].getEmail());
				
			//	System.out.println(i + ": " + vect[i]); 					// para Vector contendo apenas name e email
			}
		}
		
		sc.close();

	}

}
